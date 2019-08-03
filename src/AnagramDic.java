import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AnagramDic {

    // initialize a map which each key the sorted word and corresponding value
    // containing anagrams in dictionary
    private Map<String, ArrayList<String>> dictionary = new HashMap<>();


    /**
     * Create an anagram dictionary from the list of words given in the file
     * indicated by fileName. PRE: The strings in the file are unique.
     *
     * @param fileName
     *            the name of the file to read from
     * @throws FileNotFoundException
     *             if the file is not found
     */
    public AnagramDic(String fileName) throws FileNotFoundException {
        File inFile = new File(fileName);
        Scanner input = new Scanner(inFile);

        // process each word in the dictionary
        while (input.hasNext()) {
            String inElement = input.next();
            // sort word in alphabetical order
            String sortElement = sortElement(inElement);
            ArrayList<String> elemArrList = new ArrayList<>();
            // if the sorted word is not in the key set
            if (!dictionary.containsKey(sortElement)) {
                elemArrList.add(inElement);

            } else {
                elemArrList = dictionary.get(sortElement);
                elemArrList.add(inElement);
            }
            dictionary.put(sortElement, elemArrList);
        }
    }

    /**
     * Sort the string in alphabetical order.
     *
     * @param element
     *            the string which will be sorted
     * @return a string in alphabetical order
     */
   private static String sortElement(String element) {
        char[] arrElement = element.toCharArray();
        for(int i=0;i<arrElement.length;i++){
            //change all upper case to lower case
            if(arrElement[i]>='A'&& arrElement[i]<='Z'){
                arrElement[i] = (char)(arrElement[i]-'A'+'a');
            }
        }
        Arrays.sort(arrElement);
        return new String(arrElement);
    }

    /**
     * Get the map dictionary
     *
     * @return the map which key is sorted word and value containing corresponding
     *         anagrams in dictionary
     */
    public Map<String, ArrayList<String>> getDictionary() {
        return dictionary;
    }

    /**
     *
     * @param s
     *            string to process
     * @return a list of the anagrams of s
     *
     */
    public ArrayList<String> getAnagramsOf(String s) {
        return dictionary.get(sortElement(s));
    }
}
