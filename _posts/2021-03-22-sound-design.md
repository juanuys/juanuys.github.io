---
layout: postcrj
title: "Sound design"
description: "Sound design"
tags: ma falmouth crj week9 sound-design sfx audio contumacious
category: blog
# disqus_comments: true
thumb: /assets/masters/crj/thumb.png
week: 9
module: game development
code: IGD720
---

During week 9, we're tasked with completing a first pass of sound design for our game.

# SFX and music for the game

The sound design doc is a [living document](https://github.com/juanuys/ccgdd/blob/master/sound-design.md), but I will reflect on the *current-at-the-time-of-writing-this* version (Git commit hash `c2c478c`) of the document here:

[https://github.com/juanuys/ccgdd/blob/c2c478c/sound-design.md](https://github.com/juanuys/ccgdd/blob/c2c478c/sound-design.md)

I spent a bit of the evening shuffling a pack of [Exploding Kittens](https://www.explodingkittens.com/collections/exploding-kittens-expansions/products/exploding-kittens-original-edition) in front of a condenser mic (is that even the right type of mic?) and will spend subsequent evenings mastering and importing into the game.

This is a card game with very basic audio requirements. I think as long as the audio doesn't detract from the experience, then we're good. The music should also be low-key, so players can think about what card to play without being distracted.

# Prior work

I've recorded SFX for games before, my favourite being what I call "[thwack-wobble](https://freesound.org/people/opyate/sounds/518945/)", which you can imagine being some sort of steam-punk projectile-launching weapon, and is a combination of stapler, scissors, knocking on a window (reversed), wobbling an A4 sheet of thin cardboard, and sticky tape coming unstuck (with reverb).

I've also recorded music for games. For instance, I made some [chip-tune blues](https://soundcloud.com/opyate) for a farm-themed game once, and was made with my [AKAI MPK mini](https://www.akaipro.com/mpk-mini-mkii), and Logic Pro.

Some of the more advanced audio techniques I've used recently is [Godot engine's pitch randomiser](https://docs.godotengine.org/en/stable/classes/class_audiostreamrandompitch.html), which I used with the football kicking SFX in the [7DRL challenge](/games/football-crawl).

# Conclusion

I'm sure there's a bunch of fun to be had with 3D audio design, and tools like [FMOD](https://www.fmod.com/) for mixing streams and setting complex triggers, but for now my basic 2D games need minimal sound design, so I can focus on continuity of theme, audio balance, and generally making sure sound doesn't get in the way.


# Bibliography

Nada!

{% bibliography --cited %}

