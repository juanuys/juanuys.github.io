---
layout: post
title: pdfcrun.ch
description: "Turn your PDFs into data."
tags: imadeathing tech startup python ml
category: blog
---

[pdfcrun.ch](https://pdfcrun.ch) turns your PDFs into data. Nice strap-line, eh?

More specifically, I'm aiming to extract tables from PDFs without losing any information.

This project had its inception back in 2013 when I did some freelance work for a client who wanted to extract millions of datapoints from local state PDF datasets (CA, USA). The product was built with Scala, using Apache PDFBox. All the PDFs looked the same, so you could just set all the coordinates by hand.

# v1

What if you could give it *any* PDF, he asked. The engineer in me wants to generalise, and this problem sounded like it could have a lucrative outcome as well. Said engineer was still a bit wet behind the ears as far as PDFs were concerned: internally, they are a mess. What if what you _saw_ is what you _got_? (Or _gotten_, I guess, as the Americans say.)

Luckily for me I had to re-write the whole damn thing. I reached for the top shelf for this one. ML? Computer Vision? Python, of course! However, I went into it with rose-tinted PDF glasses, and all my initial samples had tables in them with beautifully line-delimited rows and columns. (Of course, later we'll learn that not all tables look like that - some of them have no lines whatsoever, and some of them have every other line backgrounded with light gray, etc)

That's how we got to V1 in the end - a Python script which could parse table cells by way of a [Hough Transform](https://en.wikipedia.org/wiki/Hough_transform).

# v2

Like I said, most tables are misbehaving little sum' b*ches. I had to throw out Hough and find a more general solution. I had to immediately become a computer vision expert overnight if this thing was going to succeed. I enrolled for the [deeplearning.ai](https://deeplearning.ai) specialisation, and you can see my terrible notes on the course [here](tags#deeplearning). Also - and here's the real bonus - I justified dropping £2K on a new gaming^H^H^H^H^H^Hmachine learning PC with the latest (at the time) GTX-1080 Ti card. You know, for training models and shizzle. Truth be told, the PC was a good investment, because there are only so many times you can forget to shut down a cloud GPU before it eats up all your cash and kids-xmas-is-cancelled-this-year.

Regardless of doing that course, I still had gaps in my actual "computer vision" education, and I promptly reached out to the author of [scikit-image](https://en.wikipedia.org/wiki/Scikit-image), who promptly introduced me to his old uni buddy who had a PhD in computer vision (both South Africans, and lovely chaps). With an expert on the payroll, I continued making the rest of the product SaaS-ready (trying my hand at this new thing, Kubernetes) and getting some marketing juice flowing.

# Fast forward

The product still doesn't have a good success rate. The good news is that it got me head-hunted for a very good gig at [DunnHumby](https://en.wikipedia.org/wiki/Dunnhumby) to build a receipt scanner. Needless to say, we skipped the whole TensorFlow thing and went straight with Google Vision. It's a nice piece of kit, and it puts your paragraphs, sentences, words, and letters in blocks. This works nicely for tables too, with some x/y coordinate fiddling. Once I find the time, I'll transfer my knowledge gained on that role to pdfcrun.ch, and hopefully, ultimately achieve PDF world domination.