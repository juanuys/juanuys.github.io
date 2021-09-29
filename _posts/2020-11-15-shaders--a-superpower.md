---
layout: postcrj
title: "Shaders - a superpower."
description: "Shaders - a superpower."
tags: ma falmouth crj ma-development-practice gdd710 week8 shaders crj-interpersonal crj-procedural
category: blog
# disqus_comments: true
thumb: /assets/masters/crj/thumb.png
week: 8
module: development practice
code: GDD710
---

We're almost at the end of our second rapid ideation session.

This time around I'm making a bit of a mix of puzzle game and art installation with another student in the cohort. It involves 3D graphics and a special effect: orthographically projecting graphics onto the sides of a set of cubes.

I'm using an off-the-shelf library called `three-projected-material` {% cite fugaro_marcofugarothree-projected-material_2020 %}, albeit heavily modified as it has some bugs.

I'm using orthographic (or parallel/oblique) projection, as opposed to perspective projection {% cite torralba_advances_2016 %}. As such, the projected texture is supposed to only appear on one face, but as you can see in the screenshot below, the texture "smears" along the side of some of the cubes in some instances: 

![Orthographic projection](/assets/posts/2020-11-15-shaders--a-superpower/orthographic-projection.png)

The bug is with the library's shaders, but I haven't been able to figure it out. More importantly, I've been wanting to project different textures onto the other sides of the cubes (to give some depth to the puzzle), but the library doesn't have support for this, and again: the answer lies in the shader code.

Shaders have been around for a long time, having roots in Pixar's Reyes Image Rendering Architecture from 1987 which has initially used for post-processing in films {% cite cayanan_pixars_2013 %}, {%cite cook_proceedings_1987 -l 95-102 %}.

Learning shaders is like acquiring a superpower which transcends game engines and target platforms:

{% quote gonzalez_vivo_book_2015 %}
...the revolutionary computational technique, fragment shaders, that is taking digitally generated images to the next level. You can think of it as the equivalent of Gutenberg's press for graphics.
{% endquote %}

I've long been aware of the power of shaders, and have even suggested it to a fellow student during a webinar when he mentioned his game's graphics are too dark, and he wants it to look more cartoony (and presuming he'd have to recreate all the graphics assets):

![Me suggesting a shader in the webinar](/assets/posts/2020-11-15-shaders--a-superpower/suggest-shader.png)

I've decided to knuckle down on shaders. I've created a [SMART goal](/masters/goals#become-more-fluent-with-shadersglsl) and have assembled this list of resources to start with:

- [https://thebookofshaders.com/](https://thebookofshaders.com/)
- [http://stack.gl/](http://stack.gl/)
- [https://aerotwist.com/tutorials/an-introduction-to-shaders-part-1/](https://aerotwist.com/tutorials/an-introduction-to-shaders-part-1/)
- [https://notes.underscorediscovery.com/shaders-a-primer/](https://notes.underscorediscovery.com/shaders-a-primer/)

Of course, shader math is all about linear algebra and trigonometry {% cite gonzalez_vivo_book_2015 %}, so I'd also have to dust off some old high school / uni maths 101 books...

# Bibliography

{% bibliography --cited %}
