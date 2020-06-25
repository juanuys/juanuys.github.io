---
layout: home
permalink: /made/
---
<div class="boxes">

<div class="box box2">

sweet little nothings

once useful but now broken

here for all to see

</div>



{% for post in site.posts %}
{% if post.tags contains "imadeathing" %}
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
