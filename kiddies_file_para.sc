#!/bin/bash

echo "Nazwa skryptu: $0"
echo "Liczba parametrow: $#"
echo "Zestawienie wszystkich parametrow: $*"
echo "Ponumerowane parametry:"
i=1
for arg in $@
do
echo $i $arg
i=$(($i+1))
done

