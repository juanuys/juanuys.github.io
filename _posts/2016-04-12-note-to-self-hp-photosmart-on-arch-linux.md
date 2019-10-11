---
title: "Note to self - HP PhotoSmart on Arch Linux"
description: " Note to self..."
layout: post
tags: tech archlinux
category: blog
---

# Note to self

Installing an HP PhotoSmart 5520 on Arch Linux.

* Switch on printer, and connect via USB
* `sudo pacman -S cups ghostscript gsfonts`
* `yaourt -S hpoj`
* Add `wheel` to `SystemGroup` in `/etc/cups/cups-files.conf`
* Restart cups with `sudo systemctl restart org.cups.cupsd.service`
* Go to `http://localhost:631/` and click on `Adding Printers and Classes` then `Add Printer`
* Authenticate with your system login
* Click through all the options

![Printer setup screen](/assets/posts/2016-04-12-note-to-self-hp-photosmart-on-arch-linux/printadmin.png)

