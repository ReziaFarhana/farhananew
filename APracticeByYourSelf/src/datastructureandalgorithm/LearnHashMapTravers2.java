package datastructureandalgorithm;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMapTravers2 {

    //23, 45, 66, 45, 78, 34, 201, 88, 66, 34, 7, 9, 3, 603, 7, 301, 7, 8, 7
    //print the frequency of each number

    public static void main(String[] args) {
        int [] numbers={23, 145, 166, 145, 178, 134, 201, 88, 166, 134, 17, 19, 13, 603, 17, 301, 17, 18, 17};
        LearnHashMapTravers2.printFrequency(numbers);

    }
    public static void printFrequency(int[] num){

       HashMap<Integer, Integer> hmap =new HashMap<>();
       for(int i=0; i<num.length; i++ ){
           Integer count=hmap.get(num[i]);//variable create and initiate

           if (hmap.get(num[i])==null){
               hmap.put(num[i], 1);
           } else {hmap.put(num[i], ++count);

           }
           for (Map.Entry mp: hmap.entrySet()){
               System.out.println("Frequency  of " + mp.getKey() + " : " + mp.getValue());
           }


       }

    }


}
