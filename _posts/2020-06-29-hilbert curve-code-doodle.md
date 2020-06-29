---
layout: post
title: "Hilbert Curve"
description: "A code doodle."
tags: imadeathing code art genart javascript canvas
category: blog
thumb: /assets/posts/2020-06-29-hilbert-curve-code-doodle/thumb.png
---

<script>
  var parentDiv = document.getElementsByClassName("all")[0];
  var closeButton = document.createElement("input");
  closeButton.classList.add("closeButton");
  closeButton.value = "X";
  closeButton.onclick = function() {
    parentDiv.remove();
  };
  parentDiv.insertBefore(closeButton, parentDiv.firstChild);

  // modify this value to see fewer/more curve segments
  var order = 6;
  
  var canvas = document.createElement('canvas');
  canvas.id = 'the-canvas';
  setCanvasDimensions();
  document.body.prepend(canvas);
  var ctx = canvas.getContext('2d');
  ctx.lineWidth = 2;

  function setCanvasDimensions() {
    if (window.innerHeight > window.innerWidth) {
      canvas.height = window.innerWidth;
      canvas.width = window.innerHeight;
    } else {
      canvas.height = window.innerHeight;
      canvas.width = window.innerWidth;
    }
  }
  function Point(x, y) {
    this.x = x;
    this.y = y;
  }
  Point.prototype.mult = function(scalar) {
      this.x *= scalar;
      this.y *= scalar;
      return this;
  }
  Point.prototype.add = function(x, y) {
      this.x += x;
      this.y += y;
      return this;
  }

  var N = Math.pow(2, order);
  var total = N * N;

  function hilbert(i) {
    var points = [new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 0)];
    var index = i & 3;
    var v = points[index];

    for (var j = 1; j < order; j++) {
      i = i >>> 2;
      index = i & 3;
      var len = Math.pow(2, j);
      switch(index) {
        case 0:
          var temp = v.x;
          v.x = v.y;
          v.y = temp;
          break;
        case 1:
          v.y += len;
          break;
        case 2:
          v.x += len;
          v.y += len;
          break;
        case 3:
          var temp = len - 1 - v.x;
          v.x = len - 1 - v.y;
          v.y = temp;
          v.x += len;
          break;
        default:
            // should not happen
          alert("hilbert unknown index", index);
          break;
      }
    }
    return v;

  }

  var isInViewport = function isInViewport(elem) {
      var bounding = elem.getBoundingClientRect();
      //  If the bottom is in view but the top isn't then it's visible
      return bounding.bottom >= 0 && bounding.bottom <= (window.innerHeight || document.documentElement.clientHeight) || bounding.top >= 0 && bounding.top <= (window.innerHeight || document.documentElement.clientHeight);
  };

  var animate = null;

  function stop() {
    animate = false;
  }

  function start() {
    animate = true;

    var counter = 0;
    var index = 1;
    function reset () {
      ctx.clearRect(0, 0, canvas.width, canvas.height);
      counter = 0;
      index = 1;
      ctx.strokeStyle = 'black';
    }
    reset();

    // using height as it's shorter than width
    var len = Math.floor(canvas.height / N);
    // initialise the entire curve
    var path = [];
    for (let i = 0; i < total; i++) {
        path[i] = hilbert(i);
        path[i].mult(len);
        path[i].add(len / 2, len / 2);
    }

    function step() {
      if (!animate) return;
      if (!isInViewport(canvas)) return;

      // draw chunks up to counter's value
      do {
          // hue between 0 and 360, based on i in 0 -> path.length
        var hue = index * 360 / path.length;
        ctx.strokeStyle = 'hsla(' + hue + ', 100%, 40%, 1)';
        ctx.beginPath();
        ctx.moveTo(path[index].x, path[index].y);
        ctx.lineTo(path[index - 1].x, path[index - 1].y);
        ctx.stroke();
      } while (++index < counter);

      counter += (path.length / 2048);
      if (counter > path.length) {
        reset();
        // stop();
      }

      window.requestAnimationFrame(step);
    }

    window.requestAnimationFrame(step);
  }

  window.addEventListener('resize', function () {
    setCanvasDimensions();
    stop();
    start();
  });

  start();
    
  </script>