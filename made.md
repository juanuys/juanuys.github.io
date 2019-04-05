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

Turn PDFs into data

<small>2018-01-25</small>
</div>

<!-- <div class="box altbox">
[comicbot](https://comicbot.co/)

automate the comic artist within

<small>2017-09-10</small>
</div> -->

<div class="box altbox">
[Flask-Pushrod](https://github.com/UYSio/Flask-Pushrod)

content negotiation for Flask

<small>inherited 2015-07</small>
</div>

<div class="box altbox">
[Flask-Sandboy (fork)](https://github.com/UYSio/flask_sandboy)

REST your DB

<small>forked 2015-07</small>
</div>


<div class="box altbox">
[taximeter](https://github.com/opyate/taximeter)

Taxi meter API built to TFL spec

<small>2014-01-30</small>
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

{% for i in (1..30) %}

<div class="box"></div>

{% endfor %}


</div>
