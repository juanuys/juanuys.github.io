---
layout: home
---

<div class="boxes">

<div class="box box2">

digital hoarder
time you will never get back
pointless ensemble

</div>

{% for c in site.collections %}
<div class="{{ c.label }} box">

{{ c.label }}
{{ c.values.description }}
</div>
{% endfor %}

{% for i in (1..30) %}

<div class="box">
&nbsp;
</div>


{% endfor %}

</div>
