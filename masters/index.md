---
layout: home
---
<div class="boxes">

<div class="box box2">

any fool can know

the point is to understand

says albert einstein

</div>


{% for post in site.posts %}
{% if post.tags contains "ma" %}
{% if post.thumb %}
<div class="box altbox" style="background: url('{{post.thumb}}') no-repeat center/cover;">
{% else %}
<div class="box altbox">
{% endif %}
[{{post.title | truncatewords: 7 }}]({{ post.url }})
<small>{{post.date | date: "%Y-%m-%d"}}</small>
</div>
{% endif %}
{% endfor %}


{% assign pages_ordered_by_rank = (site.pages | sort: 'rank' ) %}
{% for p in pages_ordered_by_rank %}
{% if p.pagetype == "masters" %}

{% if p.thumb %}
<div class="box altbox" style="background: url('{{p.thumb}}') no-repeat center/cover;">
{% else %}
<div class="box altbox">
{% endif %}

<a href="{{ p.permalink }}">{{p.title}}</a>
</div>
{% endif %}
{% endfor %}


{% for i in (1..30) %}

<div class="box"></div>

{% endfor %}


</div>
