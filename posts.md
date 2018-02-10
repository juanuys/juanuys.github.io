---
layout: home
permalink: /posts/index.html
---
<div class="boxes">

<div class="box box2">

stream of consciousness

a confident idiot

yet another blog

</div>

{% for item in site.posts %}
<div class="box">
[{{ item.title }}]({{ item.url }})
</div>
{% endfor %}

</div>
