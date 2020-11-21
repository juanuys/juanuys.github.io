---
layout: home
permalink: /blog/
---
<div class="boxes">

<div class="box box2" markdown="1">

stream of consciousness

a confident idiot

yet another blog

</div>

{% for item in site.posts %}

{% if item.thumb %}
<div class="box altbox" style="background: url('{{item.thumb}}') no-repeat center/cover;" markdown="1">
{% else %}
<div class="box altbox" markdown="1">
{% endif %}
[{{ item.title }}]({{ item.url }})
<br>
<small>{{item.date | date: "%Y-%m-%d"}}</small>
</div>

{% endfor %}

</div>
