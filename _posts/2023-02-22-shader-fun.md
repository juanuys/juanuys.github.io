---
layout: post
title: "Shader fun."
description: "Shader fun."
tags: imadeathing code art genart javascript canvas shader webgl
category: blog
thumb: /assets/posts/2023-02-22-shader-fun/thumb.png
---

Idea nicked from [Felix Turner](https://airtight.cc/) and image from [here](https://www.wallpaperflare.com/archetype-octopus-kraken-wallpaper-ybiep/download/1920x1080).


<script>
  var parentDiv = document.getElementsByClassName("all")[0];
  var closeButton = document.createElement("input");
  closeButton.classList.add("closeButton");
  closeButton.value = "X";
  closeButton.onclick = function() {
    parentDiv.remove();
  };
  parentDiv.insertBefore(closeButton, parentDiv.firstChild);

  var canvasDiv = document.createElement('div');
  canvasDiv.class = "hero";
  
  var canvas = document.createElement('canvas');
  canvas.id = 'hero-gl';
  canvas.height = window.innerHeight;
  //canvas.style.height = '100%';
  canvas.style.position = 'absolute';
  canvas.style.top = 0;
  canvas.style.left = 0;
  canvas.width = window.innerWidth;
  //canvas.style.width = '100%';
  canvasDiv.appendChild(canvas);

  document.body.prepend(canvas);
</script>

<script src="/assets/posts/2023-02-22-shader-fun/app.js"></script>
