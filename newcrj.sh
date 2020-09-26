#!/bin/bash

set -ex

DATE=$(date +"%Y-%m-%d")
TIME=$(date +"%T")

read -p "Enter the title:" TITLE
TITLE=${TITLE:-The good, the bad, and the ugly.}

KEBAB=$(echo $TITLE | tr -cd '[:alnum:][:space:]' | tr [:upper:] [:lower:] | tr [:space:] '-')

NEW=_posts/${DATE}-${KEBAB%?}.md
cp _drafts/template-crj.md $NEW

read -p "A space-delimited list of tags:" TAGS
TAGS=${TAGS:-life}

gsed -i  "s/%TITLE%/$TITLE/" $NEW
gsed -i  "s/%DESCRIPTION%/$TITLE/" $NEW
gsed -i  "s/%TAGS%/$TAGS/" $NEW

echo "New post ready for edits at $NEW"
