---
layout: post
title: "Add tag pages to your Jekyll blog without plugins."
description: "Add tag pages to your Jekyll blog without plugins."
tags: [tech,jekyll,javascript]
category: blog
---

See the tags at the top of the page? Well, you can now click on them and go to a listing of all posts with the same tag. You can simply copy the code [in this commit](https://github.com/juanuys/juanuys.github.io/commit/24d20fce4acbc086923d7a2cae99bcbe7d6b64a9), but I'll elaborate below.

The tag listing at the top of this page is done in the `post` layout with the following snippet:

```
{% raw %}
<div class="tags">
  <ul>
  {% for tag in page.tags %}
    <li><a title="tag: {{tag}}" href="/tags#{{tag}}">{{ tag }}</a></li>
  {% endfor %}
  </ul>
</div>
{% endraw %}
```


Add a new top-level page called `tags.html` with some front-matter and the following content:

```
{% raw %}
{% assign sorted_tags = (site.tags | sort:0) %}

<div id="tags_container">
  {% for tag in sorted_tags %}
    {% assign t = tag | first | downcase %}
    {% assign posts = tag | last %}

    <div id="{{t}}">
      {{ t }}
      <ul>
      {% for post in posts %}
        {% if post.tags contains t %}
        <li>
          <a href="{{ post.url }}">{{ post.title }}</a>
          <span class="date">{{ post.date | date: "%B %-d, %Y"  }}</span>
        </li>
        {% endif %}
      {% endfor %}
      </ul>
    </div>
  {% endfor %}
</div>
{% endraw %}
```

It loops through all tags in `site.tags` and finds the posts for each.

Then, also add the following bit of Javascript which will detect if the new tags page is called with an anchor attribute, and then use that attribute to whittle down the tags listing.

```
<script type="text/javascript">
var parent = document.getElementById('tags_container');

function getTag() {
	var parts = document.URL.split('#');
  return (parts.length > 1) ? parts[1] : null;
}

var tag = getTag();

if (tag !== null) {
  var children = parent.children
  for (var i=0; i < children.length; i++) {
    var child = children[i];
    if (child.id !== tag) {
      child.style = 'display: none;'
    }
  }
}
</script>
```

That's it! Now you posts by tags without the need to process your static content locally before pushing to - say - Github Pages.