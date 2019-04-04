---
title: "A David Lynch rehash"
description: "Source..."
layout: post
tags: plato-long davidlynch cartoon webcomic angrydog noise art blitline zapier
category: blog
---

[Source](http://www.davidlynch.de/angry.html):

> The David Lynch cartoon 'The Angriest Dog in The World'  was published in local papers such as the L.A. Reader, Creative Loafing, New York Press and Westworld since 1983 until 1992.
>
> <span class="highlight">The images always stay the same</span>, at least, they were meant to. But somehow a cartoonist chose to include an increasing number of bones.

I thought that perhaps this could be an easy mechanism for Lazy Me to pollute the Internet with more of the empty little nothings that pop into my head every now and then.

For starters, I'll practice with Herr Lynch's idea by copying his template with empty speech bubbles.

![empty speech bubbles](/assets/posts/2017-03-03-a-david-lynch-rehash/main.png)

Then I'll hook this [Blitline](https://www.blitline.com/) script up to [Zapier](https://zapier.com) so I can email my snippets of dialogue to a personalised Cartoon Bot.

<pre>
import json
import requests

BLITLINE_ID = "changeme"

# https://s3.amazonaws.com/img.blitline/fonts/master.jpg
FONT = 'Garidelli'
DEFAULT_FONT_SIZE = 18
DEF_LINE_LEN = 18

def get_fs(text):
    return DEFAULT_FONT_SIZE - (len(text) / 10)

def splice(text):
    parts = text.strip().split(' ')
    final = ''
    seed = ''
    for idx, part in enumerate(parts):
        seed += part + ' '
        if len(seed) > DEF_LINE_LEN:
            nl = '\n' + part
            # replace from right side
            final += nl.join(seed.rsplit(' '+part, 1))
            seed = ''
        if idx == len(parts) - 1:
            final += seed
    return final


ignored, first, second, third = input_data['body'].split('#')

first = splice(first)
first_fs = get_fs(first)

second = splice(second)
second_fs = get_fs(second)

third = splice(third.split('--')[0])
third_fs = get_fs(third)

doc = {
    "application_id": BLITLINE_ID,
    "src": "http://i.imgur.com/lfE8DFl.png",
    "functions": [
        {
            "name": "annotate",
            "params": {
                "text": first,
                "weight": "bold",
                "color": "#000",
                "point_size": first_fs,
                "x": -110,
                "y": -140,
                "gravity": "CenterGravity",
                "font_family": FONT
            },
            "functions": [
                {
                    "name": "annotate",
                    "params": {
                        "text": second,
                        "weight": "bold",
                        "color": "#000",
                        "point_size": second_fs,
                        "x": 225,
                        "y": -140,
                        "gravity": "CenterGravity",
                        "font_family": FONT
                    },
                    "functions": [
                        {
                            "name": "annotate",
                            "params": {
                                "text": third,
                                "weight": "bold",
                                "color": "#000",
                                "point_size": third_fs,
                                "x": -105,
                                "y": 210,
                                "gravity": "CenterGravity",
                                "font_family": FONT
                            },
                            "save": {
                                        "image_identifier": "MY_CLIENT_ID"
                                    }
                        }

                    ]
                }
            ]
        }
    ]
}

r = requests.post(
    "http://api.blitline.com/job",
    data={'json': json.dumps(doc)},
    timeout=5)
print r.json()
results = r.json()['results']
if r.status_code != 200 or 'error' in results:
    print 'Error', r.status_code, r.content
    output = {'img':'failed'}
else:
    output = {'img':results['images'][0]['s3_url']}
</pre>

And this is what it poops out after sending the following email:

> \# I can't believe people would queue an hour for a "free" coffee.
>
> \# Yeah, such a false economy.
>
> \# Hey, wanna go to IKEA later?

![writing comedy is not my forté](/assets/posts/2017-03-03-a-david-lynch-rehash/example2.jpg)

Stay tuned for more Interweb trivialities.
