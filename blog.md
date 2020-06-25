---
layout: home
permalink: /blog/
---
<div class="boxes">

<div class="box box2">

stream of consciousness

a confident idiot

yet another blog

</div>

{% for item in site.posts %}
<div class="box altbox">
[{{ item.title }}]({{ item.url }})

<small>{{item.date | date: "%Y-%m-%d"}}</small>
</div>
{% endfor %}

</div>
