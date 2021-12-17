---
title: "A Night At Locke Manor"
name: a_night_at_locke_manor
description: ""
layout: post
permalink: /games/a_night_at_locke_manor
thumb: /assets/games/a_night_at_locke_manor/thumb.png
category: concept
builtwith: mod gimp
pagetype: game
rank: 10
---

# A Night At Locke Manor

## Team approach

**A Night At Locke Manor** is the title of the game we made for the [IGD740](/tags#igd740) assignment. As the course was focused on the business side of gamedev, I took the prototyping mindset to developing the product, with a view to deliver something which can be used as part of a pitch to convince funders to give us money to turn the idea into a game.

As such, the game didn't need to be a full game, but could rather get away with being elaborate smoke & mirrors {% cite unity_best_2018 %}.

For this reason, I didn't immediately reach for [my game engine of choice](https://godotengine.org/), but rather made a mod using an existing engine which already specialises in the *escape room* experience, called Escape Simulator by Pine Studio 
 {% cite pine_studio_escape_2021 -A %}.

At the beginning of the module, I floated the idea with Maciej that I should make a *gameplay prototype* and that he should make an *art prototype* {% cite macklin_games_2016 -l 184-199 %}, because that would decouple us more and allow us to each flex their strongest skills (mine, development and design; his, art and visual design) without being blocked by other members of the team at any point (Shell's prototyping tip \#5: parallelise prototypes productively {% cite schell_art_2019 -A -l 110 %}).

It would also demarcate each prototype to answer its own questions (Shell's prototyping tip \#1: answer a question {% cite schell_art_2019 -A -l 109 %}): does my prototype prove that the gameplay works? And does Maciej's prototype prove that the art style works?


## What I delivered

- [v1 of our pitch deck](/assets/games/a_night_at_locke_manor/pitch-deck-v1.pdf) including all text and placeholder art
- [v2 of our pitch deck](/assets/games/a_night_at_locke_manor/pitch-deck-v2.pdf) including including some extra sections, this time with art by Maciej
- [v1 of the concept video for the game](TODO)
- [v1 of the trailer](https://youtu.be/fOYsRSwqDmc)
- [v1 of the game's Steam page](https://juanuys.com/fake-steam-page/) which included my gameplay prototype's art, and placeholder art for the capsule image ([snapshot 2021-12-13](/assets/games/a_night_at_locke_manor/steam-page-v1.png))
- a social media presence, which only includes a [Twitter account](https://twitter.com/untitled__team) with tweets showing my own art, and a custom designed team avatar, which is a mash-up of our faces ([snapshot 2021-12-13](/assets/games/a_night_at_locke_manor/social-media-v1.png))
- [press release](/assets/games/a_night_at_locke_manor/press-release.pdf)
- [v1 of studio press kit](https://juanuys.com/fake-presskit/) ([snapshot 2021-12-13](/assets/games/a_night_at_locke_manor/presskit-studio-v1.png))
- [v1 of game press kit](https://juanuys.com/fake-presskit/a_night_at_locke_manor) using art from my gameplay prototype, and placeholder art for everything else ([snapshot 2021-12-13](/assets/games/a_night_at_locke_manor/presskit-game-v1.png))
- [v1 of the 3-5 minute video](https://youtu.be/Q5HKB460E_M)

The reason our social media presence only includes Twitter, and not the myriad of other offerings (like Youtube, TikTok, etc), is because I'm on Twitter, and it's the channel I feel most comfortable using. Also, as solo gamedevs or small studios, we'll be quickly overwhelmed by community management and marketing tasks, which will leave no time for actually making games {% cite jonas_tyroller_how_2019 -l 11:37 %}.

For the press kits, everyone kept recommending Rami Ismail's **presskit()** to me {% cite ismail_presskit_nodate %}. It is a PHP file, however, and I don't host a PHP site. I ended up making a tool called **presskittie()** that allows you to generate a static version of the press kit locally, and then optionally deploy it to Github pages {% cite uys_presskittie_2021 %}. With Rami's blessing, I shared the tool with my cohort, and more widely:

<blockquote class="twitter-tweet"><p lang="en" dir="ltr">Need a press kit for your <a href="https://twitter.com/hashtag/indiegame?src=hash&amp;ref_src=twsrc%5Etfw">#indiegame</a> but don&#39;t have a PHP website?<br><br>I wrapped <a href="https://twitter.com/tha_rami?ref_src=twsrc%5Etfw">@tha_rami</a>&#39;s presskit() up in some fur over here<a href="https://t.co/MNOl3zT2eg">https://t.co/MNOl3zT2eg</a></p>&mdash; Juan Uys (@opyate) <a href="https://twitter.com/opyate/status/1469337927369076755?ref_src=twsrc%5Etfw">December 10, 2021</a></blockquote> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script> 

# The development process

## Research

Firstly, I wanted to know about all the different puzzle types one could conceivably implement in a video game. From my own experience with games, I first came up with my own list:

```
- memory games, matching puzzles
- number puzzles, equations, ciphers, dates
- Logic: matching symbols, items looking out of place, repeated themes, combination puzzles
- Text puzzles: crossword, missing letters, riddles, dates
- Spatial puzzles: combining items to form new items, perspective puzzles, keys
- Light + colour puzzles: switch lights off and on, combine colours, cast shadows, UV paint or blood, differently coloured panes of glass
- Sound: clues in lyrics, clues in ambient noise, playing chimes in order, dial tones
- Hidden objects: hollowed-out books, drawers, inside anything
- Visual: clues in paintings and pictures, things looking out-of-place, jigsaws, perspective
- Electricity: circuits, buzzers, magnets
- Codes: ciphers, Morse code, musical scales, number theory
- Physics: fire + ice, weights, heat, cracking/shattering glass
```

Then my search expanded, and I found a a bunch of useful resources, for example:

- a [Discord server](https://discord.gg/awuHNeNh) which specialises in everything related to escape rooms
- a [collection of topics](https://docs.google.com/document/d/1lwSTxIews8azOqzHEy0vyoSrX7orx55pRImXWuBVkjU/edit) specifically related to escape rooms, maintained by Brett Kuehner {% cite kuehner_escape_nodate -A %}
- [the website](https://thecodex.ca/) of one of the seemingly most vocal escape room designers, Errol Elumir {% cite elumir_codex_nodate -A %}

I spent the next few days/weeks immersing myself in the above resources.

Secondly, I set myself a goal to achieve with the game prototype, which was to make the game so intuitive, that the players will know exactly what they need to do just by playing the game, and have a clear mental model from the get-go {% cite macklin_games_2016 -l 93-95 %}.

## Design

Before building anything, like implementing the level, placing all the objects (locks, keys, etc), and linking them (i.e. which cards activate which slots), I designed the puzzle using Miro {% cite noauthor_miro_nodate -A %}. This gave me a good overview of how many keys (or Tarot cards) I would need, and how long it would take me to implement the level.

At first, I designed a more elaborate puzzle, which you first have to find a key hidden in a book, and then that key unlocks a box containing a subset of the Tator cards (see screenshot underneath). However, I simplified the design to just be a handful of cards scattered about the room, and 8 of those cards fit in one lock, which reveals the final key.

![Puzzle design in Miro](/assets/games/a_night_at_locke_manor/miro-puzzle-design.png)

I tied the Tarot cards to individual notes in the world, to be found by the player, and the [writing for the notes](/assets/games/a_night_at_locke_manor/puzzles.pdf) was to serve as clues for the player so they know *which* Tarots to use, and *in which order* to place the Tarots.

# Implementation

Apart from building a level in Escape Simulator, I did some light modding by retexturing some of the objects. Some of the textures can be seen here:

![Some of the textures used for the game](/assets/games/a_night_at_locke_manor/textures.png)

The modding engine had some limitations, in that you couldn't have custom sound, lights, or objects. (All these are planned features, though.)

I couldn't quite create the ambience I wanted to, but this was fine, as I only wanted to validate the gameplay.

To help me reach my goal of making the game intuitive just by playing it, I employed some family and friends as playtesters. After a couple of playtesting sessions, I think I reached a point where the start of the game is quite clear about what's happening, and what you're supposed to do. In fact, the game starts with you facing the door head-on, with a note stuck to the door explicitly telling you that this is the way out, and that the key is in the box to your side. 

I then go on to show one of the Tarot cards already slotted into the device. The card is interactive, and you can pick it up.

# Result

## Gameplay video

<iframe width="1024" height="576" src="https://www.youtube.com/embed/Q5HKB460E_M" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

## Screenshots

![Screenshot 1](/assets/games/a_night_at_locke_manor/screenshot-1.png)

![Screenshot 2](/assets/games/a_night_at_locke_manor/screenshot-2.png)

![Screenshot 3](/assets/games/a_night_at_locke_manor/screenshot-3.png)

![Screenshot 4](/assets/games/a_night_at_locke_manor/screenshot-4.png)

![Screenshot 5](/assets/games/a_night_at_locke_manor/screenshot-5.png)

![Screenshot 6](/assets/games/a_night_at_locke_manor/screenshot-6.png)

![Screenshot 7](/assets/games/a_night_at_locke_manor/screenshot-7.png)


# Bibliography

{% bibliography --cited %}