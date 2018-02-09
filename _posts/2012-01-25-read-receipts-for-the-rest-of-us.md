---
title: "Read Receipts for the rest of us"
description: "Read Receipts for the rest of us"
og_image_url: "http://i.imgur.com/t6oOMxg.jpg"
image: "http://i.imgur.com/t6oOMxg.jpg"
image_content_type: "image/jpeg"
layout: post
tags: tech
category: blog
---

Or, more correctly: Read Receipts for geeks who use [iTerm](http://www.iterm2.com/) and/or [Growl](http://growl.info/).

# Read receipt

So, the Interwebs is down, or the proxy is packing up, or you can’t log in to server X, or <insert generic technical issue here>. You fire off an email to the sysadmins explaining the problem, and now you’re waiting for a reply.

It just so happens that I had a bit of technical trouble today, and fired off an email to someone who can help. I love metrics, and in this case I wanted to know exactly when the sysadmin is looking at my cry for help so I can actually pop over to their side of the office and badger them to fix it (nah, I’m not really like that ;-)

What you need is a Read Receipt notification which tells you that they read your email.

# The rest of us

If you’re in my situation, you:

* don’t use MS products, hence no Read Receipts in your email client
* even if your mail client does support Read Receipts, you haven't switched it on, because it's a faff
* don’t work in an office where there’s a reliable ticketing system, so you don’t immediately know if your request is being actioned.
* work with people who reject read receipt requests anyway


# The hack

Put a link in the email that they can click on. The trick is to get them to click on it, e.g.

<img width="381px" src="http://funkshional.files.wordpress.com/2012/01/email.png" alt="Links are made for clicking on">

Notice the link http://10.5.2.113:9999/

We now have to make sure it points to something, and more importantly, make sure you get an alert if the link is clicked.

# Cats to the rescue

In this example, I’m using [cat](http://www.gnu.org/software/coreutils/manual/html_node/cat-invocation.html), [netcat](http://en.wikipedia.org/wiki/Netcat) and a [lolcat](http://icanhascheezburger.com/) (swap the lolcat out with a screenshot of your actual issue). I prepend the command with [time](http://www.gnu.org/software/bash/manual/html_node/Pipelines.html) which causes timing statistics to be printed for the command once it finishes.

Open a shell, and host the image with:

<a href="https://gist.github.com/opyate/6375611#catserver">https://gist.github.com/opyate/6375611#catserver</a>

**UPDATE**

In retrospect, you can serve something up repeatedly by putting it in a `while (true)` loop:

<a href="https://gist.github.com/opyate/6375611#holding-page">https://gist.github.com/opyate/6375611#holding-page</a>

<img width="381px" src="http://funkshional.files.wordpress.com/2012/01/start.png" alt="Serve the cat with cat and netcat">

Now, you’ve sent the email and hosted the image. In the meanwhile, you carry on with your other work.

# What The Sysadmin sees

The Sysadmin clicks on your link, et voila:

<img width="381px" src="http://funkshional.files.wordpress.com/2012/01/what-they-see.png" alt="My all-important screenshot of my technical issue">

# What you see

A Growl notification:

<img width="328px" src="http://funkshional.files.wordpress.com/2012/01/growl.png" alt="Your read receipt">

And, the iTerm tab in which you ran the cat command’s title will flare up. This is a feature of iTerm that can be disabled with *Preferences > Appearance > Color* tab labels on activity. Here’s what it looks like for me:

<img width="381px" src="http://funkshional.files.wordpress.com/2012/01/meanwhile.png" alt="Read receipt part II">

Click on the tab and see the proof that the image has been served. Even better, the time command will tell you how long it took for The Sysadmin to click on your link (one minute and three seconds, in my case):

<img width="381px" src="http://funkshional.files.wordpress.com/2012/01/end.png" alt="They took a minute to respond, shock horror!">

Now, run over there and start badgering.
