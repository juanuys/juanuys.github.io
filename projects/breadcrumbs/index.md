---
layout: page
fb_comments: 3
title: Breadcrumbs (2005)
---

# Javascript Breadcrumbs, or YouAreHere script

<img src="http://1.bp.blogspot.com/-rIALnuq4xME/TtGDgnD3siI/AAAAAAAABwk/IP-rYCMzxZs/s400/Hansel+Gretel+Wilkin.jpg" width="33%" align="right">

I'm trying to refrain from calling this "breadcrumbs" because "breadcrumbs" is the trail you took to get where you are (Remember Hansel and Grettle?).

YouAreHere shows your location on the site regardless of how you got there.

I don't want to re-implement your browser's history feature, or the Back button - I just want to show you where you are on a page.

# Assumptions

This script assumes you use the following convention for your site:

<pre>
/a/index.html
/b/index.html
</pre>

...instead of:

<pre>
/a.html
/b.html
</pre>

Thus, you should have a "landing page" configured like `index.php` or `index.html` which is what a client would see when going to a directory on your server. The script chops the landing page string off the URL string to make the script easier. This make this script "index-based" I guess.

# Will it work on an old browser?

Compatibility, Javascript String methods:

* slice : [added in Javascript 1.0](http://docs.sun.com/source/816-6408-10/string.htm#1194366)
* split (not used): [added in Javascript 1.1](http://docs.sun.com/source/816-6408-10/string.htm#1194452)
*  substr : [added in Javscript 1.0](http://docs.sun.com/source/816-6408-10/string.htm#1194618)

This script should be Javascript 1.0 compatible and run on ancient browsers. Please let me know if you find any other pitfalls.

I also thoroughly tested `document.getElementById` and `document.all` when it comes to updating the YouAreHere tag on the client side. Note `document.layers` is implemented but untested.

# Download

Download version 0.1: [youarehere-0.1.js](youarehere-0.1.js) (7911 bytes)

Under development: I'm adding an array for the user of the script to specify "nice names" instead of the directory names, and I'm also toying with doing something usefull with anchors in the URL string.
