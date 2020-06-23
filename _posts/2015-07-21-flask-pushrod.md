---
layout: post
title: "Meet the new maintainer for Flask-Pushrod"
description: "Quick content negotiation for Flask."
tags: imadeathing tech python flask gds
category: blog
---

I have the honour of being given the keys to the castle for [Flask-Pushrod](https://github.com/UYSio/Flask-Pushrod), which gives you quick content negotiation when using Flask.

As always, it's immensely useful for our rapid proto-typing work at the [GDS](https://en.wikipedia.org/wiki/Government_Digital_Service).

# How it works

A simple hello world app in Pushrod would look like this:

```
from flask import Flask, render_template
from flask.ext.pushrod import Pushrod, pushrod_view

import random


app = Flask(__name__)
Pushrod(app)


@app.route("/")
@pushrod_view(jinja_template="hello.html")
def hello():
    return {
        'greeting': random.choice(("Hi", "Heya"))
    }

if __name__ == "__main__":
    app.run()
```

This would, depending on the `Accept` header in the request, return either the greeting message in JSON or render it through the Jinja2 hello.html template.