---
layout: postcrj
title: "MVP and prototype progress"
description: "MVP and prototype progress"
tags: ma falmouth crj gdo750 ma-final-major-project week6 mvp prototype draft
category: blog
# disqus_comments: true
thumb: /assets/masters/crj/thumb.png
week: 6
module: final major project
code: GDO705
---

Welcome to week 6 of the module _final major project_. This sprint we focus on proving out our concepts, with a view to start delivering a prototype during sprint 3, which starts next week.

​​Quick backstory of the game:

> You're a polar bear, on her sheet of ice, floating in the ocean. Problem is, it's the last piece of ice left in the world, and everyone wants it. Fend off the hordes.

All prototypes and works-in-progress can be found here: https://opyate.itch.io/polar

I captured some play footage of the prototypes here: <link>

# Proof of concept 1

With this POC, I wanted to gauge how player movement felt. E.g. it felt a bit stiff, or could benefit from acceleration/deceleration, or "it should feel like game X", etc.

The survey I linked to the POC had some responses, and it boils down to the controls needing more "juice". Usually "juice" goes beyond just controls, but details all those things supporting player movement, like audio feedback, visual cues like VFX, tight animation, and such <cite vlambeer>, <cite grapefrukt>, <cite GMTK>.

Some even went as far as sciting Super Mario Bros. 3 as an example of good controls to aim for. My take from this feedback is to incorporate more inertia, i.e. the player accelerates before reaching full speed, but also takes a few milliseconds to come to a full stop. The similarities probably stop here, as I'm not making a platformer, and a wide range of movement types like jumping.

# Proof of concept 2

With the second proof of concept, I wanted to know: How did the player and NPC sizes feel? Unbalanced? Fair?

I'm thinking of adding a game mechanic where you can build up a flotilla using rubbish found in the sea (like driftwood, plastic, barrels, etc). This rubbish can be used to augment your weapons, and grow your floating base. A larger base would slow you down, but make your stronger.

From the survey, folks liked:

- the idea of collecting sea rubbish, as it made them feel good about cleaning up the ocean
- the idea of building up a base in the sea (these folks might just be fans of the base-building genre)

For others, the game felt a lot harder. They didn't feel as agile or nimble. The challenge here would be to scale up the size gradually with fire-power. 

A concern of my own was that the player character would feel sluggish, and loose the fast-paced excitement of the early game. As this is an abstract world anyway, I'm thinking of keeping the player movement speed and agility to keep the game fast an exciting. The growing of the base serves another purpose anyway, as I'll talk about a bit more below.

# Extra comments from the surveys

The lovely folks I surveyed were kind enough to offer up extra suggestions and comments beyond those that I asked for:

- they'd like to see the protagonist, finally. Everyone's clamouring for the polar bear!
- the little red squares that gets dropped when enemies perish: those seem like a bad thing at first because of the colour red. (I chose red to make it stand out from the blue sea background, but will play with other colours)
- getting swarmed too quickly. (The game is not at all balanced right now, but I might pay some attention to this sooner rather than later.)
- the progress bars at the top are confusing. (I've since moved the health bar to the player, and will make it very clear that the top bar is for levelling up.)
- this game reminds them of other ecocritical games like Frostpunk, Endling, etc because of similar themes.

# Other proofs of concept

I have some miro boards and pen & paper sketches, to thrash out some ideas around art and look & feel, before I commit to making art electronically.

<cite pictures>
<cite miro board>

# Homework and TODO

Apart from what I've done so far, there is still a lot more:

- be careful with the firing projectiles, and don't get accused of ecoterrorism like the lady from https://www.thunderbirdstrike.com/ <citation needed> We might have to be very metaphorical about "weapons" in the game.
- Research climate change solutions. See if they can be used as "weapons" in the game.
- missing piece: the argument. What do I want to persuade people of? E.g. causes of the problem (causing the polar icecaps to melt, sea levels to rise), and then: here is a response to this problem (give the player a real solution to the problem)
- the notion of building is the opposite of melting.
- Research: Find horde survival game that builds, or has building mechanic. (base bulding) The closest I've come to far are TD games (tower defense). You're not building a base, as such, but you're adding to it with towers along pre-determined paths.
- steve swink: game feel; The "metaphor" metric. What does the control scheme convey? How much does it sell, or commnicate the experience that you're this particular avatar.
- merry group of bandits: feels more like a united front, collective action, against climate change. Convey the idea that there is power in numbers.
- more sustainable ammunition: Boomerang, harpoons on ropes, perhaps large floaty boulders which can be collected again after it knocks an enemy out? As I'm inspired by the New Weird of China Mieville, perhaps there can be some thaumaturgists onboard with special magical weapons.

# Lessons learned

## Prototype VS proof of concept

I started off calling the proofs-of-concept prototypes, but they are different:

> POC shows that a product idea can be made, and the prototype shows how it's made.

## Pen & paper VS game engine

We were urged to not use our final game engine of choice for the POCs, but I just jumped straight into Godot. TBH, the coding comes naturally, and with years of experience, I tend to structure my work well from the get-go, so I'm basically "sketching with code". The engine doesn't get in the way at all.

In future, I will consider using something other than a game engine for POCs, but for the 2 I discussed above, I still feel that using a game engine was the best choice, as especially the first POC deals with player movement in the game, and they can both be shared more easily electronically (where-as paper prototypes have to be shown to folks in real life).

# Swink, Bogost

Define the 3 things

- good capsule definition of experiential metaphor <cite Doris Rusch> TODO
- good capsule definition of procedural rhetoric <cite bogost> p28 procedural rhetoric = practices of using processes persuasively. (game play, as effected and orchestrated by computer gameplay logic)
- good capsule definition of the metaphor metric from Game Feel <cite Game Feel> TODO

...with the notion that they're all aligned toward the idea that "the mechanic is the message". If we want to communicate a message, it has got to be through a well-tuned mechanic.


https://persuasivegames.com/games/

# Next sprint

Spend "juice" on the ice disintegrating/shrinking.
Base bulding + banding together.
Audio: water droplets, ka-chink of pieces joining up.
Motion juice: look at ships, battle ships, icebreaks move through slushy water and ice.
Sail-powered (initially, maybe solar later)

Show the game to the climate folks at work, eventually.
Spend next 3 weeks to game feel and juice.
The mechanic is the message, so to communicate it, it has to feel good. Don't bother too much about visual fidelity.




# Bibliography

{% bibliography --cited %}
