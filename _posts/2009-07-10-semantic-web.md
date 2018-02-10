---
title: "Semantic Web — exciting times!"
description: "Semantic Web"
date: 2009-07-10
og_image_url: "http://www.w3.org/DesignIssues/diagrams/loop.gif"
image: "http://www.w3.org/DesignIssues/diagrams/loop.gif"
image_content_type: "image/gif"
layout: post
tags: [tech, semweb]
category: blog
---

Hi there,

I'm Juan and I'm new to SW.

I eagerly jumped into the deep end of the SW pool and wanted to create a "lists on the web" program, but 30 minutes into the whole ordeal I realised that

* it's going to be a gross duplication of (possibly existing) data.
* there's already a slew of tools I can utilise and improve.
* I'm very naive, and this Semantic Web thing is a beast ;-)

Here's a post I left on the SW London Meetup.com group message board, to give you an idea of what I planned.

> I'm going to run an idea by you and would like some input as to its feasibility/usefulness.
> 
> In an attempt to learn Scala I want to do a fun SW project. My inspiration is the Cloud, Lisp's concept of lists, and my mate's listing of DVD titles on some crummy web site. I wanted to create a web site that isn't limited to just DVD titles. You could, for instance, have a list of favourite sci-fi novels (and have an ISBN plugin on top of it to add value) or have a list of friends (and have a FaceBook plugin... etc).
> 
> So, I guess, instead of having said plugins, you create RDF for your data:
> 
<pre>
my book has the identifier #isbn
with:
        subject = my book
        predicate = has the identifier
        object = some ISBN number
</pre>
> 
> The upper ontology can be "everything" (i.e. the root of all your lists), then you can start breaking it down: people (and in turn family and friends), books (and in turn novels, novellas, prose) etc.
> 
> This data, and the meta data that describes it can now obviously be used by other services: Amazon can send you recommendations based on your books list. Some chef can send you recipes based on your favourite recipes list. Etc.
> 
> And it's all hosted in the cloud, or on your personal site, or on a site I'm going to create for this purpose (domain already purchased: listabl.es). I hope to develop a re-usable piece of free Open Source software which anybody can host anywhere, then the various instances can "talk" and/or provide a useful API to the outside world.
> 
> The main pull for this idea in a social sense is that people like to make lists of their favourite things and share it.
> 
> This message is by no means complete, but I'd like to discuss the idea further at the next meetup.
> 
> Juan

And the initial github commit: [listabl.es](http://listabl.es) 

Since I've created this github project, I've started researching this weird and wonderful subject and came across things like FOAF, SKOS, etc. Presumably there's a namespace somewhere in there which can be re-used to link individuals with their "lists of things".

Said "things" also shouldn't need to be duplicated if they exist already. E.g. one of my favourite authors is already defined here: [Greg Egan on dbpedia.org](http://dbpedia.org/page/Greg_Egan) and surely my FOAF profile can somehow define a "list of my favourite authors" which in turn points to this resource.

Anyhoo, as you can see I'm keen to learn and keen to invest my time in SW. I'm very eager to work on something worthwhile, so please let me know where I can direct my attention to - perhaps an Open Source project? I'm a coder - not an editor/writer, but if you need me on documentation duty, I'll gladly oblige.

Thanks for reading, and please leave a comment below, or [contact me](mailto:%6F%70%79%61%74%65%40%67%6D%61%69%6C%2E%63%6F%6D).
