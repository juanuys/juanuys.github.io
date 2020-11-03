---
layout: post
title: "Reflect on Rapid Ideation session 1"
description: "Reflect on Rapid Ideation session 1"
tags: ma falmouth crj development-practice week7 crj-dispositional systems-based-design crj-cognitive crj-procedural
category: blog 
# disqus_comments: true
thumb: /assets/masters/crj/thumb.png
---

This is a reflection on the first [rapid ideation session]({% post_url 2020-10-27-game-jam %}). We ask these questions:

> Did everything go according to plan? If anything, what went wrong?
> Is there a way you could build on your work from the first session? (Although we ask you to work on a new artefact, you might still consider using similar technologies or reflecting on similar themes).

# Did everything go according to plan?

The plan was to "finish" a game, [which I did]({% post_url 2020-10-27-game-jam %}). But...

# If anything, what went wrong?

There are quite a few bugs in the software:

- polyominoes can't be rotated otherwise they break the win condition logic
- game boards can't be arbitrary sizes otherwise the solver gets stuck in an infinite loop in some cases

These could all be fixed (and I will). However, there's an upside: I managed to deliver a playable game (MVP) using a configuration which is known to work, and even if the pieces couldn't be rotated, they could still be placed to get to a solution. In the future I will take this direction again, as it's good to deliver something playable soon and fix bugs later, rather than building the perfect code up front.

The second issue is that I could have used the ideation techniques more. I did some brainstorming and ICEDIP in my head on the night of the theme revelation, but completely neglected to do opposite thinking, SCAMPER, crazy eights, round robbin (with my family), and so forth. I think with more ideas I might have been able to make a puzzle game which has at least one more extra memorable quirk or slant to it which players will remember (and which isn't related to story, art or audio). In the future I'll definitely use the afore-mentioned techniques more.

# Is there a way you could build on your work from the first session?

Yes, I could fix the bugs I mentioned, and the polyomino solver code could definitely be re-used in a future puzzle game.

I've done some research recently into the types of games that are doing well, and the types of games that gamers really like to play. I have an idea for a game mechanic which I'm super excited about implementing.

However, the game mechanic needs networking, and I'm not entirely sure this is a component I should implement myself, or whether I must rather use a game engine with industry-standard networking (e.g. using [Unity](https://unity.com/) with something like [the SteamWorks backbone](https://partner.steamgames.com/)). This raises questions around using [Phaser 3](http://phaser.io/) again, where I'd have to host my own servers and build a websocket-based component myself (which I could do given my skillset, but "could" doesn't mean "should").

I'll let that decision simmer for the time being.

# What else?

I might run out of things to quote from Tynan Sylvester's book soon, but it's so good. 

> Decision design is game design at its purest. While games can be enhanced by narrative, fiction, image, and sound. none of these is essential to the form. The heart of games is in interactivity, and the heart of interactivity is the moment of decision.
>
> (Sylvester, 2013)

I like to think that [my game jam game](/cargogame) involves decisions, but it could be so much more. Currently, they are just decisions you have to make to get the pieces to fit, but it's devoid of emotion. I think in my next game, I want to particularly focus on getting the player to make decisions which will make them feel something.

> More than in any other field, in game design <span class="highlight">decisions must be emergent to work well</span>. So instead of writing them one by one, we have to create <span class="highlight">systems that can generate them on the fly</span>.
>
> (Sylvester, 2013)

Doing [systems-based game design](https://www.gamasutra.com/blogs/TrentPolack/20180104/312480/A_Guide_to_SystemsBased_Game_Development.php) might be a first for me, but I'll go through the backlog of games I've made over the years, see which comes closest to systems-based design, and report back here. That said, I'm excited to implement at least a basic system in the second rapid ideation session, with which to effect more emergent gameplay.

# References

- [Sylvester, T., 2013. Designing Games: A Guide To Engineering Experiences. 1st ed. Sebastopol, California: O'Reilly Media, Inc, p.120.](https://tynansylvester.com/book/)




> This post is part of my [critical reflective journal](/tags#crj).

> This post was written during _week 7_ of the module _Development Practice_.
