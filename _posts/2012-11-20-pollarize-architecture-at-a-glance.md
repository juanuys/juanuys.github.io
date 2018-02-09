---
title: "Pollarize architecture at a glance"
description: "Pollarize architecture at a glance"
og_image_url: "http://i.imgur.com/bd1Bh.png"
image: "http://i.imgur.com/bd1Bh.png"
image_content_type: "image/png"
layout: post
tags: [tech, scala, architecture, pollarize]
category: blog
---

*X-posted from the pollarize.me blog*

# Genesis

Pollarize was [bourne](http://thenextweb.com/uk/2012/03/26/the-winner-of-startup-weekend-london-is-pollarize-me/) out of a 54 hour hacking stint at Startup Weekend in March 2012. The Thursday night before that weekend, I thought about the various tech I knew and wanted to have a good idea how to kickstart our hack before putting pen to paper on the Friday night.

<img src="http://media.tumblr.com/tumblr_mdsg3ecowA1ryyv9k.png" width="50%" align="right">

The decision was made: Pollarize was going to be a Spring MVC web app running on an Amazon EC2 instance. I was going to worry about the database later, and maybe get away with using an in-memory map or something for the data.

Come Friday night, I felt a bit different. Why not learn something new, I thought. Besides, AWS might be a bit clunky for a weekend hack. And I’ve heard good things about the Play! framework, and the v2 was released just a few months before.

# Today

Fast forward 7 months, over 200 deploys, and over 1,000 commits. This is what our API looks like now:

<img src="http://i.imgur.com/bd1Bh.png" width="100%">

## Core

The core app is a lightweight [Play! 2.0 (Scala edition)](http://www.playframework.org/documentation/2.0.1/Home) web app which exposes a JSON web API, and it makes transactional writes to our operational [Postgres](https://postgres.heroku.com/) database. Most other (unimportant) write operations happen via fire-and-forget calls to other modules via [Akka](http://akka.io/). The IDs for these data is pre-chosen, so subsequent calls will be idempotent.

## MongoDB

All writes to the operational database is fired off to a [MongoDB](https://www.mongolab.com/home) actor, which serves as the read-only cache for API reads. The data in MongoDB is already in the format the caller will consume, so it is extremely quick. The cache can be rebuilt asynchronously with the click of a button.

## Media

The media module accepts profile pictures and poll images, and we use [Blitline](http://blitline.com/) to get them into our signature circular format (and different sizes), and then we store the results in [Amazon S3](http://aws.amazon.com/s3/) and expose it to the world via [Cloudfront](http://aws.amazon.com/cloudfront/). If you have any image processing to be done, definitely give Blitline a shot: they’re very helpful and the API is a lot of fun to play with.

## Notify

Notifications is triggered via an Akka scheduled job in the case of poll expiry, and via events in the case of registration, password reset, poll creation from people you follow and follow notifications (yes, we’re a tiny social network). In general we use email via [Mailgun](http://www.mailgun.com/)’s simple API, [Pubnub](http://www.pubnub.com/) for web users, and [Urban Airship](http://urbanairship.com/) for our mobile users.

## Other

We played with some other tech but those were chucked out for various reasons. [Redis](http://redistogo.com/) is awesome, and we used it initially for our social network, but in our case it was just another piece of your architecture to worry about. Our social network now happily lives in our operational database where it belongs. One day, if Postgres buckles under the graph, we’ll reconsider. Then there’s [RabbitMQ](http://www.cloudamqp.com/). It’s beautifully stable, and has a very good monitoring plugin, but once again: it’s one more thing to manage, and besides, Akka mailboxes will suffice for now.
You bet your PaaS we’re using Heroku

Heroku has been great for getting started. Have an idea? Code it, commit, push, et voilà. No worrying about builds, deploys or anything like that: one less operational hassle to worry about when you’re building features. However, we do have a chunky $5,000 AWS credit, and I’m slowly but surely creating [Puppet](http://puppetlabs.com/) manifests for all our components ([Vagrant](http://vagrantup.com/) has been great for testing this locally), but this is still a nice-to-have for the size of our user base, so I’m really just hacking at this in the in-between moments.

## Conclusion

So, there you have it. Our architecture at a glance. There will be some more detail later down the line. In fact, I’m already drafting a Play! best practices, jotting down everything I’m learning along the way. Questions and comments on the back of a postcard.
