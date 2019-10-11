---
title: "AngularJS and Internet Explorer woes"
description: "Aka endless clicking on crossbrowsertesting.com and why I love being a backend programmer."
date: 2013-11-01
og_image_url: "https://juanuys.com/assets/doodles/original/2019-09-04-selfportrait.png"
image: "https://juanuys.com/assets/doodles/original/2019-09-04-selfportrait.png"
image_content_type: "image/jpeg"
layout: post
tags: tech angularjs
category: blog
---

_Aka endless clicking on crossbrowsertesting.com and why I love being a backend programmer._

A few weeks ago, one of my clients tasked me with building a public-facing single page app for their credit monitoring business. They've heard good things about [AngularJS](http://angularjs.org/) and said they wouldn't mind if I learned it on the job. (I love those kinds of clients!)

At this point we've already solidified the backend API ([Scala](http://scala-lang.org/) + [Play! 2.1.3](http://www.playframework.com/documentation/2.1.x/ScalaHome)) and felt like getting my hands dirty with our good friend Javascript.

# At first, it was easy

I knocked the first version out quickly and got it working on the latest Chrome and Firefox on a Macbook Air. As we all know, my setup represents a small slice of humanity, so onto cross-browser testing I went.

# And then, it wasn't

I've been solely a backend programmer for a good few years now, and I soon remembered why: building something for to work with every browser/platform combination in the world is a royal <acronym title="Pain In The Bottom">PITA</acronym>. I wasn't going to give up, though, and [the tool I used to achieve this goal](http://crossbrowsertesting.com) comes with an A+ thumb's up 5 stars from me. I was saved the cost and effort of running every other major browser/platform combination.

But, still &mdash; this is how it all panned out: load the page, load dev tools, and then the clicking begins. The endless clicking through thousands of lines of AngularJS and jQuery code to find the point where things fall over, and then just before the Eureka moment, the connection would drop. Or IE devtools would throw a wobbly and loose its place in the source code. All of this via a Flash frame stuck with IE devtools. IE DEVTOOLS, people! Not fun.

Which is why this isn't a detailed bug report: I merely stumbled onto a solution after pulling all my hair out and trying something different.

# The issue

Now, I've done exactly what the good AngularJS folks [told me to do](http://docs.angularjs.org/guide/ie), but my scenario seemed unique. It turns out that if you use a custom directive from a partial in IE, it won't be callable as an element ('E'), but only as an attribute ('A'), e.g. of a DIV.

I explain via two examples [over here](/projects/angularjs-internet-explorer). If you are the lucky owner of a Windows box loaded with IE8 or smaller, please go and try it out and then lodge a proper bug report with the jQuery folks. Yes, yes &mdash; I know it sounds like this article is about AngularJS, but the real issue seemed to be with jQuery.

Something to do with <code>target.appendChild(elem);</code> on line 6,050 of the [latest version of jQuery at the time of writing](http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.js).

In the mean time, I hanker after my beloved Scala backend servers, where I get to choose exactly which platform and which flavour of VM I run on.

![AngularJS and Internet Exporer woes](https://opyate.com/assets/photograms/original/2013-11-01-the-most-fun-i-had-all-week---.jpg)
