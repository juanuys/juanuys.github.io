#!/usr/bin/env bash

for img in $(find assets/posts -type f) ; do
	mdname=$(echo $img | cut -d'/' -f3)
	imgname=$(echo $img | cut -d'/' -f4)

	#grep $imgname _posts/$mdname.md
	perl -pi -e 's#assets/'$imgname'#/assets/posts/'$mdname'/'$imgname'#g' _posts/$mdname.md
done
