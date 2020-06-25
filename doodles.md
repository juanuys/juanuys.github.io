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

<div class="box altbox" style="background: url('/assets/doodles/mad-murdoch.png') no-repeat center/cover;">
[some more doodles on Tumblr](https://opyate.tumblr.com/)
</div>

{% for item in site.doodles reversed %}

[![]({{item.thumbnail}})]({{item.url}})

{% endfor %}

</div>
