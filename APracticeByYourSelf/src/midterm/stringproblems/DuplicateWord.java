package stringproblems;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        DuplicateWord.findDuplicateWords(st);

    }

        public static void findDuplicateWords(String inputString) {
        //split the words
        String words[] = inputString.split(" ");

        //create hashmap
        Map<String, Integer> wordCount = new HashMap<>();

        //to iterate through words
        for (String word : words) {

            //if word is present:
            if (wordCount.containsKey(word)) {
                wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);//convert to lowercase, get the word,+1 to go to next word
            } else {
                wordCount.put(word, 1);
            }
        }

        //extracting all the keys of map - wordCount
        Set<String> wordsInString = wordCount.keySet();

        //loop through  all words in wordCount
        for (String word : wordsInString) {
            if (wordCount.get(word) > 1) {
                System.out.println("Duplicate word: " +" '"+ word + "' " + " and it repeats " + wordCount.get((word)) + " " + "times");
                System.out.println("The average length of "+ " '"+ word +"' "+ " : " + word.length());
            }
        }
    }
}


