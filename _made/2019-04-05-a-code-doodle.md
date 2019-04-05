---
layout: post
title: "A code doodle."
description: "A code doodle."
tags: [code,art,genart]
category: blog
---

<canvas id="canvas_sines" width="2560" height="1440" style="width:100%; height: 100%"></canvas>

<script>
'use strict';

function _toConsumableArray(arr) { if (Array.isArray(arr)) { for (var i = 0, arr2 = Array(arr.length); i < arr.length; i++) { arr2[i] = arr[i]; } return arr2; } else { return Array.from(arr); } }

var sineCanvas = document.getElementById('canvas_sines');
var sineCtx = sineCanvas.getContext('2d');
// sineCtx.globalCompositeOperation = 'xor';

var spacing = 20;
var numOfLines = sineCanvas.height / spacing;

var startOffset = spacing / 2;
var quarter = (sineCanvas.width - spacing) / 4;
var yRange = [].concat(_toConsumableArray(Array(numOfLines).keys()));

sineCtx.lineWidth = 10;
var startTime = new Date().getTime();
var counter = 0;
var hue1 = 180; // cyan
var hue2 = 300; // magenta
var hue3 = 60; // yellow
var alpha = 0.2;

var isInViewport = function isInViewport(elem) {
  var bounding = elem.getBoundingClientRect();
  //  If the bottom is in view but the top isn't then it's visible
  return bounding.bottom >= 0 && bounding.bottom <= (window.innerHeight || document.documentElement.clientHeight) || bounding.top >= 0 && bounding.top <= (window.innerHeight || document.documentElement.clientHeight);
};

function line(diff, n, hue) {
  yRange.forEach(function (y) {
    var yDiv = y / numOfLines;

    var firstYShift = Math.sin(yDiv * Math.PI * 6) * (Math.sin(diff * n) * 31);
    var secondYShift = Math.sin(yDiv * Math.PI * 5) * (Math.sin(diff / 873) * 37);
    var thirdYShift = Math.sin(yDiv * Math.PI * 4) * (Math.sin(diff / 999) * 43);

    var firstXShift = Math.sin(yDiv * Math.PI * 3) * (Math.sin(diff / 1213) * 77);
    var secondXShift = Math.sin(yDiv * Math.PI * 2) * (Math.sin(diff / 1303) * 91);
    var thirdXShift = Math.sin(yDiv * Math.PI * 1) * (Math.sin(diff / 1400) * 101);

    hue += 2;
    sineCtx.strokeStyle = 'hsla(' + hue + ', 100%, 50%, ' + alpha + ')';
    sineCtx.beginPath();
    sineCtx.moveTo(startOffset, y * spacing + startOffset);
    sineCtx.lineTo(startOffset + quarter + firstXShift, y * spacing + startOffset - firstYShift);
    sineCtx.lineTo(startOffset + quarter * 2 + secondXShift, y * spacing + startOffset + secondYShift);
    sineCtx.lineTo(startOffset + quarter * 3 + thirdXShift, y * spacing + startOffset + thirdYShift);
    sineCtx.lineTo(sineCanvas.width - startOffset, y * spacing + startOffset);
    sineCtx.stroke();
  });
}

var startSine = function () {
  setInterval(function () {
    if (!isInViewport(sineCanvas)) return;
    sineCtx.clearRect(0, 0, sineCanvas.width, sineCanvas.height);

    var diff = new Date().getTime() - startTime;

    line(diff, 0.0001, hue1);

    diff += counter + 123;
    line(diff, 0.001, hue2);

    // sineCtx.strokeStyle = 'hsla(' + hue3 + ', 100%, 50%, ' + alpha + ')';
    // diff += counter;
    // line(diff, 0.00001);

    hue1 += 0.947;
    hue2 += 0.823;
    hue3 += 0.123;
    counter += 1;
  }, 1000/60);
};
startSine();
</script>
