---
title: "Using Kali GUI apps on Mac via Docker"
description: "Let's get the slow thing out of the way first..."
layout: post
tags: plato-long security kali tech
category: blog
---

Let's get the slow thing out of the way first. In a terminal:

    docker pull kalilinux/kali-linux-docker

Next, install [XQuartz](https://www.xquartz.org/) (version 2.7.11 at the time of writing).


Log out and back in, otherwise running `xhost` will complain with `xhost:  unable to open display ""`.

In a terminal:

```
ip=$(ifconfig en0 | grep inet | awk '$1=="inet" {print $2}')
xhost + $ip
mkdir -p pentesthome
docker run -ti --name pentest -e DISPLAY=$ip:0 -v /tmp/.X11-unix:/tmp/.X11-unix -v $(pwd)/pentesthome:/root  kalilinux/kali-linux-docker /bin/bash
```

In Kali:

```
apt-get update
apt-get install -y zaproxy
zaproxy
```

Et voilà:

![GUI FTW](/assets/posts/2017-05-11-using-kali-gui-apps-on-mac-via-docker/kali-docker-mac-gui.png)
