title: "Week 4 of Neural Networks and Deep Learning"
description: " Deep Neural Network..."
layout: post
tags: plato-long nn coursera deeplearning
category: blog
---

# Deep Neural Network

## Deep L-layer neural network

[Video #1](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/7dP6E/deep-l-layer-neural-network) says that a deep neural network has 1+ hidden layers. The more layers, the deeper. Deep nets can solve problems that shallow nets just can't. It recaps some notation from the previous week.

## Forward propagation in a deep neural network

[Video #2](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/MijzH/forward-propagation-in-a-deep-network) shows what forward prop looks like in a deep net. Ng notes that a foor-loop would be necessary when applying **Z = WA + b** for each layer, so vectorisation can't be applied here.

![deep net forward prop](assets/deep-net-forward-prop.png)

## Getting your matrix dimensions right

[Video #3](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/Rz47X/getting-your-matrix-dimensions-right) says a nice way to ensure your model is bug-free is asserting the matrix dimensions are correct through-out.

For a hidden layer of weights, the dimension would be **Wl = (nl , nl-1)**
A hidden layer bias vector would be **bl = (nl, 1)**
The derivatives of *w* and *b* would have the same dimensions.

For **Z = WX + b**  we have: `(n1, 1) = (n1, n0) . (n0, 1) + (n1, 1)`

![dimensions](assets/dimensions.png)

And vectorised:


For **Z = WX + b**  we have: `(n1, m) = (n1, n0) . (n0, m) + (n1, 1)` and then the *b* vector becomes `(n1,m)` thanks to Python broadcasting.

![vectorised dimensions](assets/vectorised-dimensions.png)

## Why deep representations?

[Video #4](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/rz9xJ/why-deep-representations) provides some intuition as to why deep nets are better than shallow nets for some problems.

Going from left to right through the hidden layers, the left layer would detect small features like vertical or horizontal lines. The next layer might combine these lines and use them as building blocks for detecting larger features, like an eye or a nose. The next layer goes further by combining eyes and noses into faces.

(as an aside, this is where Capsule Networks make networks better in the sense that an eye a nose in a certain configuration can vote about what the surrounding face is, whereas currently a neural net would still classify a face as a face if you swap a face's nose and mouth, for instance.)

![building blocks](assets/building-blocks.png)

Ng also mentions a result from circuit theory, but he doesn't find the result very useful for intuiting about the usefulness of deep VS shallow nets, so I won't note it here.

## Building blocks of deep neural networks

[Video #5](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/uGCun/building-blocks-of-deep-neural-networks) shows the building blocks, which is basically the single layer stuff from the previous week, but extrapolated out over l1, l2, ..., ln.

![forward and backward functions](assets/forward-and-backward-functions.png)

## Forward and backward propagation

[Video #6](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/znwiG/forward-and-backward-propagation) discusses implementing the steps from the previous videos.

Again, it's the formulas from the previous week, but extrapolated over layers l1, l2, ..., ln. (the un-avoidable for-loop)

### Forward

![forward](assets/forward.png)

### Backward

![backward](assets/backward.png)

### Summary

As *X* is the input for forward, what is the input for backward? This would be the derivative of the loss, `L(yhat, y)`, which can be shown to be `dal = -y/a + (1-y)/(1-a)` but for the vectorised version `dAl`.

![combined](assets/combined.png)

## Parameters VS Hyperparameters

[Video #7](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/TBvb5/parameters-vs-hyperparameters) says that parameters are *W* and *b*. Hyperparameters are learning rate, iterations, number of hiden layers, number of hidden units per layer. choice of activation function, etc.

Later: momentum term, minibatch size, regularisation parameters, etc.

Applied deep learning is a very empirical process.

It's difficult to know the best configuration in advance, so iterate a lot. You can build a sense of hyperparameters across applications. 

Also, what works today might not apply to tomorrow. E.g. GPUs change, inputs change.

Active area of research.

## What does this have to do with the brain?

[Video #8](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/obJnR/what-does-this-have-to-do-with-the-brain) says the answer is "not a whole lot". Shows an analogy between a single logistical unit and a biological neuron.

# Things to look forward to

In the [next course](https://www.coursera.org/learn/deep-neural-network)

- Tuning hyper-parameters, and iterating models
- Regularisation
- Early stopping, and optimisation

During the exams, when training models some models had worse results when too many iterations were used. Lower iterations gives better accuracy on the test set. This is called "early stopping". Early stopping is a way to prevent overfitting. 

And... we'll be learning [Tensorflow](https://www.tensorflow.org/).
Being a dual-Clojure/Python dev, I've actually spent most of my time with [Cortex](https://github.com/thinktopic/cortex), so I'm excited to expand my toolbox.

References in exam:

http://stackoverflow.com/questions/1907993/autoreload-of-modules-in-ipython

And that [wraps up](https://coursera.org/verify/BBJ5HZJJ7QZS) the first course.

