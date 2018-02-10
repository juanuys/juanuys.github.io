#!/usr/bin/env bash

for post in $(find _posts -type f); do
	thedate=$(echo $post | sed -n 's#_posts/\([[:digit:]]\{4\}\)-\([[:digit:]]\{2\}\)-\([[:digit:]]\{2\}\)-.*#\1-\2-\3#p')
	sed -i '' '4i\
date: '$thedate'\
' $post
done
