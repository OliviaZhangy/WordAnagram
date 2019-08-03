#!/bin/bash
clear
javac src/AnagramDic.java src/Main.java

# shellcheck disable=SC2164
cd src

echo -n "Please enter the path of the dictionary (for example: test.txt): "
read num1

while true
do
echo -n "Please input a string: "
read num
java Main "$num" "$num1"
done

exit 0