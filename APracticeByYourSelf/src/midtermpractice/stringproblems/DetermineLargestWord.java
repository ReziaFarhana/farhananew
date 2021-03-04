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
        //implement
        System.out.println(findTheLargestWord(s));

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        int stLength = 0;
        String [] strings = wordGiven.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > st.length()) {
                st = strings[i];
                stLength = strings[i].length();
            }
        }
        map.put(stLength, st);
        printHashMap(map);
        return map;
    }

    public static void printHashMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}