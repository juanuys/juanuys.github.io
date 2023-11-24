---
layout: post
title: "LLM inside Godot game"
description: "I put an LLM inside a Godot game"
tags: imadeathing gamedev godot llm ai ml deeplearning chatgpt
category: blog
thumb: /assets/posts/2023-10-09-llm-inside-godot-game/thumb.png
---

I put an LLM inside a Godot game.

([source code](https://github.com/opyate/godot-llm-experiment), [Reddit thread](https://www.reddit.com/r/aigamedev/comments/173mwyz/llm_generating_random_conversation_from_within_a/))

As I don't know SCons (the build tool used by Godot for GDExtension), I got a [lot of help from ChatGPT](https://chat.openai.com/share/e93fbfe1-9069-49a6-8282-de7c9cad9093) with it. There are a few open issues to clean things up and add Windows support.

Here's an experiment showing two agents having an eternal conversation. The use-case for this is to have NPCs do interesting background chatter in a game, like when entering a town square and seeing all these little interesting speech bubbles pop up above the heads of the NPCs.

<iframe width="1836" height="799" src="https://www.youtube.com/embed/qHVFi8tws7Q" title="LLM generating random conversation from within Godot." frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
