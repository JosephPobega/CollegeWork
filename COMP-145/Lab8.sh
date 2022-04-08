#!/bin/bash
#validate a backup directory or create it
backup="$HOME/bkup"



if  [ !  -d "$HOME/bkup" ] ; then
	mkdir "$HOME/bkup"
	mkdir "$backup"
fi

while [ $# -ne 0 ] ; do

	if [ -e $1 ] ; then
	cp $1 $backup		
	echo "[INFO] File: $1 found"

	else
		echo "[ERROR] File: $1 not found"
	fi
	shift

done


echo "------ RESULTS ------"
cat Lab8.log
echo "------ BACKUP CONTENTS ------"
ls -al  $backup
