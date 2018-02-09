---
title: "Using single and double pipes in Scala conditionals"
description: "Using single and double pipes in Scala conditionals"
layout: post
tags: scala
category: blog
---

In a nutshell, use a single pipe if you want all the expressions in your conditionals to be evaluated, and a double pipe to conk out as soon as you have ```true```.

<pre>
scala> def a = { println("a") ; true }
a: Boolean

scala> def b = { println("b") ; true }
b: Boolean

scala> def c = { println("c") ; true }
c: Boolean

scala> if (a || b || c) println("true") else println("false")
a
true

scala> if (a | b | c) println("true") else println("false")
a
b
c
true
</pre>
