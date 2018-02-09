/** YouAreHere script by Juan M Uys (opyate@gmail.com)
Version 0.1
1. I'm trying to refrain from calling this "breadcrumbs"
because breadcrumbs is the trail you followed
to be where you are. YouAreHere shows your
location on the site regardless of how
you got there.
I don't want to re-implement your browser's
history feature, or the Back button - I just want
to show you where you are on a page.
2. This script assumes you use the following
convention for your site:
/a/index.html
/b/index.html
instead of
/a.html
/b.html

Thus, you should have a "landing page"
configured like index.php or index.html which is
what a client would see when going to a
directory on your server. The script chops the
landing page string off the URL string
to make the script easier.
This make this script "index-based" I guess.
3. Compatibility regarding Javascript String methods:
slice : added in Javascript 1.0 (http://docs.sun.com/source/816-6408-10/string.htm#1194366)
split : added in Javascript 1.1 (http://docs.sun.com/source/816-6408-10/string.htm#1194452) (not used)
substr : added in Javscript 1.0 (http://docs.sun.com/source/816-6408-10/string.htm#1194618)

This script should be Javascript1.0 compatible
and run on ancient browsers. Please let me know if
you find any other pitfalls.
*/

function YouAreHere () {
	// First some configuration options:

	// Specify your site's root folder on the host server
	// 	e.g. if you need to go to "www.example.com/some/where/mysite/" to
	// 	access your home page, then enter "some/where/mysite" below.
	// This will be omitted from the YouAreHere string
	// 	because you don't want your YouAreHere string
	// 	to look like this: "You are here >> some >> where >> mysite >> Home"
	//	but like this "You are here >> Home".
	var sSiteRoot   = ''; // ! omit beginning and end slashes

	// The character/image that seperates your locations.
	// e.g. ' <img src="arrow.gif" /> ' or ' - '
	var sSeperator = ' &gt;&gt; ';

	// Some literals - translate this into your required idiom.
	var sYouAreHere = "You are here";
	var sHome = "Home";	

	// now, the code
	var sFullURL = location.href;

	// sanity check 1:
	// AFAIK all client browsers add a trailing / automatically if
	// the entered URL is a directory instead of a file (see above).
	// If it is a file, there won't be a trailing /, AND we
	// want to remove the trailing file name e.g. index.html
	if (sFullURL.substring(sFullURL.length - 1, sFullURL.length) != "/") {
		// reverse te string, then take the first indexof /
		// which will give us the length we want to chop off at the end
		var sTempFullURL = "";
		var i = sFullURL.length;
		for (; i > 0; i--) {
			sTempFullURL += sFullURL.substring(i - 1, i);
		}

		sFullURL = sFullURL.substring(0, sFullURL.length - sTempFullURL.indexOf("/"));
	}

	// extract the protocol, e.g. "http://" or "https://" from the URL string
	var sProtocol = sFullURL.substring(0, sFullURL.indexOf("://") + 3); // 3 for "://"

	// and then remove the protocol
	var sURLWithoutProtocol = sFullURL.slice(sProtocol.length ,sFullURL.length);
	//alert("IN: sURLWithoutProtocol: " + sURLWithoutProtocol + "\nsFullURL: " + sFullURL);

	// sanity check 2:
	// to avoid future problems, remove redundant slashes
	// where there are 2+ together, reduce to 1
	{

		// extract pieces between slashes, and build a
		// completely new string
		var sTemp = "";
		while (sURLWithoutProtocol.length > 0) {
			if (sURLWithoutProtocol.indexOf("/") > 0) {
				sTemp += sURLWithoutProtocol.substring(0, sURLWithoutProtocol.indexOf("/")) + "/";
				sURLWithoutProtocol = sURLWithoutProtocol.slice(sURLWithoutProtocol.substring(0, sURLWithoutProtocol.indexOf("/")).length, sURLWithoutProtocol.length);
			} else {
				// This clause will happen if the URL string DOES NOT end with a /
				// This shouldn't happen because the landing page has
				// been chopped off the URL string (e.g. index.html)
				// and subsequently the URL string DOES end with a /
				sTemp += sURLWithoutProtocol;
				sURLWithoutProtocol = "";
				//alert("This should pop up once if the URL ended with a file instead a slash");
			}
			//alert("1: sTemp: " + sTemp);
			//alert("2: sURLWithoutProtocol: " + sURLWithoutProtocol);
			if (sURLWithoutProtocol.length > 0) {
				while (true) {
					// if the first character is a /
					if (sURLWithoutProtocol.substring(0, 1) == "/") {
						// then chop it off
						//var sDebugMessage = "Removing slash:\nbefore: sURLWithoutProtocol: " + sURLWithoutProtocol;
						sURLWithoutProtocol = sURLWithoutProtocol.slice(1, sURLWithoutProtocol.length);
						//alert(sDebugMessage + "\nafter: sURLWithoutProtocol: " + sURLWithoutProtocol);
					} else {
						// else go on
						break;
					}
				}
			} else {
				break;
			}
		}
		//alert("and finally sTemp : " + sTemp)
		// and restore the original multi-slash-free string
		sURLWithoutProtocol = sTemp;
	}
	// if sURLWithoutProtocol had double+ slashes, fix the original URL
	// comment the line below if you don't want to fix the URL. YouAreHere will still work.
	sFullURL = sProtocol + sURLWithoutProtocol;
	//alert("OUT: sURLWithoutProtocol: " + sURLWithoutProtocol + "\nsFullURL: " + sFullURL);
	// extract "www.example.com" from the URL string, i.e. the domain
	var sDomain = sURLWithoutProtocol.substring(0, sURLWithoutProtocol.indexOf("/"));

	// counter intuitively we put it all back together again
	var sHomeURL = sProtocol + sDomain + "/" + sSiteRoot;

	// extract the "you/are/here/" from "www.example.com/some/where/mysite/you/are/here/"
	// or the "you/are/here/file.html" from "www.example.com/some/where/mysite/you/are/here/file.html",
	// depending on what the client entered.
	var sNaviString = '';
	if (sSiteRoot.length > 0) {
		sNaviString = sURLWithoutProtocol.substring(sDomain.length + 1 + sSiteRoot.length + 1 , sURLWithoutProtocol.length);
	} else {
		sNaviString = sURLWithoutProtocol.substring(sDomain.length + 1 , sURLWithoutProtocol.length);
	}
	
	//alert("original sNaviString: " + sNaviString);

	var sOutputHTML = "";
	//sOutputHTML += '<div class="youarehere">';
	sOutputHTML += sYouAreHere + " " + sSeperator + '<a href="' + sHomeURL + '">' + sHome + '</a>' + " ";

	while (sNaviString) {
		if (sNaviString) sOutputHTML += sSeperator;
		var sHyperlinkText = sNaviString.substring(0, sNaviString.indexOf("/"));
		sNaviString = sNaviString.substring(sNaviString.indexOf("/") + 1, sNaviString.length);
		sOutputHTML += '<a href="' + sFullURL.substring(0, sFullURL.length - sNaviString.length) + '">' + sHyperlinkText + '</a>';
	}

	//sOutputHTML += '</div>';

	var youarehereTag;

	// some Object detection before we write the YouAreHere string to our tag
	// test for the 3 Big Ones
	// kudos to http://www.quirksmode.org/js/layerwrite.html
	if (document.getElementById) { //tested
		//1: Level 1 DOM (Mozilla, Explorer 5+, Opera 5+, Konqueror, Safari, iCab, Ice, OmniWeb 4.5) 
		youarehereTag = document.getElementById('youarehere');
		youarehereTag.innerHTML = ''; //to circumvent a bug in Explorer 5.1 and higher on Mac (but not in 5.0)
		youarehereTag.innerHTML = sOutputHTML;
	} else if (document.all) { //tested only with IE6.0.2_SP2 because of backwards compatability with document.all
		//2: document.all (Explorer 4+, Opera 6+, iCab, Ice, Omniweb 4.2-) 
		youarehereTag = document.all['youarehere'];alert("doc.all");
		youarehereTag.innerHTML = sOutputHTML;
	} else if (document.layers) { //not tested, and I don't really care about NS4, besides, my youarehere DIV is position:relative
		//3: document.layers (Netscape 4, Ice, Escape, Omniweb 4.2-) 
		// Please note, for Netscape4 you need to make youarehereTag position:absolute
		youarehereTag = document.layers['youarehere'];
		youarehereTag.document.open();
		youarehereTag.document.write('<p class="youarehere">' + sOutputHTML + '</p>');
		youarehereTag.document.close();
	}
	//document.write(sOutputHTML);

	// optional: implement some code to rewrite the URL if the user entered multi-slash junk...
}

// call the following from the body.onload function, or where-ever.
// YouAreHere();

