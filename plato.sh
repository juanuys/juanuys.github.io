#!/usr/bin/env bash

for POST in $(ls _posts) ; do
	FOLDER=$(echo $POST | awk '{split($0,a,"-"); print "../exploded/" a[1] "/" a[2] "/" a[3]}')
       	mkdir -p $FOLDER
       	BARE=$(echo $POST | sed  -e 's/....-..-..-\(.*\)/\1/')
       	cp _posts/$POST $FOLDER/$BARE 
done
