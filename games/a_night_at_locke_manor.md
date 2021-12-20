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

2021-12-17

## Team approach

**A Night At Locke Manor** is the title of the game we made for the [IGD740](/tags#igd740) assignment. As the course was focused on the business side of gamedev, I took the prototyping mindset to developing the product, with a view to deliver something which can be used as part of a pitch to convince funders to give us money to turn the idea into a game.

As such, the game didn't need to be a full game, but could rather get away with being elaborate smoke & mirrors {% cite unity_best_2018 %}.

For this reason, I didn't immediately reach for [my game engine of choice](https://godotengine.org/), but rather made a mod using an existing engine which already specialises in the *escape room* experience, called Escape Simulator by Pine Studio 
 {% cite pine_studio_escape_2021 -A %}.

At the beginning of the module, I floated the idea with Maciej that I should make a *gameplay prototype* and that he should make an *art prototype* {% cite macklin_games_2016 -l 184-199 %}, because that would decouple us more and allow us to each flex their strongest skills (mine, development and design; his, art and visual design) without being blocked by other members of the team at any point (Shell's prototyping tip \#5: parallelise prototypes productively {% cite schell_art_2019 -A -l 110 %}).

It would also demarcate each prototype to answer its own questions (Shell's prototyping tip \#1: answer a question {% cite schell_art_2019 -A -l 109 %}): does my prototype prove that the gameplay works? And does Maciej's prototype prove that the art style works?


## What I delivered

*Note that the below documents are just copies of said documents at the time of writing this post. The submission via the uni portal would include all the latest copies.*

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

# The game

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

Before building anything, like implementing the level, placing all the objects (locks, keys, etc), and linking them (i.e. which cards activate which slots), I designed the puzzle using Miro {% cite noauthor_miro_nodate %}. This gave me a good overview of how many keys (or Tarot cards) I would need, and how long it would take me to implement the level.

In general, I find going straight to pen & paper, or a tool like Miro, invaluable to structuring my thoughts before blocking anything out in a game engine. I was inspired by this "off-line" process years ago (back in 2007) when I learnt of the film *Shoot 'Em Up*, in which writer and director [Michael Davis](https://twitter.com/opyate/status/1471968415900446720) sketched out entire animatics of the film and pitching the film as sketches via iMovie {% cite davis_writers_2015 %}.

At first, I designed a more elaborate puzzle, which you first have to find a key hidden in a book, and then that key unlocks a box containing a subset of the Tarot cards (see screenshot underneath). However, I simplified the design to just be a handful of cards scattered about the room, and 8 of those cards fit in one lock, which reveals the final key.

![Puzzle design in Miro](/assets/games/a_night_at_locke_manor/miro-puzzle-design.png)

I tied the Tarot cards to individual notes in the world, to be found by the player, and the [writing for the notes](/assets/games/a_night_at_locke_manor/puzzles.pdf) was to serve as clues for the player so they know *which* Tarots to use, and *in which order* to place the Tarots.

## Implementation

Apart from building a level in Escape Simulator, I did some light modding by retexturing some of the objects. Some of the textures can be seen here:

![Some of the textures used for the game](/assets/games/a_night_at_locke_manor/textures.png)

The modding engine had some limitations, in that you couldn't have custom sound, lights, or objects. (All these are planned features, though.)

I couldn't quite create the ambience I wanted to, but this was fine, as I only wanted to validate the gameplay.

To help me reach my goal of making the game intuitive just by playing it, I employed some family and friends as playtesters. After a couple of playtesting sessions, I think I reached a point where the start of the game is quite clear about what's happening, and what you're supposed to do. In fact, the game starts with you facing the door head-on, with a note stuck to the door explicitly telling you that this is the way out, and that the key is in the box to your side. 

I then go on to show one of the Tarot cards already slotted into the device. The card is interactive, and you can pick it up.

## Result

### Gameplay video

I [scripted](/assets/games/a_night_at_locke_manor/gameplay-video.pdf) and recorded the first 3 minutes of our gameplay video, which is available here:

<iframe width="1024" height="576" src="https://www.youtube.com/embed/Q5HKB460E_M" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

### Screenshots

![Screenshot 1](/assets/games/a_night_at_locke_manor/screenshot-1.png)

![Screenshot 2](/assets/games/a_night_at_locke_manor/screenshot-2.png)

![Screenshot 3](/assets/games/a_night_at_locke_manor/screenshot-3.png)

![Screenshot 4](/assets/games/a_night_at_locke_manor/screenshot-4.png)

![Screenshot 5](/assets/games/a_night_at_locke_manor/screenshot-5.png)

![Screenshot 6](/assets/games/a_night_at_locke_manor/screenshot-6.png)

![Screenshot 7](/assets/games/a_night_at_locke_manor/screenshot-7.png)

# Press release

For the press release, I tried to find the most recent best practices about wording and layout online. I mixed and matched pointers from Aaron Marsden {% cite marsden_last_2018 -A %} and Alexis Santos {% cite santos_guide_2018 -A %}, but in the end made sure that I communicated all the most important information.

I didn't include too much studio information, as this press release is about the game, and the studio information can already [be found online](https://juanuys.com/fake-presskit/), with the link shared in the press release.

The press release isn't addressed at any particular journalist, but any press outreach would be more personal, as this press release is really just informational.

# The Steam page

For the [Steam page](https://juanuys.com/fake-steam-page/), I took all my pointers from Chris Zukowski's free course on how to make a Steam page {% cite zukowski_how_nodate -A %}. These include:

- using verbs in the short description, as potential players want to know *what* they'll be doing in the game, and don't care about any lore yet at this point
- using the long description area (called "About this game") to show more animated GIFs of the game, as no-one will read long textual descriptions of the game. (An established narrative-rich franchise might write more words here.)
- having one trailer which gets straight into the action. Chris references the trailer-master [Derek Lieu](https://www.derek-lieu.com/) quite heavily here, whom I'll talk about separately. The value that Chris adds here is that he ran some experiments and saw that potential players skip through trailers until they see gameplay, as they want to quickly verify if it's a game for them, and something they might like playing.
- choosing the right tags, so that Steam matches you with the top-selling games that inspired you. This way, if someone is searching for the known game, chances are you'll be shown in the same search result for that game. (Please note that I made a mock-up of a Steam page, so couldn't play around with tags until I got a desired result.)
- showing varied screenshots. You want to show different scenes and UI so the player knows your game has depth and content.

# Social media presence

Wlad Marhulets recommends you choose a social media channel that you're on already, that you're comfortable using, and where you know the tone of voice {% cite marhulets_gamedev_2020 -A %}. The last thing you must do is take the same message, and post it on every social media channel. Your message will come over as flat in most places, and you'll just end up getting ignored.

As an indie, I don't have much time, so will be foregoing all the channels which require too much work, like video creation. That includes Youtube, TikTok, etc.

I created a real presence on Twitter, as [I'm already on there](https://twitter.com/opyate): [https://twitter.com/untitled__team](https://twitter.com/untitled__team)

Please follow that account to see all the tweets, as they are currently protected. The snapshot I shared at the start of this post won't show any animated GIFs.

To be effective on Twitter, you need to share animated GIFs and the odd video. We haven't made any videos, but if we did, we'd upload the video natively to Twitter, instead of sharing a Youtube link, as Twitter would auto-play native videos.

# Pitch deck

We went [in-depth on pitching in the previous module]({% post_url 2021-07-06-week-6--practice-pitch-week %}), so I won't re-iterate my learnings and research here. Please see that blog post for more information and the relevant citations.

# Trailer

Most resources on making game trailers point to Derek Lieu''s website {% cite lieu_how_nodate -A %}. Some of the pointers include:

- get straight to the action, and don't bore potential players with logos, especially if you're unknown (no-one cares about your studio logo)
- remove UI (I couldn't do this, as I was using an inflexible modding engine)
- pay attention to pacing. Show a blast of action in the first few seconds, then cool it down, then rise again towards the end, then stop before anything is revealed (to tease), then perhaps show something funny at the end as a reward. (I couldn't show a blast of action, as it's not an action game, but I did attempt a little crescendo, in which you can hear the protagonist ask where they are, then looking around corners, to drive the tension up, with some tense music and the Hollywood trope of making the screen go black and hearing heart-beat sounds. I also didn't show anything funny at the end, as it didn't feel appropriate.)
- show verbs, and show what the player will be doing. I show the protagonist picking up objects, inspecting items, etc
- let the actions happen in sync with the music's rhythm

There are many more guidelines and some "rules", but in the end, these are meant to be broken, and you're meant to be creative, otherwise all trailers would feel the same.

# Bibliography

{% bibliography --cited %}