package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StateName {

    public static void main(String[] args) {
        List<String> StateNameList=new ArrayList<>();
        //Alternative Approach
        List<String> StateNameList1=new LinkedList<>();
        StateNameList.add("NY");
        StateNameList.add("NJ");
        StateNameList.add("CO");

        for(String st:StateNameList){
            System.out.println("State name is " + st);


        }

    }
}
