#!/usr/bin/env bash

for post in $(find plato -type f|egrep -v assets); do
	assets=$(dirname $post)/assets
	newpost=$(echo $post | sed -n 's#plato/\([[:digit:]]\{4\}\)/\([[:digit:]]\{2\}\)/\([[:digit:]]\{2\}\)/\(.*\).md#\1-\2-\3-\4#p')
	
	cp $post _posts/$newpost.md
	mkdir -p assets/posts/$newpost
	cp $assets/* assets/posts/$newpost
done
