---
title: "Web TV (2004)"
layout: page
fb_comments: 3
---

This project failed miserably. Imagine a modern-day MPEG being decoded by a 25MHz 386 PC. Painfull. Well, that exactly what this project does for the modern computer (1.7GHz Pentium M).

Basically, I tried to emulate a video monitor by drawing web-based pixels on the screen. A pixel can be either:

* a DIV tag
* an IMG tag with a 1x1 GIF, and you'd need 256 individual GIFs for this (or more)
* a SPAN tag containing a character with HTML code 9606 which yields a little square like this: ▆

The aim was to convert an MPEG movie into a Javascript array so that anyone with a Javascript web browser can watch a clip from anywhere. They wouldn't need any plugins.

Before I came to that part I did some tests on the WebTV. I tried to write random arrays to the WebTV to see how fast it can draw. Here are the findings for a tv with 7 548 pixels:

* DIV tags fails miserably in all tests. They are slow to alter.
* GIFs are ok if you are going monochrome (jumping between two states). Check out [life by Bram Cohen](http://bitconjurer.org/life/).
* The SPAN tag takes up to 30 seconds to draw a new frame. The performance becomes acceptable when the tv has about 60 pixels.

Anyway, the tv can be seen [here](/projects/webtv/webtv.html) happily drawing random pixels *[EDIT: this doesn't work on IE]*. Maybe the code can be optimised some more, or the Javascript engine for Firefox can use a bit of tweaking, in my case. Either way, on to the next project for now.
