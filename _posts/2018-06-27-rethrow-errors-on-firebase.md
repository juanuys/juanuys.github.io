---
layout: post
title: "Re-throw errors on Firebase"
description: "Re-throw errors on Firebase if you're not going to recover from them"
tags: [tech,firebase,nodejs]
category: blog
---

*TL;DR* jump to the [conclusion](#conclusion).

Behold 3 Firebase triggers.

The main differences are:

- `deletemeSwallow` does not re-throw the error in the `catch` block, i.e. it "swallows" the error
- `deletemeRethrow` re-throws the error in the `catch` block
- `deletemeNoCatch` has no catch block, so any errors will propagate up the call-stack naturally

```
exports.deletemeSwallow = functions.pubsub.topic('deleteme').onPublish((payload) => {
  return new Promise(resolve => {
    console.log('I am deletemeSwallow')
    if (Buffer.from(payload.data, 'base64').toString() === 'fail') {
      throw new Error('You want me to fail')
    }
    resolve(payload)
  }).then(payload => {
    return console.log('superfluous then block', payload)
  }).catch(err => {
    console.error('I am just going to swallow the error', err)
    // throw err   <-- Gulp!
  })
})

exports.deletemeRethrow = functions.pubsub.topic('deleteme').onPublish((payload) => {
  return new Promise(resolve => {
    console.log('I am deletemeRethrow')
    if (Buffer.from(payload.data, 'base64').toString() === 'fail') {
      throw new Error('You want me to fail')
    }
    resolve(payload)
  }).then(payload => {
    return console.log('superfluous then block', payload)
  }).catch(err => {
    console.error('I am going to rethrow the error', err)
    throw err
  })
})

exports.deletemeNoCatch = functions.pubsub.topic('deleteme').onPublish((payload) => {
  return new Promise(resolve => {
    console.log('I am deletemeNoCatch')
    if (Buffer.from(payload.data, 'base64').toString() === 'fail') {
      throw new Error('You want me to fail')
    }
    resolve(payload)
  }).then(payload => {
    return console.log('superfluous then block', payload)
  })
})
```

# Happy path

```
gcloud pubsub topics publish deleteme --message "as you were, soldier"
```

Given a happy path, this is what we see in the logs - all functions exit with `'OK'`.

[![success](/assets/posts/2018-06-27-rethrow-errors-on-firebase/success.png)](/assets/posts/2018-06-27-rethrow-errors-on-firebase/success.png)

# Forced failure

```
gcloud pubsub topics publish deleteme --message "fail"
```

Given a forced failure, this is what we see in the logs:

- `deletemeNocatch` exited with `'error'`, which is correct considering the error propagated up the call-stack unhindered
- `deletemeRethrow` exited with `'error'`, which is correct considering the error was re-thrown as we're not recovering from it in the `catch` block
- `deletemeSwallow` **incorrectly exited with** `'OK'` because clearly the `catch` block does not recover from the error - it just *swallows* the error.

[![forced failure](/assets/posts/2018-06-27-rethrow-errors-on-firebase/failure.png)](/assets/posts/2018-06-27-rethrow-errors-on-firebase/failure.png)

# Conclusion

If an error happens in your Firebase trigger business logic, and you `catch` at any point in your Promise chain, you must either recover from the error, or re-throw the error so that Firebase can exit with the error status.

This will help your frontend clients get the correct signals and take the user down the appropriate recovery paths.