#!/bin/bash
if [ "$#" -ne 1 ]
then
echo "Wprowadz tylko 1 parametr ktory bedzie sciezka do katalogu"
else
echo "Sciezka w ktorej zostana polaczone pliki to: $1"
echo "Podaj nazwe pliku koncowego:"
read NAZWA_PLIKU
echo "Nazwa pliku koncowego to: $NAZWA_PLIKU"
echo "Plik powstal z polaczenia plikow: `ls $1 | grep .txt`" >> $NAZWA_PLIKU
i=0
for npliku in `ls $1 | grep .txt`
do
i=$(($i+1))
more $npliku >> $NAZWA_PLIKU
done
fi
