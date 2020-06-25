---
layout: home
permalink: /quotes/
---
<div class="boxes">

<div class="box box2">

a good website filler

when crafty words escape me

the quotable quote

</div>



{% for post in site.posts %}
{% if post.tags contains "quote" %}
<div class="box altbox">
[{{post.title | truncatewords: 7 }}]({{ post.url }})
<small>{{post.date | date: "%Y-%m-%d"}}</small>
</div>
{% endif %}
{% endfor %}



{% for i in (1..30) %}

<div class="box"></div>

{% endfor %}


</div>
