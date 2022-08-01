#!/bin/bash

echo "Usuniete pliki:" >> delete.txt
echo " `find $1 -type f -empty` " >> delete.txt

for i in `find $1 -type f -empty`
do
rm $i
done
