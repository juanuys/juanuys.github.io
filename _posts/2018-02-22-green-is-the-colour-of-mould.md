---
title: "Green is the colour of mould"
description: "Some thoughts on the so-called Greenfield project"
layout: post
tags: tech
category: blog
---

> Today is a new day.

You're sitting in a meeting room with co-developers, some independent, some from The Usual Suspects Consulting Co. The client is Big Finance.

The project is *"greenfield"*. The scope is light. The urge to get started is palpable.

Software developers (with many years behind their name) utter nonsensicals like *"Akka"* and *"Reactive"* because *"we'll need to scale"* and *"besides - X isn't maintained anymore"*.

Architects and product owners (with even more years behind their names) proclaim *"Yup, it sounds good"* and *"How long will it take?"*.

The day after the Young Guns will sit there wide-eyed and freshly coffee-dosed, running their scaffolding scripts with glee, happy that they didn't even have to write any code to get the drop shadow on "Hello World" just right.

Their models will be generated, schemafied, tested, RESTed, DB-backed, ORMed, and bloody well well-named. The services, micro as they are, will increase in number, will start talking, will start contributing to a pretty graph on a metrics dashboard, and will be continuously delivered via only the best and latest SaaS pipelines. Unless they're cloud functions or lambdas or other little spin-up/spin-down hackathon-grade bits of code.

Life is good.

> A year goes by.

You're sitting in a meeting room with co-developers, some still there, some new, some independent, and some from The Usual Suspects whom you've since learnt has a reputation for flooding teams with their own people.

Oh, and some from the Partner you need to integrate with. Like, 4 months ago already.

The scaffolding scripts and quick-starts have lost their usefulness and shine. Your problem is written down on Stack Overflow as a question. *"Know someone who can answer?"*

You realise your problem isn't really one of coding, or architecture.

<cue a montage of teams passing the buck, working over-time, rewriting entire services, finding outside help, and eventually scrapping the project>

> Another year goes by.

You're sitting in a meeting room and someone says *"greenfield"*. You start giggling. It's mostly The Usual Suspects now. You've since learnt that they encourage scope creep because it keeps them there.

You realise you've connected websites to databases more times than you can care to count.

Someone says *"LMAX disruptor"* and someone else says *"web assembly"*, and you laugh some more. The New-and-shiny Brigade indeed only does that which looks good on their CV.

You start yearning for the days you can show an AI a spec, and it deep-neural-nettifies a solution for you without having worried about Grunt workflows (or is it Gulp? (or is it Webpack? (or is it Browserify?))). You laugh, but also cry a bit, but you mostly laugh.

Someone who calls themselves an architect says *"Yup, it sounds good"*. The product owner (owner?) asks *"How long will it take?"* and you can't answer because by now you're laughing so hard and lying on the floor.

> It's 2891 XD, the age of Their Almighty Intelligences

You're sitting in a virtual meeting room and someone says *"greenfield"*. Your laughing circuit shorts to `/dev/null` because you're running Polite v1.341. You've succumbed to The Usual Suspects now, but thank Almighty153 there are only two of you there, thanks to the limit imposed in your global config file. (Record also shows you've been considered viral in the past, so limits will be had)

Someone says *"Tri-directional LSTM with Evolution Attention"* and someone else says *"make sure it all rhymes with Pooh"*, but you don't flinch. (Thanks, DontGiveAMonkeys v1.337)

You've long since died, so don't yearn for anything anymore.

Architect AI doesn't say *"It sounds good"* because they've heard (and read, parsed, indexed and translated) everything before. Almighty153 - being the product owner of everything - doesn't ask *"How long will it take?"* because:

1. they're too busy
2. they know the answer already

Five femtoseconds goes by, a virtual microwave oven says *"Ping!"*, and someone opens the door to reveal the Product.

It sounds something like the dial-up modem sound from pre-history, and when you squint your virtual eyes it looks something like

<pre>
╣╝╦╚╔══╩╠╗╔║╬╠╠═╦╬╣╣╝═╬╦╦═╣╝╠╬╗╗╠║╣╝╠╣╩╣╚╦═╝╣╬╣╦══
╣║╣║╦╝╬╝╚╠╣╦╝╗╩╔╣╣╦╚║╗╦╣╦╬╝╦║║╣╝╗╣╗╬╦╝║╝╚╗╔╠╚═╔╚╣╣
╩╬╚╦╬╣╔╬╚╦╝═╗╩╔═╦╚╚╗╦║╣╦╬║╗╚║╦╩╔╠╚╚═╔╝╠╩╩╩║╗╦╦╝╠╦╠
║╔╠╬╝╠╠╠╝╝╠╬╚╣╬╗╝╚╔╦═╩╚╩╣╚╗╬╝╠╝╚║╦╗╚╚╔╔╗╣╩╬╣╗╚╗╚╬╔
╔╚╩║╝╚╬═╚╬╝╩╚╝╩╣╦═╗╣╬╩╦╬╔║╦╣╠╦╦╦╝╚╗═╝╦╣╦╦╣═╗╠╠╝═╠╩
═╗╝╠╔═╗╗╩╦╗╚╚═║╗╩╔╦╔╚╠╗║╠╣╦╗║╝╩═╦╝═║║═╠╠╔╚╝╩╩╚╝╗╝╠
║╦╝║╣╗╬╣╔╝╬╝╚╗╔╦╝═╠╚╔╝╚╠╝╬║║╩╗║║║╦═══╗╣╝╣╩╣╬╬╦╠╩╦═
╗╠╔╝╣╬╚╠╩╣═╬╩╬╣╩╔╚╗╚═╦╚╝╣║╦╬╩║║╝╠╣╦═╚╬╚╣═╬╚╔╔╦║╝╗╔
╚╝╔╣═╝╝╚╗╣╗╝╗╩╬╩╬╦║╦╝╚╩╩╦╠╦╔╣╣╩╬╦╚╩╬╬═╔╩╔╝╬╗╦╔╚╝╔╣
╝╚╝╗═╔╠╗═╩╠║╦╬╠╗╝╗╔╝║╝╩╣╗╚╦║╠║═║╬╩═╚╝╗╝╗╬╬╔║║╬╗╬╔╝
╬╗╣╬╗╦╝║╔╠╔╬╬╚╬╝═╔╬╝║╚╠╦╠╔║╝╦╗╗╦╩╗╔╣╬║╩╔╠║╩╚╔╩╗═╝═
</pre>

Their Almighty Intelligences rejoice, and you realise it makes about as much sense as it did the first time around.

Nothing has changed.
