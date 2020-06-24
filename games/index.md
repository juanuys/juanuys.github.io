---
layout: home
---

<div class="boxes">

<div class="box box2">

princess in trouble

pixels moving 'cross the screen

for your enjoyment

</div>


{% for p in site.pages %}

{% if p.pagetype == "game" %}
<div class="box altbox" style="background: url('{{p.thumb}}') no-repeat center/cover;">
[{{p.title | truncatewords: 7 }}]({{ p.permalink }})
<small style="position: absolute; bottom: 10px; right: 10px;"><em>({{p.category}})</em></small>
</div>
{% endif %}
{% endfor %}



{% for i in (1..30) %}

<div class="box"></div>

{% endfor %}


</div>




