#!/usr/bin/env bash

thumbs=assets/photograms/thumbs
for photo in $(find _photograms -type f -name \*.jpg); do
    base=$(basename $photo)
    thumbnail=$thumbs/$base
    mdfile="${photo%.*}".md
    convert $photo -set colorspace Gray -separate -average -resize 200x200 -quality 50% $thumbnail

    sed -i '' '2i\
thumbnail: '/$thumbnail'\
' $mdfile

done
