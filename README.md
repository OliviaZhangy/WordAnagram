# WordAnagram
Word Anagram

1.How to test?
(1)git clone it 
(2)bash runme.sh
(3)follow the instruction to enter the path of the dictionary (e.g. test.txt)
(4)enter the string to find its anagrams (case insensitive)
(5)press Ctrl-C to exit

2.Description of code files
(1) AnagramDic Class
Words in the dictionary file is read word by word.
Construct a map to store the whole dictionary
For each word,it first convert all upper case word to lower case. Then sorted as alphabetical order. Each sorted word is the key of the map, and the initial word from file is store as a value of this sorted word. Word anagrams are the same after sorting, they were store corresponding to the same key, and they form an arrayList as the value.

(2) Main Class
to run the AnagramDic class and test the file

