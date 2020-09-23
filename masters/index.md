---
layout: home
---
<div class="boxes">

<div class="box box2">

any fool can know

the point is to understand

says albert einstein

</div>


{% assign pages_ordered_by_rank = (site.pages | sort: 'rank' ) %}

{% for p in pages_ordered_by_rank %}

{% if p.pagetype == "masters" %}
<div class="box altbox" style="background: url('{{p.thumb}}') no-repeat center/cover;">
<a href="{{ p.permalink }}" style="position: absolute; top: 50px; ">{{p.title}}</a>
</div>
{% endif %}
{% endfor %}


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
