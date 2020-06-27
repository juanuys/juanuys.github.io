---
layout: post
title: "A code doodle."
description: "A code doodle."
tags: imadeathing code art genart javascript canvas
category: blog
thumb: /assets/posts/2020-06-26-a-code-doodle/thumb.png
---

Not animated, but refresh for new random variation along x.

<script>
  var parentDiv = document.getElementsByClassName("all")[0];
  var closeButton = document.createElement("input");
  closeButton.classList.add("closeButton");
  closeButton.value = "X";
  closeButton.onclick = function() {
    parentDiv.remove();
  };
  var foo = parentDiv.insertBefore(closeButton, parentDiv.firstChild);

  var canvas = document.createElement('canvas');
  canvas.id = 'the-canvas';
  canvas.height = window.innerHeight;
  canvas.width = window.innerWidth;
  document.body.prepend(canvas);
  var ctx = canvas.getContext('2d');

  function draw() {
    ctx.strokeStyle = 'black';
    var scanlines = 100;
    var segments = 50;
    var x_offset = canvas.width / segments;

    for (var i=0; i<scanlines; i++) {
      ctx.lineWidth = 0.8;
      var y = canvas.height * (i / scanlines);
      for (var j=0; j<segments; j++) {
        if (j > segments / 2) {
          ctx.lineWidth += 0.05;
        }
        // 0 up to 0.99
        var x_factor = (segments - j) / segments;
        var x_phase = Math.sin(x_factor);

        // 0 up to width
        var x = canvas.width * (j / segments);

        var y_offset = 0;
        var rand = Math.random();

        // y variation is a function of x growth
        if (rand > x_factor) {
          y_offset = Math.log(1/x_phase);
          y_offset *= (x_offset / 5);
        }
        if (j == 0) {
          y_offset = 0;
        }

        var y_offset_a = y + (Math.random() * 0.5 * y_offset);
        var y_offset_b = y + y_offset;
        
        // wiggle (randomly change sign)
        if (Math.random() < 0.5) {
          y_offset_a = y - (Math.random() * 0.5 * y_offset);
          y_offset_b = y - y_offset;
        }

        ctx.beginPath();
        ctx.moveTo(x, y_offset_a);
        ctx.lineTo(x + x_offset, y_offset_b);
        
        ctx.stroke();
      }
    }
  }

  window.addEventListener('resize', function () {
    canvas.width = window.innerWidth;
    canvas.height = window.innerHeight;
    draw();
  });

  draw();
    
  </script>