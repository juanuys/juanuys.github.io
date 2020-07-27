---
layout: post
title: "Coursera - Introduction to game design"
description: "Course notes for Course course Introduction to game design"
tags: coursera gamedesign pen-and-paper-game
category: blog
---

I completed [CalArts' Introduction to Game Design on Coursera](https://www.coursera.org/learn/game-design) and here are my course notes.

# Week 1

Week 1 kicks off discussing the elements of gaming, by using the [cup & ball game](https://en.wikipedia.org/wiki/Cup-and-ball) as an example. A game's basic ingredients are
- a goal - catch the ball in the cup!
- difficulty - it would have been too easy if you could just place the ball in the cup, so the rules are you have to swing the ball into the cup
- chance and skill - you can get skilled at ball/cup by playing loads. There's a bit of chance involved in how the ball moves, and bounces off the edge of the cup. (unless you have razor-sharp reflexes and atomic-level knowledge of the world, you won't know exactly how the rope/ball physics will interact)

Onto the [GDD](https://en.wikipedia.org/wiki/Game_design_document), which is a description of the game, the gameplay, and the goals, puzzles, and characters. It may contain illustrations, maps, story lines, and technical information (e.g. programming techniques used with the engine). It's used for collaboration, summarising the game, or just a scrapbook of thoughts for the lone designer. (I myself have been writing GDDs for all my games since about 2016, and I plan to link to all of them from my [games pages](/games).)

The week's first assignment is making a pen and paper game, with the restrictions being that it fit on one piece of A4 paper, it being for one player, that it ought to include a description and instructions, and you can choose to use 2 dice - `2d6` for the rest of us ;-) Here's where we're urged to relax, make long-as-possible lists of options, and try different themes, to help the brain juices flowing. Since Coursera relies heavily on peer reviews/assessments, they take a moment to talk about constructive feedback, which is as useful in a small ad-hoc game jam team as it is in the studio:
- stay constructive, polite, and civil
- examine the project, think about it, figure out why you feel a certain way, and share your thoughts and reasoning
- look beyond imperfections which might be introduced by language barriers, etc

My submission (I'll link to my final version at the end) pretty much has all the main ingredients it will have for the remaining weeks:
- a pen & paper game called Alien Breach
- it has a little backstory as an opening
- hand-drawn game board, albeit quite basic
- cut-outable characters for the Astronaut (player) and Alien ([NPC](https://en.wikipedia.org/wiki/Non-player_character))

The feedback I get from my peers are to use some colour (I counter with a no as I don't have time to test a colour edition with black & white printing to check if the game would still be legible and playable), and the instructions could be a tad clearer, which I readily fix.

## What did I learn?

I'm reminded that Coursera peer assessments aren't university-grade. There are no entry requirements, and it's mostly free, so expect every calibre. Some comments were just a "." which were just put there to get beyond the "you have to submit something" restriction. I did feel cheated after leaving quite substantial feedback myself.

Since this week is quite high level and introductory, it is a rehash of things I know, but I did invent my first pen & paper game in a while.

Oh, and before I forget, I converted my game to a Python simulation so I could determine whether the game favours either character, and it turned out to be quite balanced in the end. (link TBC)

# Week 2

This week we talk about game rules. They will help your game achieve balance, and keep the game interesting and challenging. Will a rule make things too easy or difficult? You don't want to put off players. Will they give your player a new goal to reach for or help create a new challenge? Will they force your players to think of new approaches and techniques for playing?

What are rules? For example, a rule might state that your character can jump 5 feet. Think about what the rule means and how it affects the game and gameplay. There are many types of rules, e.g. world rules, or gameplay rules.

World rules: define the way the world works. E.g. platforms (the floating rectangles Mario jump onto) are static (they don't fall to the ground as Mario lands on them).
E.g. for [Pong](https://en.wikipedia.org/wiki/Pong):
- each player has one paddle
- the paddle can only move up or down
- the paddles can not move above or below the screen.
- speed of ball is affected by the speed/direction of paddle

Gameplay rules: it defines the game in the way it is won or lost; how it is played. It might explain the narrative aspects, or lay out various goals a player needs to achieve to complete the game.
E.g. for Pong:
- the ball starts from the dotted line in the middle of the screen, moving at medium speed towards the right side of the screen
- ball falls off left, right player scores, and vice versa
- first player to reach 11 points wins
- when either wins, the game ends

World & Gameplay rules are one way to organise rules, but you can find any way which works for you and your studio/project.

As a game designer, you can break the rules, even mid-game, e.g. reversing gravity. Be careful, though: will it simplify or complexify the programming? Will it frustrate or excite the player? Will it bring interesting variety?

How does your player learn the rules? You can write documentation (booklet online, or text in-game), you can use narration (audio guidance, e.g. [Portal](https://en.wikipedia.org/wiki/Portal_(video_game)) makes narration a part of the game, and the opponent's character), or better yet, use in-game discovery (show, don't tell).

The assignment for the week sticks with the pen & paper game, but you now have to consider rules. What are the rules for my game?
- e.g. if using dice, how would it change the game if they're only allowed to move on odd-numbered rolls?
- e.g. roll 6 means go back to start

Are my rules balanced?
- e.g. the rules might favour the world/NPC too much
- my game might be over too quickly

Additionally, (and this is something which comes up in subsequent weeks) we're asked to our peers some context from the previous iteration of the game we're making. For instance, what peer feedback did you find the most useful, and how did you incorporate it into your new game? We're also asked to describe how we articulated the world or gameplay rules in this game. Specifically, have you used documentation, narration, or in-game discovery? How has your approach to game rules, instructions, or gameplay enhanced balance or engagement in your game?

The feedback: one peer asks me to restructure my instructions a bit as it doesn't feel like every bullet point has the same weight. I resort to removing bullets, and have the style flow more, with plenty of examples of play. (As noted before, most feedback is just a "-" or a ".", which is a shame.)

This week I decide to add an extra rule to my game which makes it a bit more fun, but keeps the game balanced.

## What did I learn?

This is all very good practice, being able to think and write about the game. I think as untrained, solo game developers, we all too often just start coding an idea, get it half-baked, then put it out there. Thinking critically about the game from all perspectives is valuable time spent on your game. You start to realise the value of play-testing. I played the game with my kids, and they loved it, but who knows - they might already be conditioned to me and the way I think, and also miss some of the things which caught Coursera peers out.

I learnt that all my GDDs could do with a rewrite as far as rules are concerned. As a solo developer, the rules are always in my head, so I've been skimping on the detail there. I'm also starting to feel that I should perhaps form a team next time I do a game jam, so I can really exercise my GDD and other communication skills. I made a game collaboratively once a few years ago, but it was with one of my best friends, and we're a bit of a Hive Mind. Brothers from another mother, and all that. (And for some reason, I miss [Moai](https://en.wikipedia.org/wiki/Moai_(software)) now...)

# Week 3

Tell a story. A story can do something for your games, make a game more interesting and emotionally involving, make it inspiring to a player, or inspire you to make better games. It gives games context and narrative.

Some more useful purposes for having a story:
- create empathy in the player.
- communication: what is the game about? Explain the game.
- inspiration: game possibilities are endless, so the story can narrow down your setting, time period, character profession, etc. It can then inspire you to go find good material related to these restrictions.
- emotion: you can't just rely and colours and music etc for emotion, so here's where story helps.
- surprise: players expect certain things from your game, but also want to be surprised. E.g. the story could be a zombie invasion, but then a surprise could be a normal person with a limp (e.g. looks like zombie) who has valuable information about the next mission. A story can help set up good surprises.
- motivation: a story can explain the purpose of the game, and help lead them through the conclusion. Motivate the player through story to solve the crime, find the princess, etc.
- specificity: story and context helps make the game feel specific. E.g. a square hopping through rectangles is boring, but a bird flying through pipes is Flappy Bird.

What is the benefit of narrowing the focus of your game's story?
- Without focusing your ideas in a specific area, you might be overwhelmed by an infinite number of choices.
- If you focus on a specific setting for your game, you can use imagery from that setting for inspiration for your game's visual design.
- If you focus on a specific time period for your game, you can use writing and stories from that time period as inspiration for your game's narrative.

Who's in charge of your game story? There could be collaboration between game designer and the player. The player wants to feel they're driving the story, and be more involved. We then discuss writer-driven, writer-led, and player-led stories.

Writer-driven stories should ultimately be avoided as there are many disadvantages. E.g. the cutscene. Player has no control whatsoever as the cutscene plays out. E.g. a tunnel - player has no choice but to go down the tunnel. The game might have branches, but they might all end up at the same result. The player has spent hours with a character (and developed empathy for the character), only for the character to be forced down a certain direction in a cutscene, and they feel they aren't inside their character anymore. Someone else is now playing their character. Or, you have a strong/athletic character, and the cutscene shows your character being weak and easily overrun. Frustrating!

Writer-driven stories has some advantages. It keeps the game simple in terms of things like programming or animation. The writer helps make choices that are more appropriate for the game character. E.g. character is a rocket scientist, and the cutscene lets the character *"do their science"* which the player would not have been able to (unless the player is a rocket scientist!). It allows the writer to tell big chunks of story without being interrupted. It can force the player to make mistakes, and make the journey more interesting, creating a problem to solve for the player. However, players don't want to be forced to make mistakes - they want to make good decisions. The game character could have a troubled past, and the player has a lot of issues to fix as the character's mistakes catch up with them. Or have a side-kick who makes questionable decisions.

Writer-led stories allows you to take advantage of player curiosity. E.g. player gets to a split in a passage and a ghostly voice might come from the right, enticing the player to go that way. (Writer-driven would have just shown a cutscene where the character goes in the right tunnel without the player intervention.) If your player is afraid of ghosts, or choses to avoid the ghost for whatever reason, write for the other outcome. Given enough time, most writer-driven games can be made writer-led games. It's up to your time/resources.

Player-led stories are much more involving and fun, and it can have outcomes not intended by the designer. Players create their own challenges: E.g. play Mario with a blindfold, or play an adventure game without firing a single bullet. These kinds of game require the most testing.

We go on to roleplaying, character motivation, and empathy. As we now know, a game story that works well is written by the designer AND the player. For example, don't put a city next to Death Mountain and not allow the player to explore the city, if you intended for them to go up Death Mountain. Good practise here (if you've never tried) is to play D&D (or a variant), and be a DM. Get some practice at creating stories that excites players and guides them down avenues you think up. The more your story can include decisions of your players, the more your players will feel involved with your game. So, always test your stories with players.

The purpose of playtesting is to...
- find out how a player might interact with challenges in your game.
- learn how to entice your player towards your chosen storyline.
- see what parts of your game are most interesting to your players.

Stories are also vehicles for Explaining and Imagining. [Pac-Man](https://en.wikipedia.org/wiki/Pac-Man) pellets would look out of place in a rich open-world space game, e.g. seeing a pellet on the floor doesn't inspire "health pack" quite as much as a medkit, for instance. So, depending on the game, your objects might be simple or detailed. Some things need to be simpler to improve focus on other more important things. Balancing simple and complicated things is an important part of game design and the use of *contrast* is one of the most powerful tools you have to work with. 

Here are some ways to identify an object:
- imagery (e.g. simple gray pellet, or hamburger as a power-up)
- story (e.g. finding a pellet in an informant's bag)
- sound (e.g. the pellet can play music when we approach it)
- behaviour (e.g. the pellet moves in a certain way)
- interaction (e.g. the pellet might have an effect on the player)

You might not do this for ALL objects in the game, but for the important ones. (e.g. lots of useless tin cans lying around in Half-Life which is just for show, or "props").

The assignment for the week revisits the pen & paper game, but asks *what is my story*? What is my story doing to affect the game and the character? Does the story change the way a player might act? Are the players discovering things as they go through your game? Does it have a start/middle/end? If I make a game and the main character's a werewolf, would that change the way my player reacted to pictures of full moons and silver bullets? Can you edit, remove parts without changing the story? If you show your game to a friend, and then ask them to tell the story back to you, what do they say?  (This helps test whether your game is communicating what you think.)

Feedback on my game this week: someone liked that I put cut-outable characters in the game, and also likes my story (yay!). Someone liked the extra rule I added. Someone else suggest I add a bit of story to the end conditions of the game, so I add a bit of prose for when the Astronaut wins, and likewise for when the Alien wins.

It just so happens that someone I assessed then assessed me back. Their game was simple, yet vibrant - lots of colours and swirling lines, which I quite liked. The feeling wasn't quite reciprocated, understandably, as my game is quite dark and black & white. Oh, well - different strokes for different folks and all that.

## What did I learn?

This was my favourite week, as I love a good story. Even though my pen & paper game has had story since week 1, I learnt to pay more attention to story in future games. I learnt the difference between writer-driven and writer-led. I've been aware of player-led vs "anything else", but it was good to learn these finer distinctions. Again, all too often someone with a programming background like me would make a game because we like the coding challenge, then skimp on a lot of the other components, especially the story (that said, not all games have story, and can be just straight-up gameplay like [Tetris](https://en.wikipedia.org/wiki/Tetris), and [some folks](https://www.theatlantic.com/technology/archive/2017/04/video-games-stories/524148/) reckon story has no place in video games). I'm also reminded to play some more [Pathfinder](https://en.wikipedia.org/wiki/Pathfinder_Roleplaying_Game)!

PS incorporate story into your game if it makes sense to do so.

# Week 4

This week we talk about friends and foes. Party members, game enemies, etc. These could be real-life people in multiplayer (PC, or "player character"), or NPCs, for surprise, unpredictability.

NPCs can have personality, and this can be subtly defined by their behaviour in the game. Say you're playing a simple die-based racing game, and you roll 3.5 on average. An NPC racing car which rolls 1 or 2 is the "sad, unlucky loser". The NPC who rolls 5 or 6 will be fast, or the "difficult adversary". You the player can start projecting personality on these NPCs. Imagery can have a great influence too: the slow car with F1 imagery could seem like an over-funded but incompetent driver, where-as the fast car with "old car" imagery the player might see as a "lucky old timer". All the aforementioned personalities/emotions are created by just adjusting just one number and a bit of graphics. Furthermore, an NPC that's slow first and fast later can seem like "their luck is turning". An NPC that's fast/slow/fast can seem like they're "toying with you".

There are many types of characters, and depending on your game, you can have villains, townspeople, adventurers (they coule be nice, or compete with you), friends (e.g. for backstory), monsters (our old favourite), and turncoats and traders. Do you the game designer want to achieve something that a character can add? If you want to make a character more interesting, you could reveal something new about the character, or change the character into a different type of character, or use the character to reveal something about your game's setting.

Multiplayer has its own rules and balance, e.g. have all players start with identical abilities. If you take [Street Fighter](https://en.wikipedia.org/wiki/Street_Fighter_(video_game)) as an example, powerful is paired with slow, and weak(er) is paired with fast, which balances the ensuing brawl. You can balance in many other ways, e.g. the loser respawn somewhere else safer and quieter, or the fast karts in [Mario Kart](https://en.wikipedia.org/wiki/Mario_Kart) can not shoot backwards. (I suppose the banana peel doesn't count as shooting ;-)

The assignment this week wants us to add NPCs to our game, which I've had from the start, so I submitted week 3's version and got great reviews, which I'm happy with. Maybe we've acclimatised to the complexity by this point.

## What did I learn?

NPCs can be rich, engaging characters which can influence and enrich your game in many ways with their unique personalities. Small tweaks make for vastly differing personalities, so I'm keen to try more character types in future games. I've also learnt to look more critically at characters from a GDD standpoint, and when I'm playing games now, I can't help but be very critical of every character I encounter. I start noticing NPCs that don't add to the game, or who are just a bit "off" in my book. E.g. ever wander through a medieval village and just have a random townsperson spew their life story at you without you engaging? Yes.

# Conclusion

I'm one course down on the [CalArts game design specialisation](https://www.coursera.org/specializations/game-design) and I'm excited to start the second course. I'm a bit wary of poor and badly considered feedback, so I'm looking further afield to bolster my design skills. I'll update this blog when I have some more news.

And, as promised, here's v0.4 of [Alien Breach](https://docs.google.com/document/d/1KiUbJ9HpQSaqYgRd9eoJVtWK5T4F44ioWb_lraqdsHc/edit?usp=sharing). Enjoy!