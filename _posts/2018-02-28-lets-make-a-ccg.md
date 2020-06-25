---
title: "Let's make a CCG!"
description: "Might as well get started."
layout: post
tags: contumacious gamedev ccg
category: blog
---

Previously, I [concluded]({% post_url 2018-02-23-fleshing-out-the-idea %}) (excitedly, mind you) that a Magic-style <abbr title="Collectible Card Game">CCG</abbr> might be the way to go.

Recap:

> A card could be “nail varnish” of class “smell”. It could carry medium attack points (since it stings the sinuses quite a bit), and since the smell hangs around quite a bit, it could have high “toughness” too. I can also be a “range” weapon, because it affects everyone in close proximity. (The smell starts losing potency when you’re further away.)

I'm a bigger fan of Hearthstone, but the beautifully tactile Magic cards have always made me smile.

I can opine, ideate, research, and analyse until [coleoids](https://en.wikipedia.org/wiki/Coleoidea) grow a ninth (or eleventh) tentacle, but now seems like a good time to start making cards!

# A few notes

I'll build the individual cards by hand, and balance them as I start playing with them. But first, a few notes before starting. I guess I'm ideating again; borrowing from the greats.

## Screw screw

Unlike Magic (or like Hearthstone) I won't have Basic Land cards. I want to avoid whatever "screw" these games suffer from. Each player will get one mana per turn, and max out at N.

Also, we can't call it mana, because this isn't a fantasy game. Perhaps money, credit, or ticket stubs?

## Heroes

<abbr title="Contumacious Commuter">CC</abbr> will have heroes. Each hero will have a special ability that will replenish with every turn. A hero will represent a class, or a class might have multiple heroes - not sure.

## Classes

There will be multiple classes (like the 5 colours of Magic). This could be "bus, train, tram" or competing travel operators. Probably "bus, train, tram" etc as these are things everyone can relate to, and my travel operators mightn't be inventive enough.

## Cards

Cards can be specific to a class, or neutral.

Cards will be
- creatures *(well... commuters)*
- weapon
- trap
- taunt (i.e. the opponent MUST attack this card first)

No spell cards, since this is not a fantasy game.

Some cards have "charge" and take effect straight away. Otherwise, cards need 1 turn to "warm up".

Some cards summon other cards automatically, just like Hearthstone's Battlecry.

Cards can be "secretive" (like traps) which the opponent won't know about when played. (e.g. these cards are played face down)

Some cards will have an "adjacency" stat, e.g. Foo can give the 2 neighbouring cards +1/+1. (that's one extra health and one extra defense) For this reason, it's good to think of a rule which dictates in which "layout" cards are played, e.g. in a single row, or in any grid formation you like.

Since kindnesses are also something you can exhibit in a public space (like smiling at someone, or offering a handkerchief), kindness cards will exist which will be a neutraliser against the weapon cards.
# Enough's enough - let's make a few cards!

Resisting the urge to go online and buy new stationary, I just grab a white PostIt stack and I have a pen in my coat pocket.

A few scribbles later, and this:

![sample cards](/assets/posts/2018-02-28-lets-make-a-ccg/sample-cards.jpg)

An example play would be (ignoring mana for a moment):

- the opponent draws "chews gum" and "elbow wrestle"
- you draw "winks" and "nail varnish"
- the opponent plays "chews gum", but it has no effect yet, because it needs a turn to warm up
- you play "winks", and since it's a Kindness, it has a neutralising effect and is effective immediately. You target the opponent's "chews gum" and remove both cards from the area
- the opponent plays "elbow wrestle", and it needs a turn to warm up
- you play "nail varnish", and it needs a turn to warm up
- the opponent draws/plays something else (doesn't matter for now), but "elbow wrestle" takes effect
- the opponent attacks your "nail varnish" with their "elbow wrestle". "nail varnish" loses one health, and its counter attack destroys "elbow wrestle" which removes "elbow wrestle" from the board but leaves "nail varnish" with 1 health remaining
- you draw/play something else (doesn't matter for now), and your "nail varnish" takes effect, subtracting 2 health for ALL the cards and heroes currently in play

# Conclusion

That little play session was actually quite fun, and I am quite eager to get started on more cards.

I'll now have a think whether an automated solution earlier in the process might speed things up, e.g. a bit of code to turn data and images into beautiful cards.

Stay chooned.
