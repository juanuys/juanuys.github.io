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

{% if post.thumb %}
<div class="box altbox" style="background: url('{{post.thumb}}') no-repeat center/cover;" markdown="1">
{% else %}
<div class="box altbox" markdown="1">
{% endif %}
[{{ post.title }}]({{ post.url }})
<br>
<small>{{post.date | date: "%Y-%m-%d"}}</small>
</div>

{% endif %}
{% endfor %}



{% for i in (1..30) %}

<div class="box"></div>

{% endfor %}


</div>
