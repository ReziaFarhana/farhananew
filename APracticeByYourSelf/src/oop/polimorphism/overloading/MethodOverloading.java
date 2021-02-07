package oop.polimorphism.overloading;

public class MethodOverloading {


    public static void doSum(int x, int y){
        int total = x+y;
        System.out.println("The total is : " + total);
    }


    public static void doSum(int x, int y, int z, int m){
        int total =x+y+z+m;
        System.out.println("The total is : " + total);
    }

    public static void stId(String name, String address, int stId, double fees){
        System.out.println("Student Name is : " + name + "," + " Address: " + address + ","+ " Student Id: " + stId +
                        "," +
                " Admission fees is " + fees);
    }

}
