---
title: "DB Bean Creator for Java and MySQL/PostgresQL"
description: "DB Bean Creator for Java and MySQL/PostgresQL"
date: 2002-05-30
og_image_url: "http://interhacker.files.wordpress.com/2011/12/dukewave1.png"
image: "http://interhacker.files.wordpress.com/2011/12/dukewave1.png"
image_content_type: "image/png"
layout: post
tags: [tech, java]
category: blog
---

I present the [DB Bean Creator for Java and MySQL/PostgresQL](/projects/dbbeancreator).

When you have finished designing your database, you start to code the beans to interface with it. Making changes to the DB means making changes to the beans. This is time consuming and costly.

The DB Bean Creator looks at your database (PostgresQL and MySQL are currently supported) and creates all the beans on the fly.

# What to do

Basically, create an HTML page with the following [form snippet](/projects/dbbeancreator/dbbeancreator/form.html).

[The servlet](/projects/dbbeancreator/dbbeancreator/CreateDBBean.java) should be compiled and put in a servlet container (like Tomcat).

Also, put [this](/projects/dbbeancreator/dbbeancreator/org.gjt.tw.dbobjects.tar.gz) into your app. It's some oooold DB persistance stuff someone devved years ago. It hasn't been updated since 2001, but I modified it a little to fit my script.

When you submit the form, the servlet will spew out bean code, and/or create the sources as specified.

# All of it

[dbbeancreator.tgz](/projects/dbbeancreator/dbbeancreator.tgz) (23,678 bytes)

Happy coding. I hope this shaves hours off your dev time too :-) Now you can get the DB schema perfect, and adapt the code on the run.

# Future developments:

* Tag libraries to utilise the beans
* JUnit test cases
* Get the servlet to work with newer/better persistance libraries
