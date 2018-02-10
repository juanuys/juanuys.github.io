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


{% for item in site.photograms %}
<div class="box altbox">
[{{item.title | truncatewords: 7 }}]({{ item.url }})
<small>{{item.date}}</small>
</div>
{% endfor %}

</div>
