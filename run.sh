#!/usr/bin/env bash

ARG=${1:-inc}

if [ "$ARG" == "inc" ]; then
	INC="--incremental"
else
	INC=""
fi

echo $INC

# first step
false && docker run --rm --name juanuys-com -p 4000:4000 --volume="$PWD:/srv/jekyll" -it jekyll/jekyll:3 jekyll serve

# step 2, in another terminal (with the above container running) run this command to get it back:
false && docker commit juanuys-com juanuys-com-jekyll

# step 3, run
true && docker run --rm --name juanuys-com -p 4000:4000 --volume="$PWD:/srv/jekyll" -it juanuys-com-jekyll jekyll serve $INC

# Why? The hub image installs gems on each run, and the new image has them all (and starts up quicker)

