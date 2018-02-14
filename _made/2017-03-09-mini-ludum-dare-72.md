---
title: "Mini Ludum Dare 72"
description: "I participated..."
layout: post
tags: plato-long gamedev quil processing webaudio clojurescript minild
category: blog
---

I [participated](https://opyate.github.io/minild72/) in another [MiniLD](http://ludumdare.com/compo/minild-72/?action=preview&uid=82022).

The code is Clojurescript, the graphics done with [Quil](http://quil.info/) (which uses [Processing](http://processing.org/) under the hood). The synth sound-effects are raw Web Audio courtesy of [hum](https://github.com/mathias/hum).

The point? Outlast the bot. Your max paddle hits gets submitted to a Ludum Dare leaderboard - the first of its kind.

This being rushed, there are a few issues:

- the ball tends to spend a lot of time toward the top of the court
- the ball speeds up so much that it flies "through" the paddle
- the ball can be glitched by hitting it with the top of the paddle

The glitch makes for good high scores, though ;-)

<div class="videowrapper">
<iframe width="1665" height="764" src="https://www.youtube.com/embed/d_tSSeSFgbw" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
</div>
