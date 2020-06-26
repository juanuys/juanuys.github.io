---
layout: home
permalink: /posts/
---
<div class="boxes">

<div class="box box2">

stream of consciousness

a confident idiot

yet another blog

</div>

{% for item in site.posts %}

{% if item.thumb %}
<div class="box altbox" style="background: url('{{item.thumb}}') no-repeat center/cover;">
{% else %}
<div class="box altbox">
{% endif %}
[{{ item.title }}]({{ item.url }})
<br>
<small>{{item.date | date: "%Y-%m-%d"}}</small>
</div>

{% endfor %}

</div>
