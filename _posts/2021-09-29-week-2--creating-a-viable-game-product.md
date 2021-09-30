---
layout: postcrj
title: "Creating a viable game product"
description: "Week 2 - Creating a viable game product"
tags: ma falmouth crj igd740 ma-indie-startu week2 market-research
category: blog
# disqus_comments: true
thumb: /assets/masters/crj/thumb.png
week: 2
module: indie game startup
code: IGD740
---

This is week 2 of the module _indie game startup_, and let's jump right in.

By the end of this week, we will be able to:

- Estimate revenues of competitor games.
- Identify unmet market needs.
- Produce a Lean Canvas for a games business.
- Optimise a game’s sale price.

# Estimating revenues of competitor games

Estimating competitor revenue can be done to various degrees of accuracy depending on a few known variables. Also, my findings below only apply to Steam {% cite noauthor_steam_2003 -A %}, as I mainly develop PC games.

These numbers need to be taken with a grain of salt, as the market shifts every year. Also, consider or ask:
- who made the game? (did they have a large existing audience?)
- when did the game come out? (trends come and go)
- can you execute as well as they did? (what was their budget? marketing?)
- are players "monogamous" to this game in particular? (loyal) {% cite brace_yourself_games_how_2018 %}

## When week 1 sales is known

Jake Birkett {% cite birkett_grey_2015 -A %} utilises the Boxleitner method: year one sales is equal to three times the week one sales. So, if week one sold 10 shillings, then year one would sell 30 shillings. Keep in mind that the range is more like 2-10x, rather than just 3 {% cite birkett_you_2018 %}

Simon Carless agrees with a 2-5x range {% cite carless_steam_2020 -A %}.

Mike Rose recommends we look at number of players, not owners, as not necessarily everyone plays the games they buy {% cite gdc_lets_2018 %}.

A quote from a recent blog post on Steam expands the range a bit:

{% quote noauthor_steam_2020 %}
For reference, most recent games earning around $10,000 in the first two weeks earned between $20,000 and $60,000 over the course of 12 months following release. 
{% endquote %}

## Using reviews

Jake Birkett {% cite birkett_grey_2018 -A %} collected some data points from fellow indies, and plotted the review/sales ratios. The average from the entire dataset is 82x and the median is 77x, so if you see 10 reviews, expect ~800 sales (that's 10 * ~80, for the uninitiated).

## Using wishlists

Simon Carless {% cite carless_steam_2020 -A %} reckons you get one sale for every 5 wishlists after polling and getting 50 datapoints from indie devs.

## Using online tools

- [https://steam-revenue-calculator.com/](https://steam-revenue-calculator.com/)
- [https://steamdb.info](https://steamdb.info)
- [https://steamspy.com](https://steamspy.com)

# Identifying unmet market needs

Examples of identifying unmet needs in the gaming market:

- there have been no new games in a particular genre for 20 years. Will those folks buy a new game?
- a franchise is huge on console, but locked into that hardware. Can a new franchise with a similar aesthetic and gameplay compete on your platform?
- a genre is popular on PC but has never been brought to mobile, perhaps due to difficulties adapting the complex control scheme. Can you innovate on the controls?
- perhaps there's a theme that gamers have never seen before, or a genre mashup, like a monochrome dating shooter set underwater. Can you introduce something to players that they didn't know they liked?

Once you identify an under-served market, Eric Ries {% cite ries_lean_2019 -A %} says that to find product-market fit, you start by producing an MVP which serves their need. Prototype!

# Produce a Lean Canvas for a games business.

I present a WIP lean canvas for a game idea. Come back here in week 12 - it should be done and fine-tuned by then! (At the time of writing this, I still don't really have a UVP.)

<iframe width="768" height="432" src="https://miro.com/app/live-embed/o9J_luPPSGw=/?moveToViewport=-976,-536,1962,1067" frameBorder="0" scrolling="no" allowFullScreen></iframe>

# Optimise a game’s sale price.

Wlad Marhulets {% cite marhulets_gamedev_2020 -A %} recommends the following:

- Price it fairly.
- If you think your game is low quality, don't rush to sell it at too low a price.
- Price high enough to still make profits at 75% discount.
- See what your competitors are selling at. Adjust accordingly if you offer better or less value.

You can always monetise the game again later with DLC, or if your game becomes popular, license it, or sell merchandise.

# Market analysis

## Research one success and one failure

I research two indie game case studies / postmortems. I show one business that performed well financially, and one with disappointing sales numbers.


### A success

[Slime Rancher](https://store.steampowered.com/app/433340/Slime_Rancher/)

The developer talks about it in a 2017 GDC talk {% cite gdc_slime_2018 %}.

Some development and launch details:

- 2 years dev time before early access release.
- Development initially started by Popovich from his apartment, and his partner was brought in shortly after and they developed it in their own time for a year and a half {% cite klepek_how_2019 %}.
- Initial 2 person dev team, latterly 5.
- Bootstrapped, and no crunch.
- Released on PC, Mac, Linux, XBOX one.
- $20 retail price.
- 96% aggregate review score.
- ~700K units sold at the time of the presentation (Jan 2018).
- Top 100 Steam game of 2016.

Initial thoughts to success:

They knew that even if they had a great idea for a military shooter, they would never be able to compete with AAA. So they became experts in their own "calvinball".

_Take-away: know your limits, and focus on your strengths._

![Calvinball](/assets/posts/2021-09-29-week-2--creating-a-viable-game-product/calvinball.jpg)


They weren't going to build a "better mousetrap" (i.e. compete with Call Of Duty), but they also had a very thin chance of becoming the weird breakout hit that Katamari was, so they aimed for something in the middle, where they had a good mix of familiarity and weirdness.

They knew their limits. They skipped animations by making limbless slimes. They made open world, because scripting is hard.

_Take-away: Slime Rancher is a weird concept played in a familiar way, wrapped in a familiar theme. _

![Slime Rancher: neither too familiar nor unfamiliar](/assets/posts/2021-09-29-week-2--creating-a-viable-game-product/slime-rancher.png)

They did a bunch of prototyping, nailing down the "fun loops" (their fun core game loops), or the "90% loop", which is what the gamer spends 90% of their time doing. Lean game design: work on the stuff that informs core gameplay.

The game was priced at $20 (even though this was negatively reviewed, and "should be $15").

The game got really good Youtube coverage. They have no shows, no PR, so it's just streamers playing the game. Their reasons the game worked on Youtube: the slimes have personalities and are fun to watch, action happens toward the camera, discovery-based learning makes audience observations feel rewarding, lots of unpredictable events keep it fresh, and customisation features make the videos unique.

Revenue Estimate: ~$25 million {% cite noauthor_video_nodate %}

The trailer on Steam says "over 3 million sold" so without discounts that would be 3m * $20, which is $60m!

### A failure

I thought about searching for Kickstarters that didn't reach funding goals, but the GDC failure workshops looked great.

The developer is Ty Tailor, and the game is Dualjoy.

All of the information below is taken from his Failure Workshop talk at the Independent Games Summit 2021 (he starts at 1:50) {% cite noauthor_independent_nodate %}

- He spent $30K on music, before knowing what his game actually was.
- He showed a broken game at GDC before having showed it to family/friends first.

Why it sucked:

- unlike Guitar Hero, Rock Band, DDR (where player actions happen on the beats, which feels natural), Dualjoy fired enemy bullets on the beats, so by moving on the beats, you get killed.
- Also, way too hard - you played with two thumb controllers, which is like patting your head and rubbing your tummy at the same time (most folks couldn't even beat the tutorial).
- Most people did better when not listening to the music at all!

The fault? He didn't heed "kill your darlings". He was blinded by his want to create a "rhythm bullet hell" game, without doing all the boring work on tweaking it to be a success.

_Take-aways: Prototype before making a full game. Playtest often. Kill your darlings!_

### The in-betweens

But you also have the boring stories in the middle. I went a step further and looked at those games that are neither successes nor failures, or the almost-failures that became successes later.

Jake Birkett talks about this in "How to Survive in Gamedev for Eleven Years Without a Hit" {% cite gdc_how_2016 %}.

However, the types of game he makes might be evergreen in a way, just like folks still today play the same Solitaire that shipped with Windows 95. Possibly also very niche.

## Research for my own game

I love games like [A Short Hike](https://store.steampowered.com/app/1055540/A_Short_Hike/), [Eastward](https://store.steampowered.com/app/977880/Eastward/), [Lost Ember](https://store.steampowered.com/app/563840/LOST_EMBER/), [Sable](https://store.steampowered.com/app/757310/Sable/), [A Hat In Time](https://store.steampowered.com/app/253230/A_Hat_in_Time/), [Lake](https://store.steampowered.com/app/1118240/Lake/), and [Haven Park](https://store.steampowered.com/app/1549550/Haven_Park/).

I found games with similar tags that performed well sales-wise. All in [this Google Doc](https://docs.google.com/spreadsheets/d/1dkWKXUQveguqpiZJJv5I1Ka3hSrD_-wUZNhizkY1oVc/edit?usp=sharing).

A lot of these games are tagged **Indie**, which is the [most popular tag on Steam](https://store.steampowered.com/tag/browse/#global_492) {% cite noauthor_popular_nodate %}, so I feel it's a bit meaningless to tag my own game as such, lest I drown in a sea of noise.

It was easy to find similarly-tagged games that failed, and I'm not sharing that particular write-up here, but they fail for reasons such as:

- too high pricing (not good value compared to peers)
- too low pricing (players presume it's low value)
- lack of marketing (no activity from the developer on social media, no press coverage, etc)
- terrible store pages (first impressions last)
- bad trailers (the gist of the game is badly communicated, or the video is terribly boring)
- sometimes, it's just a bad game (refunds)

I'd be interested to read about games which technically did well, but the developer had a bad deal with a publisher, and hence didn't re-coup costs.

# Bibliography

{% bibliography --cited %}
