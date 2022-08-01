#!/bin/bash

echo "Parametr 1 jest traktowany jako sciezka do danego katalogu!"
echo "Parametr 1 to: $1"

echo " `date +%b.%d.%Y.h:%H:%M` -- `find $1 -type f -print | wc -l` plikow oraz `find $1 -type d -print | wc -l` katalogow w katalogu $1 " >> zad7.txt

