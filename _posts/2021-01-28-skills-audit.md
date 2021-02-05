---
layout: post
title: "Skills audit"
description: "Skills audit"
tags: ma falmouth crj ma-game-development week1
category: blog
# disqus_comments: true
# thumb: /assets/masters/crj/thumb.png
---

This is week 1 of the module "game development". This week's challenge activity is a skills audit, and the spark forum prompts us to think about the roles within game development, which I [reflect on in a separate post]({% post_url 2021-01-28-skills-audit-reflection %}).

# Skills audit

## Questionnaire

The first 13 skills were provided, but then I also add my own skills which I think I need to learn.

> 1 👍 I can take mouse, keyboard, touch screen or gamepad inputs and use them to control objects in a game engine of my choice.

This is something I've implemented in a few engines and SDKs over the years.

> 2 👍 I can set up physics components (such as colliders and rigid bodies) in my game engine and trigger an event to happen when two game objects collide.

I've implemented physics and collision in a few engines over the years, in engines like [Unity](https://unity.com/) and [Godot](https://godotengine.org/), to more esoteric packages like [Quil](http://quil.info/).

> 3 👍 I can use code to spawn new objects while the game is running (eg create bullets).

A more recent example of spawning objects is shooting balls for a [small bricks crusher game](https://juanuys.com/games/brickscrusher) I made with Godot.

<iframe width="560" height="315" src="https://www.youtube.com/embed/4Mf1gAOiuMs" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

> 4 👍 I can set up an animation in my chosen game engine and control it with code and / or with a state machine.

The first version of [Contumacious Commuter](/games/contumacious) back in 2016 had idle/action animations, implemented in Unity.

> 5 👎 I can use level design tools to block-out a level in my chosen game engine.

All of my games thus far has had procedurally generated levels (e.g. puzzle configurations) or were custom jobs (e.g. generating a puzzle layout from flat file configuration), save for the [small game I made over Xmas](/games/santasaunter), which has a [map editor built into the database called CastleDB](http://castledb.org/#level). But otherwise, no 3D experience, or any of the more well-known tools. An old collaborator of the Haxe guys (who makes CastleDB) made [LDtk](https://deepnight.itch.io/ldtk), which I'd like to use for a game soon.

> 6 👎 I can use my game engine’s pathfinding system (if it has one) to create enemies and NPCs that chase or follow the player.

I've studied path finding algorithms like A*, and have coded [boids](/boids) which exhibit "follow" behaviour, but not yet used anything offered by a game engine.

> 7 👍 I can code basic game logic (eg comparing two numbers) to create win and lose conditions.

Oh, yes. I compared my first 2 numbers on a computer some time in 1991 or 1992 using Basic.

> 8 👍 I can configure particle systems to create different visual effects (eg fire, snow).

Every good engine has a particle system! This [maths game prototype](https://juanuys.com/mathsgame/) for the previous module's [first game jam]({% post_url 2020-10-27-game-jam %}) shows particles if you answer correctly.

> 9 👍 I can use appropriate software to create appealing character sprites or models.

I've been drawing sprites with [GIMP](https://www.gimp.org/) or [Clip Studio](https://www.clipstudio.net/en/) for a long time.

<iframe width="560" height="315" src="https://www.youtube.com/embed/ie2ft1DkUcs" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

It's only this Xmas that I tried my hand again at a 3D modelling app for the first time in years.

<blockquote class="twitter-tweet"><p lang="en" dir="ltr">To the tune of Aqua&#39;s Barbie Girl:<br><br>&quot;I&#39;m a 3D man, in a 2D wo-o-orld!&quot;<a href="https://twitter.com/hashtag/GodotEngine?src=hash&amp;ref_src=twsrc%5Etfw">#GodotEngine</a> <a href="https://twitter.com/hashtag/blender?src=hash&amp;ref_src=twsrc%5Etfw">#blender</a> <a href="https://twitter.com/hashtag/earworms?src=hash&amp;ref_src=twsrc%5Etfw">#earworms</a> <a href="https://twitter.com/hashtag/indiedev?src=hash&amp;ref_src=twsrc%5Etfw">#indiedev</a> <a href="https://twitter.com/hashtag/lowpoly?src=hash&amp;ref_src=twsrc%5Etfw">#lowpoly</a> <a href="https://t.co/KMijb2hoHQ">pic.twitter.com/KMijb2hoHQ</a></p>&mdash; Juan Uys (@opyate) <a href="https://twitter.com/opyate/status/1354729737575399428?ref_src=twsrc%5Etfw">January 28, 2021</a></blockquote> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script> 

> 10 👎 I can use appropriate software to create atmospheric environment sprites or models.

I've never made environment sprites or models (crates, anyone?), but I'm sure the skills from the previous point is transferable.

> 11 👍 I can create character animations, such as walking and jumping, and bring them into my game engine.

Yes, see the second-previous point. Look at that little man strutting.

> 12 👍 I can use appropriate software to design clear user-interfaces.

I've made user interfaces as a web developer for almost 20 years, but have made menus etc for games.

> 13 👍 I can find / record / edit, sound effects and music.

I created a bunch of custom SFX for [Corn Wars](/games/cornwars/).

<blockquote class="twitter-tweet"><p lang="en" dir="ltr">Recording more crash SFX by stacking some random crap from the shed and pushing it over. <a href="https://t.co/5IjHXIggAG">pic.twitter.com/5IjHXIggAG</a></p>&mdash; Juan Uys (@opyate) <a href="https://twitter.com/opyate/status/1266245313867603970?ref_src=twsrc%5Etfw">May 29, 2020</a></blockquote> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

And [music](https://soundcloud.com/opyate), more recently for the [previous module's first rapid ideation session](/games/cargo).

> 14 👎 I can implement any visual FX as a shader in an engine of my choice

This comes back to [a SMART goal I set last year](/masters/goals#become-more-fluent-with-shadersglsl) to become more fluent with shaders. I've been learning more about shaders using the [Book Of Shaders](https://thebookofshaders.com/) and having a blast implementing it:

<blockquote class="twitter-tweet"><p lang="en" dir="ltr">Some call this Shaders101.<br><br>I call this OMG I just implemented a cel + outline shader in Godot. <a href="https://t.co/tSFCNKGV3Z">pic.twitter.com/tSFCNKGV3Z</a></p>&mdash; Juan Uys (@opyate) <a href="https://twitter.com/opyate/status/1354931413586501632?ref_src=twsrc%5Etfw">January 28, 2021</a></blockquote> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

Shaders are crucial IMHO.

> 15 👎 I can design an interesting game mechanic that is balanced and leads to interesting player choices

Again, [a SMART goal](/masters/goals#be-a-better-designer) to be a better designer. I'm aware design spans more than just game mechanics, but this is the area I want to focus on this module.

I've been dipping in and out of a lot of books on the subject.

![Books on game design and engineering experiences](/assets/posts/2021-01-28-skills-audit/books.jpg)

I've been playing a variety of games and paying special attention to game mechanics. This includes video games on my PC, and card/tabletop games with my family.

I'm a big lover of books, and a bit of a book hoarder, so I've got a library to draw from, including design, illustration, art history, comics/cartoon anthologies, and even books not entirely focused on art and design, to hopefully make me a more well-rounded individual.

## Roles in the industry

We're asked to rate ourselves on the seven game-development skills we cover in this module:

- Game design
- Programming
- Narrative design
- Art
- Animation
- Level design
- Sound design

Using [this logarithmic scale](http://jim-mcbeath.blogspot.com/2011/12/levels-of-expertise.html) to rate myself, I get a shallow T shape:

![Skills rating](/assets/posts/2021-01-28-skills-audit/game-dev-roles.png)