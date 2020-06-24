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