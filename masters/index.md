---
layout: home
---
<div class="boxes">

<div class="box box2" markdown="1">

any fool can know

the point is to understand

says albert einstein

</div>


{% for post in site.posts %}
{% if post.tags contains "draft" %}
<!-- skipping draft post -->
{% else %}
{% if post.tags contains "ma" %}
{% if post.thumb %}
<div class="box altbox" style="background: url('{{post.thumb}}') no-repeat center/cover;" markdown="1">
{% else %}
<div class="box altbox" markdown="1">
{% endif %}
[{{post.title | truncatewords: 7 }}]({{ post.url }})
<small>{{post.date | date: "%Y-%m-%d"}}</small>
{% if post.week %}
<!-- <small class="highlight"><abbr title="critical reflective journal">crj</abbr> week {{ post.week }}</small> -->
<!-- <abbr title="critical reflective journal" style="background-color: #1986ff; color: white;">crj week {{ post.week }}</abbr> -->

<!-- style="background-color: #1986ff; color: white; display: flex;" -->
<small class="ma-module-tag {{post.code}}">{{post.code}} &mdash; week {{ post.week }}</small>

<!--<br>
<small style="background-color: pink; color: #333; display: flex; position: absolute; bottom: 10px; right: 20px; font-weight: bold; font-size: 1.5em;"><abbr title="critical reflective journal">CRJ</abbr></small>
-->

{% endif %}
</div>
{% endif %}
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
