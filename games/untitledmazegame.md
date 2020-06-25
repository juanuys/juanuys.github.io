---
title: "Untitled Maze Game"
name: untitledmazegame
layout: post
description: "Find the exit before the Infected get you."
permalink: /games/untitledmazegame
thumb: /assets/games/untitledmazegame/thumb.png
category: wip
builtwith: clojure clojurescript canvas websocket
pagetype: game
rank: 20
---

<span class="highlight">[Play it now.](https://untitled-maze-game.herokuapp.com)</span>

Untitled Maze Game is a maze game (duh!) in which you try to find the exit before the Infected get you.

It is not the "[undeserving of a Twinkie](http://designersnotebook.com/Columns/005_Bad_Game_Designer_1/005_bad_game_designer_1.htm)" kind of maze game. In fact, you can see some surrounding corridors as you navigate it, and you can see where you've been (breadcrumbs?). The point is to run "everywhere" until you find an exit, or run "away" from an Infected when you encounter one.

It's a work in progress, so handle with care. Future features:
- at least one Infected bot will be in a room when you join
- once you're Infected, you have to infect others to stay alive
- score board

Made with
- clojure
- clojurescript
- websockets
- HTML canvas

I was going to use Haxe and OpenFL and the [maze lib](/games/haxe-maze) I made, but I already know how to do websockets well in Clojure, so there you go.

![Obligatory screenshot](/assets/games/untitledmazegame/screenshot.png)