---
title: "Add logging to PostgresQL on Docker"
description: "A quick way to see what's going in and out of the database during development"
date: 2015-06-17
layout: post
tags: postgresql docker
category: blog
---


Normally, in ```docker-compose.yml```  I would just configure a database like this:

    db:
      image: postgres:9.4

However, to customise the image, we use our own Dockerfile:

    FROM postgres:9.4
    ADD config.sh /docker-entrypoint-initdb.d/

The contents of ```config.sh```:

    perl -pi -e "s/#log_statement = 'none'/log_statement = 'all'/g" \
    /var/lib/postgresql/data/postgresql.conf

And ```docker-compose.yml``` now becomes:

    db:
      build: location/of/new/docker/file

Link your app, launch the stack, and start seeing log statements on STDIN:

    db_1         | LOG:  statement: BEGIN
    db_1         | LOG:  statement: SELECT etc etc
