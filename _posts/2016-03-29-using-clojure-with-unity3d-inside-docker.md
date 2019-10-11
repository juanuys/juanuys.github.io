---
title: "Using Clojure with Unity3D inside Docker"
description: "I braced myself for a thorough hack to get Cl..."
layout: post
tags: tech unity3d clojure docker gamedev
category: blog
---

I braced myself for a thorough hack to get Clojure working in Unity3D, and found that it's [already been done](https://github.com/arcadia-unity/Arcadia).

So, I instead spent my time implementing a subset of Flappy Bird.

![flappy bird](/assets/posts/2016-03-29-using-clojure-with-unity3d-inside-docker/flappy.gif)

When using Unity3D, I can imagine most of the work going into asset creation, story/level progression and play testing. This is the only real code I wrote:

## A bird

<pre>
(defcomponent Bird [^Vector2 force]
  (Start [this]
         (reset! score 0))
  (Update [this]
          (swap! score (fn [n] (+ n Time/deltaTime)))
          (if (Input/anyKeyDown)
            (.. this (GetComponent Rigidbody2D)
            ;; flap yer wings, bud!
                (AddForce force ForceMode2D/Impulse))))
  (OnCollisionEnter2D [this collision]
                      (if (= (.. collision gameObject tag) "Boundary")
                        (game-over))))

</pre>

## Move some pipes

<pre>
(defcomponent MovingPipe [^float speed]
  (Update [this] (pipe-update this)))

(defn +- []
  (if (= 0 (rand-int 2))
    +
    -))

(defn pipe-update [^MovingPipe this]
  (.. this transform (Translate (* (.speed this) Time/deltaTime)
                                0
                                0))
  (if (< (.. this transform position x)
         -1)
    (set! (.. this transform position)
          (Vector3. 1
                    ((+-) ; fluctuating pipe heights
                     (.. this transform position y)
                     (* 0.3 (rand)))
                    0))))
</pre>

Oh, and I did mention that I'm doing all of this [inside Docker](https://github.com/opyate/unity3d).
