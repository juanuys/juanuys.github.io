#!/bin/bash

set -ex

TEMPLATE=$1

DATE=$(date +"%Y-%m-%d")
TIME=$(date +"%T")

read -p "Enter the title:" TITLE
TITLE=${TITLE:-The good, the bad, and the ugly.}

KEBAB=$(echo $TITLE | tr -cd '[:alnum:][:space:]' | tr [:upper:] [:lower:] | tr [:space:] '-')

NEW=_posts/${DATE}-${KEBAB%?}.md
cp $TEMPLATE $NEW

read -p "Week number:" WEEK
WEEK=${WEEK:-99}

read -p "A space-delimited list of tags:" TAGS
TAGS=${TAGS:-life}


# TODO clean up
if ! command -v gsed &> /dev/null
then
	sed -i  "s/%TITLE%/$TITLE/" $NEW
	sed -i  "s/%DESCRIPTION%/$TITLE/" $NEW
	sed -i  "s/%TAGS%/$TAGS/" $NEW
	sed -i  "s/%WEEK%/$WEEK/" $NEW
else
	gsed -i  "s/%TITLE%/$TITLE/" $NEW
	gsed -i  "s/%DESCRIPTION%/$TITLE/" $NEW
	gsed -i  "s/%TAGS%/$TAGS/" $NEW
	gsed -i  "s/%WEEK%/$WEEK/" $NEW
fi


echo "New post ready for edits at $NEW"

mkdir -p assets/posts/${DATE}-${KEBAB%?}