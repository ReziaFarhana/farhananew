package array;

import java.util.Scanner;

public class LearnArray {
    /*
    Array-which can hold multiple value of same data type
    Array in Java is index-based, the first element of the array is stored at the 0th index,
    2nd element is stored on 1st index and so on.
    Syntax-DataType variableName []= new DataType [numberOfVariable];
    */

    //declare variable
    String studentName;
    String studentName1 = "Nashwan";

    String addresses;
    // Declare variable and assign value

    String StudentName = "Farhana";
    //Array declare & assign value:
    // if we declare an array in class level we have to mention it if its static or not
    static String[] students = new String[10];//static

    String[] stAddresses = new String[10];//non static

    int[] stId = {501, 503, 505, 606, 707, 808, 909};//dynamic

    public static void main(String[] args) {
        //static String students []=new String [8]; for static
        LearnArray.students[0] = "Farhana";
        LearnArray.students[1] = "Easha";
        LearnArray.students[2] = "Kawsar";
        LearnArray.students[3] = "Tanvir";
        LearnArray.students[4] = "Tashmi";
        LearnArray.students[5] = "Mamun";

        System.out.println("Student's name is " + LearnArray.students[3]);
        for (int i = 0; i < LearnArray.students.length; i++) {
            System.out.println("Students of team are " + LearnArray.students[i]);
        }

        System.out.println("*******************Try & catch ********");
        //System.out.println("Student's name is "+ LearnArray.students[10]);


        try {
            String students[] = new String[8];
            System.out.println("Student's name is " + LearnArray.students[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index 10 out of bounds for length 8");
        }
        System.out.println("**********NON Static Array*************");
        //String [] stAddresses = new String[10];//non static
        LearnArray la = new LearnArray();//object  creation
        la.stAddresses[0] = "NY";
        la.stAddresses[1] = "NJ";
        la.stAddresses[2] = "CL";
        la.stAddresses[3] = "CO";
        la.stAddresses[4] = "Tx";
        la.stAddresses[5] = "KK";
        System.out.println(la.stAddresses[4]);
        System.out.println("***********Try & Catch Non static **********");

        try {
            String[] stAddresses = new String[10];
            System.out.println(la.stAddresses[14]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index 14 out of bounds for length 10");
        }

        //to see all student's name use for loop

        //for (String i = 0; i < LearnArray.students; students++) {
        //  System.out.println("Student's names are " + LearnArray.students[i]);//


        //Integer type Array:
        int numbers[] = new int[5];
        numbers[0] = 101;
        numbers[1] = 202;
        numbers[2] = 303;
        numbers[3] = 404;
        numbers[4] = 505;

        System.out.println("The number is " + numbers[1]);
        try {
            numbers = new int[5];
            System.out.println("The number is " + numbers[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index 6 out of bounds for length 5");
        }
        System.out.println("************For each loop********");
        // For Each loop:
        //for(DataType variableName : ArrayName){}
        for (String st : la.stAddresses) {
            System.out.println("Student's address are " + st);
        }

        System.out.println("*************Double********");

        double[] rent = new double[5];
        rent[0] = 1500.5;
        rent[1] = 1230.5;
        rent[2] = 1555.5;
        rent[3] = 1850.5;
        System.out.println("House rent is " + rent[3]);

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your rent");

        double rnt = input1.nextDouble();

        //For Each loop:
        //for(DataType variableName : ArrayName){}


        for (double r = 0; r < rent.length; r++) {
            System.out.println("rent is " + rent[(int) r]); // for double we need casting to int
        }
    }
}

        /*try { rent= new double[5];
            System.out.println("House rent is "+ rent[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index 6 out of bounds for length 5");
        }

        System.out.println("The number is " + numbers[6]);
        //scanner
       Scanner input= new Scanner(System.in);
        System.out.println("Enter your number : ");
        int j =input.nextInt();

        for (int k = 0; k < numbers.length; k++)
            System.out.println("Numbers are " + numbers[k]);



        System.out.println("************Array declare & Assign **********");
        double salary [] = {5011.3, 4044.5, 3055.5, 8099.9};
        System.out.println(salary [2]);

        for(double sa:salary){
            System.out.println("Salary is :"+ sa);*/
