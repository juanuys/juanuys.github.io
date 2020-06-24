---
layout: home
---

<div class="boxes">

<div class="box box2">

princess in trouble

pixels moving 'cross the screen

for your enjoyment

</div>

{% assign pages_ordered_by_rank = (site.pages | sort: 'rank' ) %}

{% for p in pages_ordered_by_rank %}

{% if p.pagetype == "game" %}
<div class="box altbox" style="background: url('{{p.thumb}}') no-repeat center/cover;">
<a href="{{ p.permalink }}" style="position: absolute; top: 50px; ">{{p.title}}</a>
<small style="position: absolute; bottom: 10px; right: 10px;"><em>({{p.category}})</em></small>
</div>
{% endif %}
{% endfor %}



{% for i in (1..30) %}

<div class="box"></div>

{% endfor %}


</div>




