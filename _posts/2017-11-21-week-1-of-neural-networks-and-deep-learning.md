---
title: "Week 1 of Neural Networks and Deep Learning"
description: " Introduction to Deep Learning..."
layout: post
tags: plato-long nn coursera deeplearning
category: blog
---

# Introduction to Deep Learning

These are my notes on week #1 of the [Introduction to Deep Learning](https://www.coursera.org/learn/neural-networks-deep-learning/) Coursera MOOC.

## Overview

[Video #1](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/Cuf2f/welcome) runs through an overview of all 5 courses in the specialisation.

## What is a Neural Network?

[Video #2](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/eAE2G/what-is-a-neural-network) asks *What Is A Neural Network*?
E.g. Taking samples of house size (x) and their house price (y) can be plotted as a straight line using linear regression. Since the house price can never be negative, the curve ends up looking like _/
This simple graph is a neural network: given an input size, an output price can be predicted.
This graph appears frequently in NN literature, and is known as a **ReLU** (Rectified Linear Unit).

Input house size can be expanded to many more features like ZIP code, number of bedrooms, etc - "home features".

## Supervised learning

[Video #3](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/2c38r/supervised-learning-with-neural-networks) talks about Supervised Learning.
It discusses different applications, and which type of NN is best suited, e.g.

<table>
<thead>
<tr>
<td>Input (x)</td>
<td>Output (y)</td>
<td>Application</td>
<td>Type</td>
<td>Data</td>
</tr>
</thead>
<tr>
<td>Home features</td>
<td>Price</td>
<td>Real estate</td>
<td>Standard NN</td>
<td>Structured (e.g. CSV)</td>
</tr>
<tr>
<td>Ad, user info</td>
<td>Click? (0/1)</td>
<td>Online ads</td>
<td>Standard NN</td>
<td>Structured |
</tr>
<tr>
<td>Image</td>
<td>Classification</td>
<td>Photo tagging</td>
<td>CNN</td>
<td>Unstructured |
</tr>
<tr>
<td>Audio</td>
<td>Text transcript</td>
<td>Speech recog</td>
<td>RNN (because it's 1-dimensional time-series)</td>
<td>Unstructured |
</tr>
<tr>
<td>English</td>
<td>Chinese</td>
<td>Machine translation</td>
<td>RNN (also sequence data)</td>
<td>Unstructured |
</tr>
<tr>
<td>Image, Radar</td>
<td>Position of other cars</td>
<td>Autonomous driving</td>
<td>Custom/Hybrid</td>
<td>Unstructured |
</tr>
</table>

## Why is Deep Learning taking off?

[Video #4](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/praGm/why-is-deep-learning-taking-off) asks why deep learning is taking off. (well, I've personally been fascinated with neural nets since the late nineties, but here we go...).
Answer: data is getting larger, and NNs are more performant at data scale.
Ng briefly touches on why the signoid is dropping out of favour and being replaced by ReLU: The sigmoid has a 0 gradient in the two outermost regions (the tails of the curve) which slows down training, because if you implement gradient descent, and the gradient is 0, then the parameters just change very slowly. Whereas with the ReLU, the gradient is 1 for all positive values. (the fact that the left region has a 0 slope and how it impacts training will probably become more apparent in later videos, but I suspect some manner of pruning/drop-out will come into play here.)

## About the course

[Video #5](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/6A3es/about-this-course) talks about the curriculum again.

## Resources

[Video #6](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/2PhD4/course-resources) mentions course resources:

- [forum](https://www.coursera.org/learn/neural-networks-deep-learning/discussions)
- yup, that's it

## Heroes of Deep Learning

[Video #7](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/dcm5r/geoffrey-hinton-interview) the last, optional video is an interview with [Geoffrey Hinton](https://en.wikipedia.org/wiki/Geoffrey_Hinton), which I can wholeheartedly recommend. Interestingly, at the 12h30 mark Geoffrey notes that he was working on variational methods, and it just so happens that people in statistics were also working on the same problem, but they didn't know about it at the time. (Which goes to show that we can all do with better communication, and/or opening our eyes more often.)
Around the 23m mark Hinton touches on [Capsule Networks](https://www.youtube.com/watch?v=rTawFwUvnLE), which is something I'm also excited about.

Advice:

- read the literature, but not too much of it!
- notice what everyone does wrong, and do it right

Around the 36m mark, Hinton says the thing which is on [everyone's](https://medium.com/@karpathy/software-2-0-a64152b37c35) lips right now: we're not programming computers anymore, we're *showing* computers.


