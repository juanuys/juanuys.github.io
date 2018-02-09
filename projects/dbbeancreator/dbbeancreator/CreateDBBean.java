package dbbeancreator;           
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

/** 
 *
 * @author Tinus Rautenbach
 * @author  Juan Uys
 * @version 0.1
 *
 * TODO:
 *  implement:
 *      public void store() 
 */
public class CreateDBBean extends HttpServlet {
   
    /** Initializes the servlet.
    */  
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    /** Destroys the servlet.
    */  
    public void destroy() {

    }

    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {
        response.setContentType("text/html");
        java.io.PrintWriter out = response.getWriter();
        
        doMain(request, out);
        
    } 

    /** Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {
        processRequest(request, response);
    } 

    /** Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {
        processRequest(request, response);
    }

    /** Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    

    //public void doMain(boolean bAllTables, String sTable, String sDbName, String sJavaObjectNamePrefix, String sJavaObjectName, String sJavaObjectNamePostfix, String sPackage){
    public void doMain(HttpServletRequest request, java.io.PrintWriter out) {
        try{
            
            // the main decisive factors... files, page, or both
            boolean bCreateSourceFiles = request.getParameter("createsourcefiles").equals("true") ? true : false;
            boolean bWriteSourcePage = request.getParameter("writesourcepage").equals("true") ? true : false;

            // use sTableName for one table specified, or all
            boolean bAllTables = request.getParameter("alltables").equals("true") ? true : false;

            String sTableName = request.getParameter("table").trim();
            String sDbName = request.getParameter("dbname").trim();
            String sObjectNamePrefix = request.getParameter("objectname_prefix").trim();
            String sObjectName = request.getParameter("objectname").trim();
            String sObjectNamePostfix = request.getParameter("objectname_postfix").trim();
            String sPackageName = request.getParameter("stpackage").trim();
            String sFilesLocation = request.getParameter("fileslocation").trim();
            if (!sFilesLocation.endsWith("/")) {
                sFilesLocation += "/";
            }
            

            // the SQL statement for this method's queries
            Statement sqlStatement = getSQLStatement(sDbName);
            
            // the table(s) for which we generate code
            Vector vecTables = new Vector();

            // populate the tables vector
            if (bAllTables) { // if user specified all tables
                ResultSet rs = sqlStatement.executeQuery("show tables");
                
                while (rs.next()) {
                    vecTables.addElement(new String (rs.getString(1)));
                }
                
            } else { // if user specified one table
                vecTables.addElement(sTableName);
            }
            
            // finally, generate the code
            
            String sTheTable = "";
            String sJavaObjectNameFull = "";
            String sBeanCode = "";
            out.print("<html><body>");
            while (!vecTables.isEmpty()) {
                // TODO : tables.remove(0).toString() -> make this cleaner
                sTheTable = vecTables.remove(0).toString();
                sJavaObjectNameFull = sObjectNamePrefix + firstLettertoUpper(sTheTable) + sObjectNamePostfix;
                sBeanCode = getBeanCode(sTheTable, sqlStatement, sJavaObjectNameFull, sPackageName, sDbName);
                
                // once we have the bean code, decide what to do with it
                
                // write the source to file
                if (bWriteSourcePage) {
                    out.print("<pre>");
                    out.print(sBeanCode);
                    out.print("</pre><hr>");
                }
                
                //write the source to page
                if (bCreateSourceFiles) {
                    String sFileName = sFilesLocation + sJavaObjectNameFull + ".java";
                    createBeanSourceFile(sBeanCode, sFileName);
                }
                
            }
            out.print("</body></html>");
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    } 
    
    public String getBeanCode(String table, Statement stm, String JavaObjectName, String stpackage, String dbname) {
        String ret = "";
        try {
            ResultSet rs = stm.executeQuery("select * from " + table);
            ResultSetMetaData rsm = rs.getMetaData();
            int cnt = rsm.getColumnCount();
            String retget = "";
            String retset = "";
            String retcons = "";
            String retdef = "";
            String retmap = "";
            String retdba = "";
            String pkdbfieldname = "";
            String pkIdFieldName = "pk_" + table + "_id";
            // FIXME : we assume the first column is the auto-increment value,
            // which it is 99% of the time
            boolean bMySqlAutoIncrement = rsm.isAutoIncrement(1);
            String sMySqlAutoIncrement = bMySqlAutoIncrement ? "true" : "false";
            for (int i = 1; i <= cnt; i++){
                String fieldname =  dbColnameToObjFieldname(rsm.getColumnLabel(i));
                if(fieldname.equals(pkIdFieldName))
                    pkdbfieldname = rsm.getColumnLabel(i);
                String fieldtype = dbColTypetoJavaType(rsm.getColumnTypeName(i));

                retget = retget + getGet(fieldname,fieldtype) + "\n";
                retset = retset + getSet(fieldname,fieldtype) + "\n";
                retcons = retcons + getCons(fieldname,fieldtype) + "\n";
                retdef  = retdef + getDef(fieldname,fieldtype) + "\n";
                retmap  = retmap + getMap(fieldname,fieldtype,rsm.getColumnLabel(i)) + "\n";
                if (!fieldname.equals(pkIdFieldName)){
                    retdba = retdba + getDbaccess(fieldname,fieldtype,JavaObjectName);
                }
            }

            ret = "package " + stpackage + "; \n";
            ret =  pln(ret,"import java.io.*;");
            ret =  pln(ret,"import org.gjt.tw.dbobjects.*; // http://dbobjects.sourceforge.net");
            ret =  pln(ret,"import java.util.*;");
            ret =  pln(ret,"import java.lang.*;");
            ret =  pln(ret,"import java.beans.*;");
            ret =  pln(ret,"import java.sql.*;");
            ret =  pln(ret,"\n");

            ret =  pln(ret,"/**");
            ret =  pln(ret,"*");
            ret =  pln(ret,"* @author  Juan M Uys");
            ret =  pln(ret,"* @version 0.01");
            ret =  pln(ret,"*/");

            ret =  pln(ret,"public class " + JavaObjectName + " extends StorableObject implements java.io.Serializable {");
            ret =  pln(ret,"    private PropertyChangeSupport propertySupport;");
            ret =  pln(ret,"    private static ObjectMapping mapping;");
            ret =  pln(ret,retdef);
            
            ret =  pln(ret,"    public "+ JavaObjectName+"() {");
            ret =  pln(ret,"        super(); ");
            ret =  pln(ret,retcons );
            ret =  pln(ret,"        propertySupport = new PropertyChangeSupport ( this );");
            ret =  pln(ret,"    }\n");


            ret =  pln(ret,"    protected ObjectMapping getMapping() {");
            ret =  pln(ret,"        if (mapping == null)");
            ret =  pln(ret,"            mapping = new ObjectMapping ();");
            ret =  pln(ret,"        return mapping;");
            ret =  pln(ret,"    }\n");

            ret =  pln(ret,retget);
            ret =  pln(ret,retset);
            ret =  pln(ret,"    /**");
            ret =  pln(ret,"    * Initializes Db to Java Object Mapping.");
            ret =  pln(ret,"    * ");
            ret =  pln(ret,"    */");
            ret =  pln(ret,"    public static void init () throws ObjectException, IncompleteDefinitionException {");
            ret =  pln(ret,"        mapping = new ObjectMapping ();");
            ret =  pln(ret,"        mapping.setTableName (\""+table+"\");");
            ret =  pln(ret,"        mapping.setDatabaseName (\""+dbname+"\");");
            ret =  pln(ret,"        mapping.setObjectClass ("+JavaObjectName+".class);");
            ret =  pln(ret,retmap);
            ret =  pln(ret,"        mapping.setKeyField (\""+pkIdFieldName+"\");");
            ret =  pln(ret,"        mapping.useMySQLAutoIncrement ("+sMySqlAutoIncrement+");");
            ret =  pln(ret,"        mapping.prepareSQLStatements ();");
            ret =  pln(ret,"    }\n");

            ret =  pln(ret,"    public " + JavaObjectName + " [] getByWhereClause(String where) throws DatabaseException, ObjectException {");
            ret =  pln(ret,"        StorableObject [] objects = DBManager.getByWhereClause(mapping, where);");
            ret =  pln(ret,"        if (objects == null) {");
            ret =  pln(ret,"            return null;");
            ret =  pln(ret,"        } else {");
            ret =  pln(ret,"            return ("+JavaObjectName +" []) objects;");
            ret =  pln(ret,"        }");
            ret =  pln(ret,"    }\n");

            ret =  pln(ret,"    public int getMaxId() throws DatabaseException, ObjectException {");
            ret =  pln(ret,"        String ssql = \" " + pkdbfieldname + " = (select max(" + pkdbfieldname + ") from \" + mapping.getTableName() + \")\";");
            ret =  pln(ret,"        StorableObject[] objects = DBManager.getByWhereClause (mapping,ssql);");
            ret =  pln(ret,"        if (objects == null) {");
            ret =  pln(ret,"            return 0;");
            ret =  pln(ret,"        } else {");
            ret =  pln(ret,"            "+JavaObjectName+" to = ("+JavaObjectName+") objects[0];");
            ret =  pln(ret,"            return to.get"+firstLettertoUpper(pkdbfieldname)+"();");
            ret =  pln(ret,"        }");
            ret =  pln(ret,"    }\n");

            ret =  pln(ret,"    public "+JavaObjectName+" getById (String value) throws DatabaseException, ObjectException {");
            ret =  pln(ret,"        StorableObject[] objects = DBManager.getByField (mapping, \"id\", value);");
            ret =  pln(ret,"        if (objects == null) {");
            ret =  pln(ret,"            return null;");
            ret =  pln(ret,"        } else {");
            ret =  pln(ret,"            return ("+JavaObjectName+") objects[0];");
            ret =  pln(ret,"        }");
            ret =  pln(ret,"    }\n");

            ret =  pln(ret,"    public "+JavaObjectName+"[] getAll () throws DatabaseException, ObjectException {");
            ret =  pln(ret,"        StorableObject[] objects = DBManager.getAll (mapping);");
            ret =  pln(ret,"        if (objects == null) {");
            ret =  pln(ret,"            return null;");
            ret =  pln(ret,"        } else {");
            ret =  pln(ret,"            return ("+JavaObjectName+"[]) objects;");
            ret =  pln(ret,"        }");
            ret =  pln(ret,"    }\n");

            ret =  pln(ret,"    public "+JavaObjectName+"[] getAll ( String orderBy ) throws DatabaseException, ObjectException {");
            ret =  pln(ret,"        StorableObject[] objects = DBManager.getAll (mapping, orderBy );");
            ret =  pln(ret,"        if (objects == null) {");
            ret =  pln(ret,"            return null;");
            ret =  pln(ret,"        } else {");
            ret =  pln(ret,"            return ("+JavaObjectName+"[]) objects;");
            ret =  pln(ret,"        }");
            ret =  pln(ret,"    }\n");


            ret =  pln(ret,retdba);

            ret =  pln(ret,"    public boolean execute(String sql) throws org.gjt.tw.dbobjects.DatabaseException,java.sql.SQLException{");
            ret =  pln(ret,"        return DBManager.execute(mapping.getDatabaseName(),sql);");
            ret =  pln(ret,"    }\n");
            
            ret =  pln(ret,"    public java.sql.ResultSet executeQuery(String sql) throws org.gjt.tw.dbobjects.DatabaseException,java.sql.SQLException{");
            ret =  pln(ret,"        return DBManager.executeQuery(mapping.getDatabaseName(),sql);");
            ret =  pln(ret,"    }\n");

            ret =  pln(ret,"    public void addPropertyChangeListener (PropertyChangeListener listener) {");
            ret =  pln(ret,"        propertySupport.addPropertyChangeListener (listener);");
            ret =  pln(ret,"    }\n");

            ret =  pln(ret,"    public void removePropertyChangeListener (PropertyChangeListener listener) {");
            ret =  pln(ret,"        propertySupport.removePropertyChangeListener (listener);");
            ret =  pln(ret,"    }\n");


            ret =  pln(ret,"}");
        } catch (Exception e) {
            ret = e.toString();
        }
        return ret;
    }
    
    public Statement getSQLStatement(String dbname) {
        Statement sqlStatement = null;
        try {
            //Class.forName("org.postgresql.Driver");
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            //String db_driver = "org.postgresql.Driver";
            String db_driver = "com.mysql.jdbc.Driver";
            String server_ip = "127.0.0.1";
            String conn_type = "jdbc";
            String db_type = "mysql";
            //String db_port = "5432";
            String db_port = "3306";
            String db_uname = "opyatecms";
            String db_pass = "THEw0rld";
            String sConnection = conn_type + ":" + db_type + "://" + server_ip + ":" + db_port + "/" + dbname;
            System.out.println(sConnection);
            Connection conn = DriverManager.getConnection(sConnection, db_uname, db_pass);
            sqlStatement = conn.createStatement();
            
        } catch ( Exception e) {
            e.printStackTrace();
        }
        return sqlStatement;
    }
    
    public String dbColnameToObjFieldname(String dbFieldname) {
        String ret = "";
        /*if (dbFieldname.indexOf("pk_") >= 0) {
            ret = "id";
        } else if (dbFieldname.indexOf("fk_") >=0) {
            ret = dbFieldname.substring(3);
        } else {
            ret = dbFieldname;
        }*/
        
        //return ret;
        return dbFieldname;
    }
    
    /**
     * TODO
     * This method needs by far the most work.
     * More specific Java types should be used for the DB types
     */
    public String dbColTypetoJavaType(String dbFieldtype) {
        String ret = "";
        if (dbFieldtype.equals("int4") || dbFieldtype.equals("int2") ||  dbFieldtype.equals("numeric") || dbFieldtype.startsWith("BIGINT") || dbFieldtype.startsWith("INTEGER") || dbFieldtype.equalsIgnoreCase("enum")){
            ret = "int";
        } else if (dbFieldtype.equalsIgnoreCase("text") || dbFieldtype.equalsIgnoreCase("varchar") || dbFieldtype.equalsIgnoreCase("MEDIUMBLOB") || dbFieldtype.equalsIgnoreCase("char") || dbFieldtype.equalsIgnoreCase("tinyblob")) {
            ret = "String";
        } else if (dbFieldtype.equals("date")  ) {
            ret = "java.sql.Date";
        } else if (dbFieldtype.equals("timestamp") || dbFieldtype.equals("DATETIME") ) {
            ret = "java.util.Date";
        } else if (dbFieldtype.equals("bool") ) {
            ret = "boolean";
        } else if (dbFieldtype.equals("float") || dbFieldtype.equals("float8") || dbFieldtype.equals("float4")) {
            ret = "float";                  
        } else {
            ret = dbFieldtype;
        }
        return ret;
    
    }    

    public String pln(String stval ,String val) {
        return stval + val + "\n";
    }
    
    public String getJava(String [] fields,String [] fieldstype,String [] dbfields) {
        String ret = "";
        String retget = "";
        String retset = "";
        String retcons = "";
        String retdef = "";
        String retmap = "";
        String retdba = "";
        int i = 0;   
        while (i < fields.length) {
            if (!fields[i].equals("")) {
                retget = retget + getGet(fields[i],fieldstype[i]) + "\n";
                retset = retset + getSet(fields[i],fieldstype[i]) + "\n";
                retcons = retcons + getCons(fields[i],fieldstype[i]) + "\n";
                retdef  = retdef + getDef(fields[i],fieldstype[i]) + "\n";
                retmap  = retmap + getMap(fields[i],fieldstype[i],dbfields[i]) + "\n";
            }
            i++;
        }
        ret = retcons + "\n" + retget + "\n" + retset + "\n" + retdef + "\n" + retmap;

        return ret;
    }
    
    public String firstLettertoUpper(String field) {
        return field.substring(0,1).toUpperCase() + field.substring(1);
    }
    
    public String getDbaccess(String field,String fieldtype,String JavaObjectName) {
        String ret="";
        ret =  pln(ret,"    public "+JavaObjectName+" [] getBy"+firstLettertoUpper(field)+" (String value) throws DatabaseException, ObjectException {");
        ret =  pln(ret,"        StorableObject[] objects = DBManager.getByField (mapping, \""+field+"\", value);");
        ret =  pln(ret,"        if (objects == null) {");
        ret =  pln(ret,"            return null;");
        ret =  pln(ret,"        } else {");
        ret =  pln(ret,"            return ("+JavaObjectName+" []) objects;");
        ret =  pln(ret,"        }");
        ret =  pln(ret,"    }\n");

        ret =  pln(ret,"    public  "+JavaObjectName+" getByFirst"+firstLettertoUpper(field)+" (String value) throws DatabaseException, ObjectException {");
        ret =  pln(ret,"        StorableObject[] objects = DBManager.getByField (mapping, \""+field+"\", value);");
        ret =  pln(ret,"        if (objects == null) {");
        ret =  pln(ret,"            return null;");
        ret =  pln(ret,"        } else {");
        ret =  pln(ret,"            return ("+JavaObjectName+") objects[0];");
        ret =  pln(ret,"        }");
        ret =  pln(ret,"    }\n");
        
        return ret;
    }
    
    public String getGet(String field,String fieldtype) {
        String ret ="";
        ret = pln(ret,"    /**");
        ret = pln(ret,"    * Get Method for " + field + " property.");
        ret = pln(ret,"    * ");
        ret = pln(ret,"    * @return        the value of the "+ field +" property");
        ret = pln(ret,"    */");
        ret = ret +"    public " + fieldtype + " get";
        ret = ret + field.substring(0,1).toUpperCase() + field.substring(1);
        ret = pln(ret," () {");
        ret = pln(ret,"        return " + field + ";");
        ret = pln(ret,"    }");
        return ret;
    }
    public String getSet(String field,String fieldtype) {
        String ret ="";
        ret = pln(ret,"    /**");
        ret = pln(ret,"    * Set Method for " + field + " property.");
        ret = pln(ret,"    * ");
        ret = pln(ret,"    * @param  myval  the value to set the "+ field +" property of this class");
        ret = pln(ret,"    */");
        
        ret = ret + "    public void set";
        ret = ret + firstLettertoUpper(field);
        ret = pln(ret,"(" +fieldtype +" myval){");
        ret = pln(ret,"        " + field + "= myval;");
        ret = pln(ret,"    }");
        return ret;
    }
    
    public String getDef(String field,String fieldtype) {     
        String ret ="    /**";
        pln(ret,"    * Property of this class : " + field+ ".");
        pln(ret,"    */");
        ret = "    private " + fieldtype + " " +  field + ";" ;
        return ret;
    }
    
    public String getCons(String field,String fieldtype) {
        String ret ="       ";
        if (fieldtype.equals("int")) { 
            ret = "        "+field + " = 0;" ;
        } else if (fieldtype.equals("float")) {
            ret = "        "+field + " = 0;" ;
        } else if (fieldtype.equals("String")) {
            ret = "        "+field + " = \"\";" ;
        } else if (fieldtype.equals("java.sql.Timestamp")) {
            ret = "        "+field + " = new java.sql.Timestamp(101,0,1,0,0,0,0);" ;
        } else if (fieldtype.equals("java.sql.Date")) {
            ret = "        "+field + " = new java.util.Date(java.lang.System.currentTimeMillis());" ;
        } else {
            ret ="";
        }
        return ret;
    }
    
     public String getMap(String field,String fieldtype,String dbfield) {
        String ret ="";
        if (fieldtype.equals("int")) { 
            ret = "        mapping.addField (\"" + field + "\", Integer.TYPE,\"" + dbfield + "\");";
        } else if (fieldtype.equals("String")) {
            ret = "        mapping.addField (\"" + field + "\", String.class,\"" + dbfield + "\");";
        } else if (fieldtype.equals("java.sql.Timestamp")) {
            ret = "        mapping.addField (\"" + field + "\", java.sql.Timestamp.class,\"" + dbfield + "\");";
        } else if (fieldtype.equals("java.sql.Date")) {
            ret = "        mapping.addField (\"" + field + "\", java.sql.Date.class,\"" + dbfield + "\");";
        } else if (fieldtype.equals("boolean")) {
            ret = "        mapping.addField (\"" + field + "\", Boolean.TYPE,\"" + dbfield + "\");";
        } else if (fieldtype.equals("float")) {
            ret = "        mapping.addField (\"" + field + "\", Float.TYPE,\"" + dbfield + "\");";
        } else {
            ret = "        mapping.addField (\"" + field + "\", "+fieldtype+".class,\"" + dbfield + "\");";
        }
        return ret;
    }
     
    public void createBeanSourceFile(String sBeanCode, String sFileName) {
        File fileBeanSource;
        FileOutputStream out;
        PrintStream p;

        try {

            fileBeanSource = new File(sFileName);

            // always overwrite files if they exist
            if (fileBeanSource.exists()) {
            fileBeanSource.delete();
            }
            fileBeanSource.createNewFile();

            // mundane file io stuff
            // TODO : better error handling, check for permissions, etc
            out = new FileOutputStream(fileBeanSource);
            p = new PrintStream(out);
            p.print(sBeanCode);
            
            p.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
