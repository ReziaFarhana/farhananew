package datastructureandalgorithm;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMapTravers {
    //for operation like add, remove, containKey, time complexity is 0.

    public static void main(String[] args) {

        int[] numbers = {23, 45, 66, 45, 78, 34, 201, 88, 66, 34, 7, 9, 3, 603, 7, 301, 7, 8, 7};
        //print the frequency of each number
        LearnHashMapTravers.printFrequency(numbers);
    }

        public static void printFrequency(int[] num){
            HashMap<Integer, Integer>hMap = new HashMap<>();

            for (int i=0; i<num.length; i++){

                Integer count = hMap.get(num[i]);

                if(hMap.get(num[i])==null){
                    hMap.put(num[i], 1);
                } else {hMap.put(num[i], ++count);

                }
                for (Map.Entry mp: hMap.entrySet()){
                    System.out.println("Frequency of " + mp.getKey() + " : " + mp.getValue());
                }

            }
        }
    }


