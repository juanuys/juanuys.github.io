---
title: "Clear the Java mucky muck from Ubuntu."
description: "Choose the exact version of the JDK you want to install."
og_image_url: "http://distilleryimage2.ak.instagram.com/02f13c2a0c5a11e3bc6522000ae91414_7.jpg"
image: "http://distilleryimage2.ak.instagram.com/02f13c2a0c5a11e3bc6522000ae91414_7.jpg"
image_content_type: "image/jpeg"
layout: post
tags: [tech, java]
category: blog
---

# Java on Ubuntu

<img src="http://distilleryimage2.ak.instagram.com/02f13c2a0c5a11e3bc6522000ae91414_7.jpg" width="50%" align="right">This article is for Java developers who use Ubuntu as a development platform who wants to install Sun’s range of tools manually, instead of installing it with Synaptic/aptitude/apt-get. The commands in this article was tested on Ubuntu 8.04 “Hardy Heron” and assumes knowledge of the [Debian alternatives system](http://www.debian.org/doc/FAQ/ch-customizing.en.html#s-diverse).

The benefits of installing it manually are:

* you choose exactly which version of the JDK you install
* you choose which tools you enable, e.g. jhat

# Cleaning up

Depending on what you’ve installed before, you may be left with a mixture of non-Sun tools, like [gcj](http://gcc.gnu.org/java/) or the Eclipse Java compiler. We’re going to remove these, install our own, then tell Ubuntu where to find the newly installed tools.

The below is just a sample of things that may or may not be installed on your machine. Use Synaptic Package Manager instead, and search for “java” and remove accordingly.

<a href="https://gist.github.com/opyate/6325468#remove-1">https://gist.github.com/opyate/6325468#remove-1</a>

You may need to completely remove the historical alternatives:

<a href="https://gist.github.com/opyate/6325468#remove-2">https://gist.github.com/opyate/6325468#remove-2</a>

As you can see, not only do I use java and javac, but also jhat, jvisualvm, etc.

I’m going to digress and explain the commands I used in the code snippet above. The `!!:gs/A/B/` command basically means *repeat the previous command, but replace A with B, all occurrences*, as opposed to the `^A^B` command which will only replace the first occurrence. More weird and wonderful commands can be found at [commandlinefu.com](http://www.commandlinefu.com/commands/browse).

# Install

Install the JDK. For the purposes of this discussion, let’s set the `JAVA_HOME` environment variable to the location where you installed the JDK to, e.g. `JAVA_HOME=/opt/jdk/jdk1.6.0_14`

Tell the alternatives system where it can find the new utilities:

<a href="https://gist.github.com/opyate/6325468#install">https://gist.github.com/opyate/6325468#install</a>

And a quick test:

<a href="https://gist.github.com/opyate/6325468#version-check">https://gist.github.com/opyate/6325468#version-check</a>

The same can now be done for your other tools, like Ant and Maven.
