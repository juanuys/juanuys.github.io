#!/usr/bin/env bash

thumbs=assets/doodles/thumbs
for photo in $(find $thumbs -type f -name \*.jpeg); do
    convert $photo -set colorspace Gray -separate -average -resize 200x200 -quality 50% ${photo}.bak
    mv ${photo}.bak $photo
done
