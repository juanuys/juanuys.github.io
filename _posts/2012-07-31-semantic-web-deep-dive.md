---
title: "Semantic Web Deep Dive"
description: "Semantic Web Deep Dive"
date: 2012-07-31
og_image_url: "http://www.w3.org/DesignIssues/diagrams/loop.gif"
image: "http://www.w3.org/DesignIssues/diagrams/loop.gif"
image_content_type: "image/gif"
layout: post
tags: [tech, semweb]
category: blog
---

Or, actually:

# Semantic Web Crash & Burn

I sent a [very naïve open letter](/2009/07/10/semantic-web.html) to a few key players in the semweb space a few years ago. I got no responses, and hence thought that either my question was posed incorrectly, or the field is so new no-one can really answer me, or the race is on to lay the groundwork and therefore there’s no time to get a newbie up to speed, or X. (I don’t know what X is yet.)

Fast-forward 3 years and I now have a project going which may or may not generate some valuable data soon. I want to store the data in a way that makes sense for humans and computers alike. I do not want to index everything, because being presented with a list of 10 close matches to what you want is so archaic. And since I’m a big fan of free PaaS hosting plans, the data needs to be stored very efficiently, and I should be able to operate on it every efficiently. Besides, [your Big Data is big enough](http://www.information-management.com/blogs/big-data-size-mass-velocity-10022886-1.html), so I should be OK.

Without further ado, I’ve dedicated my evening to a Deep Dive of everything semweb.

I love the web and I’m a web programmer. I also want to give meaning to my data, i.e. attach some sort of semantics. Roll on.

# Overview

I started this post at 7 and now it’s 11. I got stuck on a [handful of Wikipedia articles](http://en.wikipedia.org/wiki/Linked_data) and [W3C](http://www.w3.org/2001/sw/) recommendations and working groups. It all reminded me of this XKCD on standards:

<a href="http://xkcd.com/927/"><img alt="XKCD #927 (http://xkcd.com/927/)" src="http://imgs.xkcd.com/comics/standards.png" width="500" height="283"></a>

After hours of randomly clicking and reading bits and pieces, I’ve managed to get a better overview of the state of semweb.

# And then a funny thing happened

This is where I was supposed to write about it all, dissect it, make sense of it and summarise it.

I was going to give you a primer on simple terms like taxonomy, vocabulary and ontology. I was going to tell you how we’re still far away from data and still very much document-based, stuck in silos, and how traditional markup doesn’t cut it—how it does not describe what something means, how [microformats](http://en.wikipedia.org/wiki/Microformat) is a web-based approach to semantic markup, and how this proliferation of formats can luckily be ground down into something coherent using [GRDDL](http://en.wikipedia.org/wiki/GRDDL). Most importantly, I was going to tell you about [knowledge representation](http://en.wikipedia.org/wiki/Knowledge_representation_and_reasoning) using OWL and RDF, and the software tools to peruse said formats.

Then I realised: my brain is so crammed with 4 hours worth of reading all this stuff, that I need to find a way to do exactly that: **a knowledge representation of what’s in my brain**.

Then something in my head went *snap*.

I ended up on the floor in a spasmodic fit of hilarity, sucking my thumb. The confusion punctured my prefrontal cortex, and I now only speak to uppity wooden chairs. In reverse. My brain turned on itself in the most meta way possible. I had to stop.

# Conclusion

I don’t want to duplicate any knowledge here, so there will be no summaries. But, I’ve seen the suffering, and will leave with you the following tips:

* if you ever publish anything, and it’s not data, please [annotate](http://en.wikipedia.org/wiki/Embedded_RDF) it for [generations to come](http://en.wikipedia.org/wiki/Artificial_intelligence). The web is too noisy to scrape anything anymore and we’re too busy to build a spider to make sense of your mash of markup.
* there are [places](http://answers.semanticweb.com/) where you can ask questions if you get stuck.
* don’t silo your data or think it belongs to you especially if your users created it (here’s looking at you, Facebook). [It should be free.](http://vibrantdata.org/)
* don’t break the web by creating user profiles and not annotating it with [hCard](http://microformats.org/wiki/hcard) at the very least. There’s also [FOAF](http://www.foaf-project.org/) and [XFN](http://en.wikipedia.org/wiki/XHTML_Friends_Network).
* don’t expect silver bullets. There are smart people doing good things to take this movement forward, like [http://www.opencalais.com/](http://www.opencalais.com/) (even though OC are too focused on companies/mergers news)
* there’s too much standards documentation for me to consume right now. [Process can scare the most optimistic of us away](http://hueniverse.com/2012/07/oauth-2-0-and-the-road-to-hell/), but it seemed the folks at W3C managed to pull something wonderful together. I really do hope I can get through it all one day.
* a few weeks after doing this 7-11 stint, I found a semweb on-line test, and memory served me well. I’ll consume you yet, semweb, just you wait.

<blockquote class="twitter-tweet"><p>Decided to learn a thing or 2 about RDF/OWL by throwing myself into the deep end with a test. <a href="https://twitter.com/search?q=%23semweb&amp;src=hash">#semweb</a> <a href="https://twitter.com/search?q=%23TabSwitchingFTW&amp;src=hash">#TabSwitchingFTW</a> <a href="http://t.co/lBydLQ6A">pic.twitter.com/lBydLQ6A</a></p>&mdash; opyate (@opyate) <a href="https://twitter.com/opyate/statuses/224227281810358273">July 14, 2012</a></blockquote>
<script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>

# And, then some…

…other things I wanted to write a few words about, but responsibilities beckon.

## LOD

This really excites me: http://www.w3.org/wiki/SweoIG/TaskForces/CommunityProjects/LinkingOpenData

See FAQ #7: “Invent heuristics to auto-generate links between data items from different sources.”

And then further down there is a list of passionate people telling the world how they could help.

## MIT Simile project

[http://simile.mit.edu/](http://simile.mit.edu/)
