---
title: "Adding SMS functionality with Twilio"
description: "Adding SMS functionality with Twilio"
date: 2012-10-15
og_image_url: "http://www.twilio.com/packages/company/img/logos_downloadable_round.png"
image: "http://www.twilio.com/packages/company/img/logos_downloadable_round.png"
image_content_type: "image/png"
layout: post
tags: [tech, scala, twilio, pollarize]
category: blog
---

[Pollarize](http://pollarize.me) helps the world make up its mind via its beautiful, delightful suite of apps. However, not everyone owns a smartphone. Luckily, [Twilio](http://www.twilio.com/) brings voice and messaging to web and mobile applications. Which means that Pollarize now allows our brick-lugging friends to compose polls via SMS.

# How we built it

The usual Pollarize system constraints are the following:

* poll question can not exceed 100 characters
* options A and B can not exceed 100 characters each

The requirements are the following:

* a poll SMS should be in the format “Question text. A. First option B. Second option”
* if either A or B is omitted, then default to “Yes” and “No” respectively
* a poll SMS can exceed the 160 character limit, but not exceed 308 characters if we take into account the delimiters ” A. ” and ” B. “

This meant that an entire poll can at least be described at least by one SMS, and at most by two, since 308 is less than 2 * 160, or two SMS fragments.

# SMS

Twilio seemingly don’t maintain any state on their side. I.e. if a user sends a large SMS, Twilio will not bundle the resulting SMS fragments up and send it to us in one piece. Instead, Twilio will send us the fragments one after the other as they become available from the mobile network.

To illustrate this, here are the `application/form-url-encoded` payloads represented as Scala maps:

<a href="https://gist.github.com/opyate/3854971#TwilioSMSFirst.scala">https://gist.github.com/opyate/3854971#TwilioSMSFirst.scala</a>

<a href="https://gist.github.com/opyate/3854971#TwilioSMSSecond.scala">https://gist.github.com/opyate/3854971#TwilioSMSSecond.scala</a>


# Implementation in a nutshell

The trick here is to assemble the SMS text once we’ve received all the fragments. Since Twilio doesn’t tell us there’s a second fragment coming, we don’t create a poll immediately after an SMS is received. Instead, we dump the payloads into MongoDB as they are received. A background worker then scans all “unprocessed” SMSes and check if there were other SMSes *from the same phone number within the last 10 seconds*. Once we have all the SMSes, we combine the original SMS text into a single text, create the poll, and we mark the Mongo record as “processed”.

The “*within the last 10 seconds*” bit only came after I discovered a massive bug. Let me explain…

# The Poll-from-SMS scheduled job

The background job server re-assembles the SMS fragments into a single SMS and checks if they’re poll-worthy.

The first version of the SMSWorker accidentally did the following (using the data from the two Gists above):

## Poll #1

<pre>
Question: I don't have an iPhone, so I thought I'd build SMS functionality.
Option A. Great, what about something that interprets smoke signals?
Option B. Good, now get on with
</pre>

## Poll #2

<pre>
Question: the Android app already!
Option A: Yes
Option B: No
</pre>

See what I did there? Option B got cut off due to the 160 character SMS limit, and we accidentally created a whole new, unintelligible poll. Not quite what I had in mind, as you can imagine. I had to start making some assumptions about the way Twilio and the mobile networks interact in light of the absence of an SLA from either.

I assumed a maximum of 10 seconds between SMS fragments. A counter point to this is that we assume a user won’t create polls via SMS in quick succession.

# The Poll-from-SMS scheduled job V2

The second version of the SMSWorker can be seen below.

<a href="https://gist.github.com/opyate/3854971#ScheduledPollFromSMSActor.scala">https://gist.github.com/opyate/3854971#ScheduledPollFromSMSActor.scala</a>

The value inProximity are the SMS fragments within a 10 second period. The SMS fragments belong to the same user, as obtained via the groupBycall on line 8.

The SMSParser on line 19 is really nothing special, but from the test cases you’ll see that we’re catering for every eventuality:

<a href="https://gist.github.com/opyate/3854971#SMSParserSpec.scala">https://gist.github.com/opyate/3854971#SMSParserSpec.scala</a>

# Conclusion

This was a fun little addition. Next up is voting via SMS.

MongoDB allowed me to store the entire SMS payload and worry about the contents later. I didn’t create a model for the SMS payload, because it isn’t core to my domain. Also, the 10 second window seemed like a safe trade-off in light of being in the dark (huh?) with regards to mobile network SLAs. We’ll measure and adjust accordingly, of course.

Twilio was easy to integrate with, and it all just works. Now I feel like SMS-enabling all my apps.
