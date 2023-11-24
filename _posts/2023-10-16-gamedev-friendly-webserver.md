---
layout: post
title: "Gamedev-friendly webserver"
description: "I made a Gamedev-friendly webserver for Godot gamedevs"
tags: imadeathing gamedev godot tools
category: blog
thumb: /assets/posts/2023-10-16-gamedev-friendly-webserver/thumb.png
---


I made a gamedev-friendly web server (especially for Godot gamedevs) 👍 

([source code](https://gist.github.com/opyate/6e5fcabc6f41474d248613c027373856))

When you test your Web build locally, you'll sometimes see this error:

![Error](/assets/posts/2023-10-16-gamedev-friendly-webserver/error.png)

The web server fixes these errors by

- setting the appropriate headers
- creating a self-signed SSL certificate on-the-fly (so you don't have to)

