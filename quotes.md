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


{% for item in site.quotes %}
<div class="box altbox">
[{{item.title | truncatewords: 7 }}]({{ item.url }})
<small>{{item.date | date: "%Y-%m-%d"}}</small>
</div>
{% endfor %}

</div>
