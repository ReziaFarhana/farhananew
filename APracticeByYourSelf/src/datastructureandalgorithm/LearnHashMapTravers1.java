package datastructureandalgorithm;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMapTravers1 {
    public static void main(String[] args) {

    int[] numbers = {23, 45, 166, 245, 378, 834, 201, 88, 166, 834, 7, 9, 3, 603, 7, 301, 7, 8, 7};
    //print the frequency of each number
    LearnHashMapTravers.printFrequency(numbers);
    }
    public static void printFrequencyNumbers(int [] num){
        //creating a parameterized method integer data type and value comes from array


        //Create object of the method and mention key & values dataType
            HashMap<Integer, Integer> hmap= new HashMap<>();

            for (int i=0; i<num.length; i++){
                Integer count=hmap.get(num[i]);

                if(hmap.get(num[i])==null) {
                    hmap.put(num[i], 1);
                }else{hmap.put(num[i], ++count);
                }
                for (Map.Entry mp:hmap.entrySet()){
                    System.out.println("Frequency of " + mp.getKey() + " : " + mp.getValue());
                }
            }
    }

}
