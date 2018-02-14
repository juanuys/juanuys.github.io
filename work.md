---
layout: home
permalink: /work/index.html
---
<div class="boxes">

<div class="box box2">

modern slavery

selling one's time for money

as long as it's fun

</div>

{% for item in site.work %}
<div class="box altbox">
[{{ item.title }}]({{ item.url }})

<small>{{item.date | date: "%Y"}}</small>
</div>
{% endfor %}

{% for i in (1..30) %}

<div class="box"></div>

{% endfor %}


</div>
