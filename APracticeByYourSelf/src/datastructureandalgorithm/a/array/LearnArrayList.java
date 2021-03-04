package array;

import java.util.ArrayList;

public class LearnArrayList {

   ArrayList<String> carName=new ArrayList<String>();//generic String type

    public static ArrayList<Integer> carYear= new ArrayList<>();//generic Int type

    public static void main(String[] args) {

        LearnArrayList al=new LearnArrayList();//create object
        al.carName.add("Tesla");
        al.carName.add("BMW");
        al.carName.add("Toyota");
        al.carName.add("Nissan");//add value
        al.carName.remove("Camry");//remove value

        System.out.println(al.carName.get(1));//to print we use .get() method

        System.out.println(al.carName.size());//to know total index no we use .size() method
        //to rtrieve all values we use for each loop, as we values ae stored in index wise
        for(String st:al.carName){
            System.out.println("Car Name is " + st);

            //Add.all means merge two object values
            //generic: Assign data type in a ArrayList
            ArrayList al6=new ArrayList();//create an object of ArrayList
            ArrayList<String> al7= new ArrayList<>();//create new object with generic

            System.out.println("*****************Add all********** ");
            al7.add("Tesla");//add values
            al7.add("Black");
            al7.add("T32");
            ArrayList<String> al8= new ArrayList<>();
            al8.add("Tesla");
            al8.add("Year 2022");
            al8.add("Auto Drive");
            al7.addAll(al8);
            for (int i=0; i<al7.size(); i++ ){
                System.out.println(al7.get(i));
            }
            System.out.println("**************retain all***********");
            //retain all: common values will print
            al7.retainAll(al8);
            for(int i=0; i<al7.size(); i++){
                System.out.println(al7.get(i));
            }
        }



    }


    }