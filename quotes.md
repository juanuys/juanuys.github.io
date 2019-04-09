---
layout: home
permalink: /quotes/index.html
---
<div class="boxes">

<div class="box box2">

a good website filler

when crafty words escape me

the quotable quote

</div>


{% for item in site.quotes reversed %}
  {% if item.redacted %}
  {% else %}
  <div class="box altbox">
  [{{item.title | truncatewords: 7 }}]({{ item.url }})
  </div>
  {% endif %}
{% endfor %}

{% for i in (1..30) %}

<div class="box"></div>

{% endfor %}

</div>
