---
layout: home
permalink: /made/index.html
---
<div class="boxes">

<div class="box box2">

sweet little nothings

once useful but now broken

here for all to see

</div>

<div class="box altbox">
[pdfcrunch](https://pdfcrun.ch)
<small>2018-01-25</small>
</div>

{% for item in site.made %}
<div class="box altbox">
[{{item.title | truncatewords: 7 }}]({{ item.url }})
<small>{{item.date | date: "%Y-%m-%d"}}</small>
</div>
{% endfor %}

<div class="box altbox">
[bits and pieces](https://github.com/opyate)
<small>forevermore</small>
</div>

</div>
