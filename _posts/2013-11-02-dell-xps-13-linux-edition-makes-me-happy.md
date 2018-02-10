---
title: "Dell XPS 13 LE"
description: "The final nail in the coffin for Apple products at Grumble Abode."
date: 2013-11-02
og_image_url: "http://25.media.tumblr.com/ee240ba31d3f2f3d04985380a78a7cb3/tumblr_mvmkbyrTe01ri2z5io1_1280.jpg"
image: "http://25.media.tumblr.com/ee240ba31d3f2f3d04985380a78a7cb3/tumblr_mvmkbyrTe01ri2z5io1_1280.jpg"
image_content_type: "image/jpeg"
layout: post
tags: tech
category: blog
---

<img src="http://25.media.tumblr.com/ee240ba31d3f2f3d04985380a78a7cb3/tumblr_mvmkbyrTe01ri2z5io1_1280.jpg" width="50%" align="right" alt="The portal to my livelihood."> *TL;DR* If you're a laptop-toting *nix user, then this is the laptop for you. Also, upgrade the kernel before you do anything else, for the best experience.

This advice is highly unqualified, though. The last time I ran *nix on a laptop was when I ran some flavour of Gentoo on an old Centrino-loaded HP in 2005. I've been a Mac user ever since those darned iPhones came out.

It's just that I ran out of space on my 128GB SSD Air for the umpteenth time, and shuddered at the thought of breaking off glued-down components according to some [iFixit guide](http://www.ifixit.com/Guide/MacBook+Air+13-Inch+Mid+2013+Solid-State+Drive+Replacement/151810). (Damnit! I just looked again, and there's no glue involved in upgrading the SSD. Oh, well &mdash; the missus needed a new laptop anyway, and this was a welcome hand-me-down. Besides: new toys!)

# First thing's first

When you do get one of these bad boys, the first thing I recommend you do is this:

<a href="https://gist.github.com/opyate/7276520">https://gist.github.com/opyate/7276520</a>

That will get you the latest kernel without upgrading *everything*. As any Linux user would know, upgrading to fix one problem introduces a thousand other problems, and this felt like a nice trade-off.

The reason for the above command is that I did have some wifi stability issues to start with, so I hope to save you that initial few dropped connections.

_Once again, kudos to [popey](http://popey.com/) over on the #ubuntu-uk IRC channel for the [advice](https://wiki.ubuntu.com/Kernel/LTSEnablementStack)._

[<img src="http://i.imgur.com/lj9GnWi.png">](https://wiki.ubuntu.com/Kernel/LTSEnablementStack)

Wifi has been stable and pretty quick. I suppose it's not all down to the new kernel and drivers: I have Virgin 60Mb fibre optic, and my walls are refreshingly free of tin foil.

# The gear

The XPS 13 comes packed with some great specs which [you can gloss over here](http://www.dell.com/uk/business/p/xps-13-linux/pd), but I'll re-iterate the key components: Intel® Core™ i7-3537U CPU @ 2.00GHz × 4, 8GB RAM, 256GB SSD of which 230-odd usable and a mega bright 13.3" screen all on a pretty little laptop that feels like an 11" one. I never put the brightness above a third of the available level, and at 1920 x 1080 it looks great.

The keyboard still sports a Windows button, but it's the new Windows logo which I'm not familiar with yet, and I pass it off in my mind as a generic "dashboard" type button, so it's all good. A [Tux](http://en.wikipedia.org/wiki/Tux) button would probably be a bit weird. I mean, what would a penguin button do? Summon a troop of penguins? Nah. Besides, penguins &mdash; just like seals and dolphins &mdash; can be [dirty little scumbags](http://www.slate.com/blogs/wild_things/2013/10/28/sea_otter_dolphin_and_penguin_behavior_your_favorite_animals_are_jerks.html).

# The ever-so-scientific bench test

I needed GIMP for something last night, and when I installed it and launched it for the first time, the realisation hit me that it all took about 30 seconds.

So, I purged GIMP and re-did it for your viewing pleasure:

<iframe width="560" height="315" src="//www.youtube.com/embed/Gt0H4_QUvzE" frameborder="0" allowfullscreen></iframe>

Apart from this, I'm running about multiple Java server apps (for this thing I'm working on), plus a couple of VMs, plus some Python scripts that are running some numbers. My software does make efficient use of all the available cores, and CPU hasn't been a problem for me in a while.

All the Linux games available on Steam runs like a dream. Just the addition of Steam of a *nix system feels like we've come full circle.

# Qualms

It's early days &mdash; a lot might still happen. In fact, Murphy's Law states that I'll publish this favourable review and it will be shortly followed by the i7 going up in smoke.

Anyway, here are some of my initial qualms:

 - The mouse is triggered sometimes whilst typing. This is configurable, and I have switched it to disable the mouse whilst typing, but to no avail.
 - The password box looses focus more times than not, and you end up typing your password in unfavourable places. This could be related to the previous issue discussed.
 - Keyboard is ever so slightly flimsy, because sometimes letters will double up. Perhaps this is just a keyboard I need to get used to. Besides, I've used the Mac chiclet-style keyboards exlusively since 2009.
 - The palm rests &mdash; even though they feel great to the touch &mdash; seems to get a bit streaky after a while. My fingers are constantly greasy from chowing on ginger biscuits and stuff like that, and it doesn't wipe down well.
 - The backspace button does make a slight squeaky sound sometimes, but this could be because my pinky finger "pulls" on the button due to the angle I attack it with. Still &mdash; I don't think this should happen.

# Outro

If anything else pops up, or if the XPS 13 makes my life significantly better in any other way, I'll come back here to amend. (I won't do those silly **UPDATE** things at the bottom &mdash; you can look at the [Git history of this page](https://github.com/opyate/opyate.github.io/commits/master/_posts/2013-11-02-dell-xps-13-linux-edition-makes-me-happy.md) for changes.)

This is my first ever piece of Dell equipment, and it doesn't look nor feel like a grey, impersonal piece of office equipment. Also, Mr. [Mark Hails-From-The-Same-Home-Town-As-I Shuttleworth](http://en.wikipedia.org/wiki/Mark_Shuttleworth) got things very right with Ubuntu. Linux has certainly come a long way since that day in 1995 when my mate dropped off 25-odd floppies of Slackware.

I'm more productive than ever and won't be going back to Apple. I certainly don't want to shoehorn OSX into a usable system with macports any time soon.
