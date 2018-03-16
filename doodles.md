---
layout: home
permalink: /doodles/index.html
---
<div class="boxes">

<div class="box box2">

dip pens and pencils

gliding over the Moleskine

to reveal not much

</div>


{% for item in site.doodles reversed %}
<div class="box altbox" style="background-image: url({{item.thumbnail}}); background-repeat: no-repeat;">
[{{item.title | truncatewords: 7 }}]({{ item.url }})
<small>{{item.date | date: "%Y-%m-%d"}}</small>
</div>
{% endfor %}

</div>
