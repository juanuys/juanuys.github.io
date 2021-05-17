#!/usr/bin/env bash

for post in $(find _posts -type f); do
	if [[ "$(head -n1 $post)" == "---" ]] ; then
		echo "YES frontmatter: $post"
	else
		echo "NO  frontmatter: $post"
		sed -i '' '1i\
---\
' $post
	fi
done
