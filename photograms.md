---
layout: home
permalink: /photograms/index.html
---
<div class="boxes">

<div class="box box2">

snapshots of whatnots

sometimes blurry, sometimes crisp

not in the moment

</div>


{% for item in site.photograms reversed %}
<div class="box altbox" style="background-image: url({{item.thumbnail}});">
[{{item.title | truncatewords: 7 }}]({{ item.url }})
<small>{{item.date | date: "%Y-%m-%d"}}</small>
</div>
{% endfor %}

</div>
