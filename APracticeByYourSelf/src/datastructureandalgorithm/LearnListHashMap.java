package datastructureandalgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {
    public static void main(String[] args) {

        List<String>stateNameOfUSA=new ArrayList<>();
        stateNameOfUSA.add("NY");
        stateNameOfUSA.add("NJ");
        stateNameOfUSA.add("Tx");
        stateNameOfUSA.add("CO");
        stateNameOfUSA.add("PN");

        List<String> stateOfCANADA=new ArrayList<>();
        stateOfCANADA.add("Toranto");
        stateOfCANADA.add("ONTARIO");
        stateOfCANADA.add("BC");


        List<String> StateOfBANGLADESH=new ArrayList<>();

        StateOfBANGLADESH.add("Dhaka");
        StateOfBANGLADESH.add("Khulna");
        StateOfBANGLADESH.add("Sylhet");

        //2.Map
        Map<String, List<String>>stMap=new HashMap<>();
        stMap.put("USA", stateNameOfUSA);
        stMap.put("CANADA", stateOfCANADA);
        stMap.put("Bangladesh", StateOfBANGLADESH);
        for(Map.Entry<String, List<String>> entry:stMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }





    }
}
