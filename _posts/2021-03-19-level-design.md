---
layout: postcrj
title: "Level design"
description: "Level design for Contumacious Commuter, and an analysis of Slay The Spire's level design"
tags: ma falmouth crj week8 game-development slay-the-spire level-design contumacious
category: blog
# disqus_comments: true
thumb: /assets/posts/2021-03-19-analysis-of-slay-the-spires-level-design/thumb.jpg
week: 1
module: game development
---

During week 8 we looked at level design, and were given two tasks: analyise levels, content and environment art for one of our favourite games, but then please design the levels, environments, mission and quests for our own game.

I'll do both in this post.

# Level design for Contumacious Commuter

The level design doc is a [living document](https://github.com/juanuys/ccgdd/blob/master/level-design.md), but I will reflect on the *current-at-the-time-of-writing-this* version (Git commit hash `ad9a3e9`) of the document here:

[https://github.com/juanuys/ccgdd/blob/ad9a3e9/level-design.md](https://github.com/juanuys/ccgdd/blob/ad9a3e9/level-design.md)

I'm swamped this week, so I have no time to reflect. I thought I'd just get a little bit done. As David Wehle would say, never have a zero percent day {% cite wehle_no_nodate %}.


# Slay The Spire analysis


This is an analysis of Slay The Spire's level design, content design and environment art, in relation to the following criteria:

> Are levels open and nonlinear, or tightly controlled and scripted?

Your journey is dictated by 3 randomly-generated maps (for the 3 acts), each which has linear progression from start to end. Each level on the map is a battle arena along the Spire.

> How often do levels require back-tracking or revisiting areas?

Levels do not require back-tracking, so once you've completed a level or a map, you don't go back.

> How is the game narrative communicated through the level design and environment art?

In each battle arena (a "level" on the Spire), your player battles one or many foes, which are meant to stand in the adventurer's way to the top of the Spire. The environment art are static 2D backdrops like caves, fantasy cityscapes, or boneyards, which lends an eerie feel to the dangerous journey you're attempting.

> How does the level design control the player’s line of sight and guide them through the environment?

This doesn't really apply to Slay The Spire, as the character isn't controlled in a first/third-person sense.

> Are there good examples of well-placed hazards, enemies and obstacles?

Each battle level is the same in the sense that the player is to the left, and the enemy/enemies are to the right. (Or the player might be surrounded.) Really, this game is all about the card-play, and the battle area, backdrop and characters are quite minimal.

> Are there examples of well placed collectables, rewards or secrets?

At the end of each room, the player can collect loot, like gold, potions, or extra cards. New players might want to collect as many cards as possible, but seasoned players will soon learn that the deck can get diluted, so you become more discerning.

There are secrets in the sense that some card/relic pairings can be quite powerful, so it's up to the player to discover them.

> Are there any examples of interesting missions, quests, puzzles or tasks the player is asked to perform?

Apart from playing the best cards for any given hand, there is a bit of a meta-game where you have to pay attention to card selection. Also, you can only pick up a certain number of potions. The player can also select which branch of the map they want to go down. Branches intersect, and some contain "unknown locations", which can be an event, monster, shop, or treasure room.   

> How is difficulty progression handled, for example does the game get harder as it goes?

The game is expertly balanced, with weekly patches balancing it even more. There is an active Discord where players discuss strategies or play together to learn. The game definitely gets harder as it goes on.

> Do players lose progress for failure, and are there checkpoints within levels?

Slay The Spire is a roguelike, so it has permadeath: when you die, you have to start over.

# Bibliography

{% bibliography --cited %}