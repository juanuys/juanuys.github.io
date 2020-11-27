---
layout: post
title: "Reflecting on agile game development"
description: "Reflecting on agile game development"
tags: ma falmouth crj week10 development-practice agile crj-interpersonal crj-procedural
category: blog
# disqus_comments: true
thumb: /assets/masters/crj/thumb.png
---

During week 10 we learnt more about the agile process and the various practices.

I've been a software developer now for almost 20 years, and have a fair grasp of the agile process. I was especially immersed in the [agile process during my tenure with GOK.UK](https://www.gov.uk/service-manual/agile-delivery). I've seen teams use a mix of different processes, anywhere from [extreme programming](https://www.agilealliance.org/glossary/xp/) all the way to longer sprints called "mini [waterfalls](https://www.lucidchart.com/blog/waterfall-project-management-methodology)".

My favourite two concepts from agile practice are "iteration" and "the prototype".

## Iteration

The middle ground between over- and under-planning is iteration:

{% quote sylvester_designing_2013 -l 283-284,287 %}

Iteration is the practice of making short-range plans, implementing them, testing them, and repeating.

We don't only iterate on an entire game. We can iterate on a level, a tool, or an interface.

It exchanges deep planning for reality checks. It tests the broad structure before investing in detail polish. And it requires that designers not get too invested in plans for the future, and instead adapt continuously to unpredictable test results.

{% endquote %}

Iteration is such an eye opener if you come from a world of waterfall development (which I've had a taste of very early in my career). A good first iteration for any module or feature is getting its rough structure down, or what we called the "steel thread" at the Land Registry:

{% quote bracken_building_2015 %}

That work provided us with a useful starting point for this year’s project. Think of it like bridge-building. The first thing bridge-builders used to do was throw a steel thread from one side of the valley to another, then use it to help build the rest of the bridge. <span class="highlight">Last year we threw the steel thread, and found the point where new ideas crystallised and we began to understand what should happen next.</span> Now we’re building the bridge itself.

{% endquote %}

## Prototype

Which brings us to the prototype. One of the most valuable parts of the agile process is the learning process (to know what to build), which is achieved by way of a prototype. A prototype is meant to take a short time to build, and be a rough approximation of the final product.

{% quote knapp_sprint_2016 -l 166 %}
Sure, you could take a longer time to build a more perfect prototype &mdash; but doing so would only slow down the learning process.
{% endquote %}

In game development terms, a prototype would be a grey-boxed (or some say white-boxed) vertical slice of your game with which to prove out the base game mechanic:

{% quote casen_white_2016 %}
After chopping up the outline for the game we have been white boxing the chapters, one after another. White boxing for us literally means placing out white boxes and placeholder items instead of final props and beautiful 3D art. The goal for this is to <span class="highlight">get the backbone of the whole game in place as quickly as possible</span>, it’s almost like doing sketches before you paint a canvas. What we want to do here is to <span class="highlight">test the story pacing, puzzles and the core game mechanics</span>. This is quick and dirty, but it helps us build the game in an organic way, and we can test things straight away.
{% endquote %}

I've been in a few hackathons now (both for fun and at work) to know in my bones that the MVP works wonders for learning. However, I've also seen the MVP get in the way of serendipity, as the learning directs a team away from what a product wants to be. As such, the most important skill for a game designer is listening {% cite schell_art_2019 -l 5 %}, not just to their playtesters, but also to their teams and their inner voice.

On [BioShock](https://www.bioshockgame.com/):

{% quote sylvester_designing_2013 -l 282 %}

It was only several years into development that the game shifted into an art deco undersea city and gained its failed Objectivist utopia theme. <span class="highlight">Its designers did not plan that world on paper; they developed it through years of work on the game itself.</span>

{% endquote %}

And [The Sims](https://www.ea.com/en-gb/games/the-sims):

{% quote sylvester_designing_2013 -l 282 %}

Wright followed the opportunity he saw, and the game became more and more about the human characters until they became the focus of the game. <span class="highlight">He didn't plan this result; he discovered it.</span>

{% endquote %}

In conclusion, I will almost certainly maintain agile practice in my future software projects, but also be mindful of those serendipitous moments which gives the end-product that touch of magic.

# Bibliography

{% bibliography --cited %}

> This post is part of my [critical reflective journal](/tags#crj).

> This post was written during _week 10_ of the module _Development Practice_.
