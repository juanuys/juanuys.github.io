---
layout: post
title: "A quick thought on AI and games"
description: "A quick thought on AI and games"
tags: ai ml deeplearning gamedev
category: blog
disqus_comments: true
thumb: /assets/posts/2023-03-07-thoughts-on-ai-and-games/thumb.png
---

*Tl;DR: AI is just a tool, and as a creative, you need to identify what these tools are, and start paying attention to them.*

*Update 2024-07-05: Andrew Huang [says everything I didn't have the words for](https://youtu.be/FHOAeFkoVLw) when I wrote this.*

*Update 2023-11-24: Jonas Tyroller also has a [sober view](https://youtu.be/qOArU7hpHtw?si=w2IE6DhkM3pKxHqk) on all of this.*

*Update 2023-03-10: don't read my ramblings below; just watch [this](https://youtu.be/rswxcDyotXA)*

I am a data/ML engineer by day, and an indie micro studio by night, so not only am I familiar with AI/ML and deep learning in my professional life, but I'm also fully aware of the advances being made in the creative industries using AI.

It's not all positive, though. The big question on everyone's mind is whether [AI will steal your job](https://duckduckgo.com/?q=will+ai+steal+my+job). GPT made a big splash recently, and [artists aren't happy](https://www.vice.com/en/article/dy7b5y/artists-are-suing-over-stable-diffusion-stealing-their-work-for-ai-art) that their art is being used for model training without their permission. 

This made me think about where AI fits into a creative person's life.

# AI in use in game dev right now

First, an exploration of the tools that are out there, and where it is being used. There are plenty of examples in the wild, but I highlight just a few from recent memory below.

We're seeing great advancements in AI content generation and process automation:
- image generation (e.g. [stable diffusion](https://beta.dreamstudio.ai/), [everyone's favourite image-imagining Discord bot](https://midjourney.com/), [SD with in/out-painting](https://layer.ai/), [generation and training](https://www.scenario.gg/), [generation, training + in/out-painting](https://leonardo.ai/), [suites of tools](https://runwayml.com/), [another Discord bot](https://www.bluewillow.ai/), and more)
- animation (e.g. [animation software](https://cascadeur.com/), [paintings to video](https://ebsynth.com/), [motion capture](https://plask.ai/), [webcam to mocap](https://www.rokoko.com/products/video), and more)
- automated QA (e.g. [modl](https://modl.ai/))
- 3D (e.g. [textured meshes from text prompts](https://www.nasir.lol/clipmesh))
- audio (e.g. [music generation from text prompts](https://google-research.github.io/seanet/musiclm/examples/))
- narrative (e.g. [let chatGPT help you write a story](https://chat.openai.com/))
- many more

And as such, more and more games being made with the assistance AI technology, e.g. 
- [https://echoesofsomewhere.com](https://echoesofsomewhere.com) - an experimental 2.5D point and click adventure game that "relies heavily on AI generated content"
- [https://play.aidungeon.io/](https://play.aidungeon.io/) - text adventure game generator, released back in 2019
- and the countless games popping up on itch which uses AI-generated content outright
  
  Looking at all these advances, it's easy to feel
  - as the person who usually composes the music, MusicLM will take my job
  - as the person who usually draws the art, Midjourney will take my job
  - and so forth
  
# Where does AI fit into my future?

I think AI is just a tool.

New tools have popped up in creatives' lives throughout history. Photographers got digital cameras and Photoshop. We went from quills to pens to typewriters to PCs to laptops. The personal computer benefitted basically everyone. Those inventions didn't take our jobs, it made us better at our jobs. 

Anecdote: a friend studied photography back in 2002, and looked down on digital cameras: there was something about going through the slog of developing the prints in a dark room yourself that imparted more artistry on the photographs, and that anyone with a digital camera was "cheating". Also, don't even get him started on digital image manipulation. However, fast forward a couple of decades, and client work is being done purely digitally. It's cheaper and more efficient.

Anecdote: a family member stopped working as a secretary in the 80s (typewriters, fax, photocopies) to spend more time with kids. She only tried to re-enter the job market in the mid-2000s out of necessity, but never re-skilled in the interim. Needless to say, the attempt was short-lived. It's a sad case of "the world has gone me by".

So, just like digital cameras, Photoshop, and laptops, AI is just a tool that won't take your job, but it will make you better at it. However, you might lose your job or struggle at your job if you don't keep abreast of the latest tools, of which AI is one.

# A day in the life

When I work on art for a game, I spend a fair amount of time just doodling in a notebook. I'm "designing", using colour, composition, and shape to communicate something through the piece of art. I think about The Message, the themes that underpin it.

Then comes the bit where I'm pushing a pen around on a Wacom tablet for a few hours. Then importing it into the game engine, where it becomes part of the scene.

What usually happens is that the ideating/designing phase takes about 10%, and the work/process/creation takes about 90%. (There might be some iteration going on to fine-tune the design.)

I think it's that 90% that can be automated away, but the 10% that will remain a uniquely human skill.

Fundamentals in art, the ability to draw, knowing how to integrate art with the game engine: these are all just a means to an end, which is the product (the game; the thing that tells the story, that has the message).

However, the product can be the most beautiful thing in the world, but if it's not well-designed (I'm *not* saying well-drawn), then it will fall flat.

# Now what?

You don't have to go back to uni to study statistics and applied math, and learn everything from the basic [McCulloch-Pitts neuron](https://en.wikipedia.org/wiki/Artificial_neuron) all the way to the latest deep learning techniques.

However, do seek out the tools that are making a splash in your specific corner of the industry. Try it; play with it. See what it does. Maybe even incorporate it into your toolkit, and become an expert in it. (Because your colleagues will, and they'll be better prepared tomorrow.)

**But, realise that there's a fundamental part of being human that it will never replace (well, at least not yet 😉), and that's your ability to dream and come up with unique solutions to problems.** You can still do things the Old Way, maybe in your spare time, for fun. But the New Way will get you to your goals more quickly, and let you focus on the important stuff which only a human brain (and heart!) can bring to the table.

*PS I would have liked to have written this on a typewriter, to hear the clickety clack of the keys, and to end up with a beautiful artifact which I can smell and hold in my hands. God forbid I need to do a search-and-replace, though...*

# Extra thoughts 2023-03-07

(Extra thoughts I had after watching [this video](https://www.youtube.com/watch?v=GOwxXj1EIXM).)

## I'm not devaluing established techniques

Just some context: I'm just a guy with day job and family/kids who has almost no time for indie dev. I'm so-so on the illustration front. I also can't afford any artists to help me with game art at the moment. So, I'm looking for tooling to help speed up my own processes. 

I'm not devaluing anything any artist does using traditional/established techniques. I think our work with paintbrush on canvas, or stylus on tablet, or fingers on synthesiser/piano - it all springs from the heart, from a seed of inspiration, brought to fruition with honed craft and many years of training.

But these new AI tools are getting better, and will be more commonplace in the near future. You might as well embrace it.

## There's a place for AI-generated content

Like I said, I'm an unknown indie gamedev with no means to employ dedicated craftspeople to do things for me. I, for one, would like more tools with which to get my message/idea out quicker.

And then one day, when I have more success, I'd love to involve more artists and musicians in my projects.

If you grep my blog for "collective" or even "[worker collective](https://github.com/juanuys/juanuys.github.io/search?q=worker+collective)" (especially [this post]({% post_url 2021-08-03-week-10--more-industry-insights%}#worker-collectives)), you'll quickly see that I'm quite anti-corporate-greed. I would LOVE to start a worker collective one day, and share in the success equally.

So, in conclusion, AI-generated art might help the little guy get a leg up (just like they currently do with asset packs and royalty-free music) if we can figure out [AI copyright](https://arstechnica.com/information-technology/2023/02/us-copyright-office-withdraws-copyright-for-ai-generated-comic-artwork/), but the large media houses are real scumbags if they think they can lay off their workforce and use AI-generated art instead, just so that they can make an extra buck.
