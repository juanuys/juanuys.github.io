---
title: "Pretty-print JSON in vim"
description: "My new favourite way to pretty-print JSON in vim"
date: 2013-11-05
og_image_url: "https://juanuys.com/assets/doodles/original/2019-09-04-selfportrait.png"
image: "https://juanuys.com/assets/doodles/original/2019-09-04-selfportrait.png"
image_content_type: "image/jpeg"
layout: post
tags: tech
category: blog
---


** *TL;DR* A quick way to pretty-print JSON in vim with no dependencies (here's looking at you, Perl). Download [jq](http://stedolan.github.io/jq/) then <code>:%!jq '.'</code>**

<del>Computational statisticians</del>Data scientists have some the funnest tools, and I found a good write-up of a few more I didn't know about called [7 command-line tools for data science](http://jeroenjanssens.com/2013/09/19/seven-command-line-tools-for-data-science.html). The first thing the article mentions is a gem called [jq](http://stedolan.github.io/jq/).

I found jq to be especially useful for formatting JSON in vim. So, before ado can in any way be furthered:

<code>curl http://stedolan.github.io/jq/download/linux64/jq -o ~/bin/jq</code>
<span style='display:block;'>&nbsp;</span>
<code>chmod +x ~/bin/jq</code>

In vim, open your unformatted JSON file, then: <code>:%!jq '.'</code>.

There you go, ladies and gents &mdash; a command so short, you don't even need to put it in your vimrc!

![jq to the res-q.](https://opyate.com/assets/photograms/original/2013-11-05-another-photo-for-my-blog--apologies-if-i-bore-my-instagram-followers----.jpg)
