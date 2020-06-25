---
layout: home
permalink: /doodles/
---
<div class="boxes">

<div class="box box2">

dip pens and pencils

gliding over the Moleskine

to reveal not much

</div>

{% for item in site.doodles reversed %}

[![]({{item.thumbnail}})]({{item.url}})

{% endfor %}

</div>
