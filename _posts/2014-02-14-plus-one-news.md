---
title: "+1 News"
description: "Natural language parsing, and news generation by way of Markov chains"
layout: post
tags: imadeathing tech markovchains
category: blog
---

+1 News comprises natural language parsing, and news generation by way of Markov chains, aggregation and downstream publishing.

How it works: it crawls the web for linkbait using [linkbaiter](https://github.com/opyate/linkbaiter), then crawl those links, [markov the crap out of them](https://github.com/opyate/beingjohnmarkovic), generate new crappy news, then [publishes](https://github.com/opyate/plusonenews) it to [Tumblr](http://plusonenews.tumblr.com/).

