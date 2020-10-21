---
title: "About my Falmouth Masters"
name: about_masters
layout: home
description: "About my Falmouth Masters"
permalink: /masters/about
# thumb: /assets/masters/about/thumb.jpg
pagetype: masters
rank: 100
reflection-domains:
    - dispositional
    - affective
    - interpersonal
    - cognitive
    - procedural
---

All my posts relating to the masters are [tagged with "ma"](/tags#ma).

However, not all those posts are critical reflective journal entries, so those are also [tagged with "crj"](/tags#crj).

# Domains of reflection

We are encouraged to tag each post with one or more of the below tags depending on the content.


| Domain | Description |
| ------ | ----------- |
| [dispositional](/tags#crj-dispositional) | time management, motivation, general behaviour, discipline |
| [affective](/tags#crj-affective) | all aspects of how you deal with feelings, experiences and emotions;<br>emotional intelligence;<br>key skills: emotional awareness, self-assessment |
| [interpersonal](/tags#crj-interpersonal) | effectively working with others, and all the skills involved:<br>- verbal/non-verbal comms<br>- listening<br>- negotiation<br>- problem solving<br>- decision-making<br>- assertiveness |
| [cognitive](/tags#crj-cognitive) | assess strengths and weaknesses in your approach to learning;<br>identify trajectories of learning that will compliment your ambitions and career paths |
| [procedural](/tags#crj-procedural) | all about identifying skills you already have, and identifying where improvements are needed |

## Breakdown of current posts by domain

Here's a little dataviz to show which domains my reflections touch on. (Some posts touch on multiple domains.)

{% assign crj_count = 0 %}
{% for post in site.posts %}
{% if post.tags contains "ma" and post.tags contains "crj" %}
{% assign crj_count = crj_count | plus:1 %}
{% endif %}
{% endfor %}

<span class="highlight">There are currently {{crj_count}} reflections.</span>

<div class="crj-breakdown">

{% for domain in page.reflection-domains %}
{% assign tag = "crj-" | append: domain %}

<div class="crj-breakdown-child {{tag}}">
<h4>{{domain}}</h4>
{% for post in site.posts reversed %}{% if post.tags contains "ma" and post.tags contains "crj" and post.tags contains tag %}[&#9608;]({{ post.url }})&nbsp;{% endif %}{% endfor %}
</div> 

{% endfor %}
</div>
