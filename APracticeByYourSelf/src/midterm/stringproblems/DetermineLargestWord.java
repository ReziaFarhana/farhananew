package stringproblems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        int longest=0;
        //iterate through words
        for (Integer l : wordNLength.keySet()){
            if(l>longest);
            longest=l;
            System.out.println(longest + " " + wordNLength.get(l));
        }
            }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        for (String s: wordGiven.split(" ")){
            map.put(s.length(),s);
        }
        return map;
    }
}
