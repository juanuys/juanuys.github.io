---
layout: postcrj
title: "AI in support of innovation"
description: "AI in support of innovation"
tags: ma falmouth crj week2 development-practice ai crj-procedural
category: blog
# disqus_comments: true
thumb: /assets/masters/crj/thumb.png
week: 2
module: development practice
code: GDD710
---

From the topics this week, these two prompts:

> consider how artificial intelligence (AI) might support innovation in the future

And:

> do some quick research into how AI is being used within your own specialism

Let's start with the first. How might AI support innovation in the future? 

The hot topic in the AI scene of late is [GPT-3](https://arxiv.org/abs/2005.14165), of which many [novel applications](https://www.youtube.com/watch?v=_x9AwxfjxvE) have seen the light, albeit still in prototype stage. It can learn language and infer semantic meaning from existing corpora and ", GPT-3 can generate synthetic news articles which human evaluators have difficulty distinguishing from human-generated articles" {% cite brown_language_2020 %}.

![Neural network](/assets/posts/2020-09-30-ai-in-support-of-innovation/neuralnet.jpg)

AI have long found an application in video games in terms of NPC (non-player character) actions and combat AI {% cite schreiner_combat_2002 %}. However, this application is quite simplified, as games have to remain fun and AIs can't be too clever and alienate the player.

However, looking at the [GPT-3 applications](https://www.youtube.com/watch?v=_x9AwxfjxvE) that currently exist in prototype stage, it looks like AI might be an assistive technology in the video games production process. This is an avenue I want to explore further.

As the narrator in the linked video above says, and I paraphrase: <span class="highlight">if a computer is a bicycle for the mind, then GPT-3 is a fighter jet.</span>

Onto the second prompt. I repeat:

> do some quick research into how AI is being used within your own specialism

My own specialism (currently) is [full-stack web development](https://uys.io/cv/). I have first-hand experience of a few AI technologies in my day-to-day, for instance, [Google Vision](https://cloud.google.com/vision). I once worked on a receipt scanner for DunnHumby, and we used it to great success. In fact, I converted a [previous project](https://pdfcrun.ch/) of mine from a custom-trained [Keras-based](https://keras.io/) neural network to use Google Vision instead, that's how much better and simpler to use it was.

![You only look once](/assets/posts/2020-09-30-ai-in-support-of-innovation/yolo.png)

Reflecting on the decision to use Google Vision instead of a home-grown solution leaves me with these take-aways: we achieved quicker product-to-market, but we are now also locked-in to a specific vendor. What remains to be seen is whether AI is becoming more accessible, and if we'd have a range of (good) vendors to choose from. OpenAI has just exclusively licensed GPT-3 to Microsoft, after all {% cite scott_microsoft_2020 %}. (I guess they can rename themselves from OpenAI to ClosedAI now.)

Would I want to learn more about the nuts-and-bolts of deep learning? Well, I've done it before with [pdfcrun.ch](https://pdfcrun.ch/), but let me tell you - it's a full-time job. I had to hire a full-time PhD Computer Vision expert just to help with the finer details which would have taken me years to figure out myself.

Is it worth staying abreast of latest developments in AI? Yes, of course.

# Bibliography

{% bibliography --cited %}
