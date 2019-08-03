# WordAnagram

## How to test?
1. git clone `https://github.com/OliviaZhangy/WordAnagram.git` 
2. Under the folder of code, first `chmod u+x runme.sh` to make it executable, then run `runme.sh` in Terminal.
3. Follow the instruction to enter the path of the dictionary (e.g. test.txt)
4. Enter the string to find its anagrams (case insensitive e.g. sue)
5. Press `Ctrl-C` to exit

## Description of code files
### AnagramDic Class
- Words in the dictionary file is read word by word.
- Construct a map to store the whole dictionary.
- For each word,it first convert all upper case word to lower case, then sorted as alphabetical order. 
- Each sorted word is the key of the map, and the initial word from file is store as a value of this sorted word. 
- Word anagrams are the same after sorting, they were store corresponding to the same key, and they form an arrayList as the value.

### Main Class
- To start the the AnagramDic class and test file.

