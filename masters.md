---
layout: home
permalink: /masters/
---
<div class="boxes">

<div class="box box2">

any fool can know

the point is to understand

says albert einstein

</div>



{% for post in site.posts %}
{% if post.tags contains "ma" %}
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
