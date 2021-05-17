---
title: "IGD 720 Essay"
name: igd720essay
layout: home
description: "My IGD 720 essay"
permalink: /masters/igd720essay
# thumb: /assets/masters/about/thumb.jpg
# pagetype: masters <- this hides it
rank: 200
---

<!--
All:
- detail how well the theoretical principles of the 7 disciplines aided my process

40% practical insights
- what lessons did I learn?

40% theoretical understanding
- integration of theories, concepts, principles from reading list (and beyond)

20% academic rigour
- standard of writing
- fluency
- well-structured args
- referencing

# reminder of 7 disciplines
Game design
Programming
Narrative design
Art
Animation
Level design
Sound design

# brief

Assignment 2: Don’t just describe your process, or your finished game. We want to know what you have learned from the module and how that learning is supported by relevant literature. Where possible, try to trace ideas back to their origins rather than relying on secondary sources. Make sure you follow the course’s guidelines for citations and referencing.  

The brief suggests a structure to help you keep your report focused and concise. You may find it easiest to write the middle sections first, and the introduction and conclusion afterwards. While this report should be a new piece of writing, you can draw material from your reflective journals, spark activity and challenge task responses, which should make the 2,000-word target much easier to reach.

 -->

# Introduction

Contumacious Commuter {% cite uys_contumacious_2021 %} is built with Godot Engine {% cite engine_godot_nodate %}. The game is a combination of many prototypes across the 7 disciplines of game development. This essay discusses three of the disciplines in depth, which are narrative design, game design, and art direction. These are also the disciplines I highlighted at the start of the module as being most excited about mastering {% cite uys_igd_2021 %}. I'll also cover a bit of programming, as it's my dominant skill, but there's always room for improvement.

A lesson I learned during this process was that I, as a programmer, can't rely on *just* my programming skills to make a game. A game designer needs as many skills as they can muster, as almost anything that you can be good at, can become a useful skill for a game designer {% cite schell_art_2019 %}.

This is a tall order, especially for a small studio, or a single-person micro/nano studio like myself. As such, Renaud Forestié reminds us to minimise scope, as “it’s really about putting the minimum effort possible to do what works” {% cite unity_best_2018 %}.

I set out to consider the development of this prototype the "pre-production" phase of Mark Cerny's *The Method* {% cite academy_of_interactive_arts__sciences_dice_2012 %}, after which I would have a “publishable” first playable, and be ready to enter the production phase, which should only involve content creation for the game, and not be spent making any new game-changing decisions.

More importantly, prototyping is supposed to be a time-saving experiment in that each prototype should be designed to answer a question {% cite schell_art_2019 -l 109 %}, which I certainly feel I've achieved. However, I did learn that I should have involved play-testers much earlier than I did, as valuable feedback from testers that fundamentally change some aspects of the game, came quite late in the process.

# Narrative design

I start with narrative design, as it was the one discipline I initially discounted in a moment of weakness {% cite uys_igd_2021 %}, but I have a growth mindset {% cite stanford_alumni_developing_2014 %}, and did a Coursera course in narrative design {% cite coursera_story_nodate %}. This discipline became the one I (by far) had the most fun with, and wrote over 5,000 words for {% cite uys_juanuysccgdd_2021 %} to come up with the game’s story structure and core emotional elements including theme, plot, character, and dialogue {% cite lionbridge_narrative_2020 %}.

Not only does a story provide greater emotional satisfaction and sense of progress to the player in terms of dramatically meaningful (rather than abstract) goals {% cite adams_fundamentals_2014 -l 208 %}, but it gave me &mdash; the designer &mdash; a deeper understanding and love of my game, and the worldbuilding provided plenty of lore and content to inform the other disciplines:

{% quote heussner_game_2015 -l 49 %}
Along with creating settings and determining the world's scope, a narrative developer's worldbuilding influences art design and sound design by suggesting what the game should look and sound like.
{% endquote %}

Also, the level designer will mine your backstory to find narratively appropriate content to put in the game {% cite heussner_game_2015 -l 58,62 %}, even if players will only see the tip of the narrative iceberg {% cite heussner_game_2015 -l 61 %}.

The fact that the narrative design influences so many of the other disciplines, definitely puts it near the top of my todo list for future games, right after coming up with genre, core mechanics, and context {% cite skolnick_video_2014 %}. I hope that it will edge me closer to success, as video game reviewers typically have low expectations for the narrative quality in games, and anything vaguely better than the norm would make them sit up and take notice {% cite skolnick_video_2014 %}.

Worldbuilding needs research {% cite heussner_game_2015 -l 49 %}, but since this is just magical realism and based on real, normal life I already know, I got away with skimping on in-depth research. I might benefit from this time-saving technique by making future games using what I already know, as a developer's own experience, or that of their team, can be excellent sources of inspiration {% cite heussner_game_2015 -l 53 %}.

E. M. Forster distinguished between flat and round characters in *Aspects Of The Novel* {% cite forster_aspects_1985 -A -l 75 %}, and having rounder characters is a positive {% cite anderson_creative_2006 -l 74 %}.

Ernest Adams states “coherence” and “dramatic meaningfulness” as requirements of a good story, in that the events in the story must not be irrelevant or arbitrary, but must harmonise to create a pleasing whole {% cite adams_fundamentals_2014 -A -l 211 %}. I therefore rewrote some of the narrative: in an earlier version, the protagonist encounters random enemies, but in the latest version the protagonist encounters friends of the antagonist that the protagonist learned about in a photograph. The photograph then also becomes a list of enemies you can expect to encounter, and cross off as you beat them.

Linear stories are simpler as it requires less content, and are less prone to bugs and absurdities like continuity errors {% cite adams_fundamentals_2014 -l 221 %}, and I learnt that this works best for this game. I didn’t have to develop systems to support open worlds and branching narratives, and could focus on the card mechanic, and a suitably entertaining linear story to carry us forth.

In keeping with building a prototype and having a minimum viable product, I decided to tell as much of a story as the player needed in a couple of images, the first image already being on the game’s main menu. There were no written words for the player to read, and no recorded words for the player to listen to. This has knock-on savings in terms of internationalisation, voice acting, and so forth {% cite sylvester_designing_2013 -l 330 %}. Those 2 images told all the player needed to know, and saved me a bunch of time.

# Game Design

When I planned the game initially, I kept Schell's "Plan To Cut Rule" in mind, which is to make sure that you build it in such a way that if 50% of the budget was removed, you could still have a shippable game {% cite schell_art_2019 -A %}. Alongside that is the "50% Rule": all gameplay elements should be fully playable at the half-way mark in your schedule, so you spend half the time getting the game working, and half the time making it great {% cite schell_art_2019 -A %}.

Keeping to these rules were my saving grace in the end, as personal circumstances took a 6-8 week bite out of my schedule. As such, the prototype is as simple and bare as it can possibly be. I will definitely keep this in mind for future endeavours and be ruthless about getting the core of the game done in good time. 

The "possibility space" {% cite indie_games_collective_triforce_2015 -l 603 %} in my prototype is only the playing cards. I've found that having a small surface area of interaction makes the design much simpler, and testing easier, and reduces risk {% cite gdc_how_2017 %}. For future games, I will focus on getting the one core interaction perfect before implementing subsequent possibility spaces. Besides, the world wouldn't miss yet another another crafting system {% cite google_gaming_nodate %}.

Limiting the possibility space ties in with McEntee's "Rational Design", which is all about eliminating unnecessary information, making things inherently readable, understandable and apparent, introducing mechanics in an orderly and easily digestible fashion, and preserving the learning and difficulty curves of a game, known as macro flow {% cite mcentee_rational_2012 -A %}.

When traveling on public transport, one can encounter annoyances like elbow jabs, knee bumps, smelly food, and so forth. These annoyances are the "attacks" you can execute using the playing cards, to push the enemy's annoyance level up in an effort to defeat them and transition to the next level. Games can actually play a powerful role in creating empathy and other strong, positive emotional experiences {% cite isbister_how_2017 %}, so I hope this game will send a message about being a more conscientious fellow commuter.

# Art direction

A lesson that I learnt about myself and art direction, is to make decisions and stick with them, as one can carry on changing designs forevermore {% cite sylvester_designing_2013 -l 363-9 %}. (Even as I'm writing this, I'm thinking about changes I can make to the game's art, but I won't, as I'm too far along.)

When making games, I prefer abstract over realistic depictions of characters, as this leaves more to the player's imagination, just like the nonsense babble in *The Sims* {% cite isbister_how_2017 -l 36 %}. Scott McCloud agrees:

{% quote mccloud_understanding_2017 -A -l 36 %}
Thus, when you look at a photo or a realistic drawing of a face, you see it as the face of another.
But, when you enter the world of the cartoon, you see yourself.
{% endquote %}

![Abstract vs realistic imagery](/assets/posts/2021-02-16-narrative-design/abstract-vs-realistic.jpg)

Fig. 1: McCloud 2017. Understanding Comics.

On directing art for something one wants to ultimately sell, raises the question: *do I make what I want, or do I make what they want?* The IGD720 module suggested we research the target market {% cite noauthor_week_nodate %}. Simon Carless also discusses this matter in his latest newsletter, where he studies an indie game which disregarded the market, contrary to the popular notion of "must make this game fit into the market, or else" {% cite carless_steam_2021 -A %}.

My view is that if you do research now, and release in 2 years, then you're 2 years out-of-date, so you might as well make something artistically daring. This fits with the business model I currently have in mind for my venture, which is to self-fund and work on games 20-40% of the time: if the game fails, I'm not financially ruined, as I earned an income during the other 60-80%. I know this is a grossly simplified (and naïve) view, and we'll learn more about the entrepreneurial side of this in a future module, so I'm on the fence.

One of the most valuable tools I picked up during this module is Lee Petty's *Four Fs* {% cite mediaxstanford_elements_2017 -l 1587 %}, which allowed me to make big-sweep and concise decisions about the game early on.

Stardew Valley took one person 4 years {% cite baker_4_2016 %} and Gorogoa took over 7 years {% cite kohler_puzzle_2017 %}, although the developer paid for some help at the end. Conversely, there are studios like Sokpop collective {% cite sokpop_collective_sokpop_nodate %}, who are a team of 4 who makes a new game every month, which is a tight cadence for any studio. These conflicting durations raises the question: *how long should I spend on art?* Stardew Valley's success is a bit like winning the lottery, where-as the Sokpop guys have a more sustainable and regular monthly income {% cite noauthor_sokpop_nodate %}. Since I'm more in favour of guaranteed income and not "betting the farm", simple, low-effort art is the way to go for me.

# Programming

A first iteration of the prototype employed SquiggleVision {% cite snyder_united_2001 %} to make the line art seem alive, and I drew 4 or 5 variations of the same picture to achieve the effect. Having to extrapolate this across multiple characters would have been expensive and time-consuming, so I used a shader to wiggle the line art instead. Learning shaders is one of my SMART goals {% cite uys_juan_2020 %}, and definitely a core ingredient in my toolbox.

I thought that I reduced risk by implementing a 3rd party Godot card game framework {% cite zer0_db0godot-card-game-framework_2021 %}, but it ended up taking me a while to wrap my head around the framework, which risked putting the project way past the deadline. On the other hand, once I had the framework in my head and started submitting suggestions and enhancements, I realised what a solid and flexible foundation I had to work on. There's a whole community around the framework, so it'll always be maintained. My future projects and endeavours will also stand on the shoulders of giants, and involve the community and special interest groups as much as possible, which will also alleviate the loneliness experienced by indie developers {% cite spacecow_how_2020 %}.

# Conclusion

Some lessons that I learnt during the prototype development, is that every discipline is equally important: one weak pylon will make the entire structure come tumbling down {% cite adams_fundamentals_2014 %}, and that game design cannot be learned from books, but with experience {% cite sylvester_designing_2013 -l 47 %}.

{% quote schell_art_2019 -l 109 %}
Prototyping is supposed to be a time-saving experiment in that each prototype should be designed to answer a question.
{% endquote %}

Prototyping answered *yes* to the question of whether "active turn time" works well in a card game.
Even with the basic set of cards that I made for the prototype, I found that I had to think much faster, which made for more exciting gameplay than having regular turn-based play.

![Active turn time poll](/assets/posts/2021-05-13-weeks-10-11-and-12/poll.png)

Fig. 2: Uys 2021. Excerpt from poll

Prototyping also answered *yes* as to whether using shaders is a time-saving tool in some cases, like with SquiggleVision.

The 5th of Jesse Schell's 10 tips for productive prototyping is to paralellise prototypes productively {% cite schell_art_2019 -A -l 110 %}. I managed to parallelise a couple of my prototypes by coding during the times when I’m awake and fresh, and drawing the art while I’m hanging out with the kids and supposed to be away from screens, which is a great way to get more prototyping loops done.

Is the toy fun?

{% quote schell_art_2019 %}
A ball is a toy, but baseball is a game. You should make sure that your toy is fun to play with before you design a game around it.
{% endquote %}

Shuffling the cards, dealing a hand, and moving the telegraphing arrow around the screen is already fun and looks good, so this is a promising base for the game to build on.

Could this be a "game for change" {% cite noauthor_home_nodate%}, and teach players to be a more conscientious fellow commuter, by shedding light on the annoyances of public transport? Only time will tell.

Future work will include more levels, characters, cards, buffs and debuffs/nerfs {% cite game_makers_toolkit_how_2019 %}, rewards, and achievements.

# Bibliography

{% bibliography --cited %}

# List of figures

- Figure 1: MCCLOUD, Scott. 2017. Understanding Comics. Reprint. New York: William Morrow, an imprint of Harper Collins Publishers, p. 36.
- Figure 2: Uys 2021. Excerpt from poll during development of game prototype.
