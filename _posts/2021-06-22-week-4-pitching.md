---
layout: postcrj
title: "Pitching"
description: "Week 4 - Pitching"
tags: ma falmouth crj week4 teamwork ma-co-creative gdd730
category: blog
# disqus_comments: true
thumb: /assets/masters/crj/thumb.png
week: 4
module: co-creative development
code: GDD730
---

I keep thinking back to my startup days, and endlessly agonising over the pitch deck. It had to be max 10 slides {% cite kawasaki_only_2015 %}, contain lots of graphics and almost no words (you don't want your audience to read - you want them to listen), and you want to grab their attention for 5 minutes. No dawdling, no droning on.

We'd start off with established knowledge of slide decks (citations evade me now, as I can't remember the specific websites we perused back in 2010-2012), and then fine-tune based on live data, from delivering the pitches at e.g. the [Dublin Web Summit](https://en.wikipedia.org/wiki/Web_Summit) {% cite noauthor_web_2021 %}, or at our incubator [Wayra](https://www.wayra.uk/) {% cite noauthor_wayra_nodate %}, the latter at which we'd get one-on-one coaching from our mentors (again, not very cite-able).

That said, Josh is taking the lead on the pitch, and I'm happy to be around to assist.

# Pitching in the Covid era

We'll be pitching to a panel of experts via video chat, but we also have the option of pre-recording our pitches. I think we're currently preferring a live pitch, but we'll see what happens when we get to week 6.

Meanwhile, I've been looking into digital pitches, and what the upsides and downsides of a pre-recorded pitch is.

All the below are taken from the [UK Business Angels Association](https://ukbaa.org.uk/digitise-your-pitch-events-tips-and-advice-for-how-to-move-online-during-the-covid-19-pandemic/) {% cite noauthor_digitise_2020 %}, plus a few of my own ideas.

- live pitches can fall victim to "demo bugs", i.e. screen-sharing doesn't work, or you hook up the wrong audio source, or your Internet connection dies
- likewise, pre-recording pitches can alleviate the pressure that pitching via an online platform can have.
- pitching live gives the founder their moment to shine, whereas pre-recording could make it less engaging. (This can be alleviated by doing polls in the pre-recorded pitch, e.g. asking for a raise of hands for a certain question)
- currently, *smaller* investments are happening as a result of digital pitching events and investors prefer to see founders face-to-face before committing funds
- pre-recorded pitches are something you can re-use, and potentially refine based on feedback
- conversely, live pitches have the benefit of the presenter being able to "read the room" and adapting on the fly
- pre-recorded pitches can benefit from more dynamic content. It's a video, after all! This will make it more engaging

# More fun with Twine

As the go-to Twine {% cite noauthor_twine_2009 -A %} developer on our team, I've been flexing my muscle a bit as of late trying to get the more advanced features to work, like registering the mobile long-tap event to restart the game, or playing simultaneous audio streams at certain times during the experience.

Again, the SugarCube {% cite noauthor_sugarcube_nodate -A %} story format did most of the heavy lifting, but I had to apply some programming chops, and get jQuery mobile {% cite jsfoundation_jquery_nodate %} integrated with SugarCube to get some of the more advanced gestures to work. The SugarCube documentation is very well written, and it takes me absolutely no time at all to find the feature I need, and implement it.

I did some additional research to figure out how to get a Twine app to run on mobile, and stumbled upon Apache Cordova {% cite noauthor_apache_nodate %}. It turns out, Apache Cordova is an evolution of an older product called PhoneGap, which is something I've tinkered with about 10 years before.

This is great news, and means that even if we didn't have enough time for a Unity implementation, we had enough tools to make the Twine app run on mobile and tablet, which is our main target platform.

# Week development log

## 2021-06-22

- Work on voice synthesis task, and generate a couple of samples, and share with team for feedback

## 2021-06-21

- Posted team Rapid Ideation Plan to Canvas
- Posted my team's approach to "6 thinking hats" to Canvas

## 2021-06-20

- work on Twine prototype: long-press to restart

# Bibliography

{% bibliography --cited %}

