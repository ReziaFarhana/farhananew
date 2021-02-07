package array;

import java.util.ArrayList;

public class LearnArrayList {

   ArrayList<String> carName=new ArrayList<String>();

    public static ArrayList<Integer> carYear= new ArrayList<>();




    public static void main(String[] args) {

        LearnArrayList al=new LearnArrayList();
        al.carName.add("Tesla");
        al.carName.add("BMW");
        al.carName.add("Toyota");
        al.carName.add("Nissan");
        al.carName.remove("Camry");

        System.out.println(al.carName.get(1));

        System.out.println(al.carName.size());
        for(String st:al.carName){
            System.out.println("Car Name is " + st);
        }



    }


    }