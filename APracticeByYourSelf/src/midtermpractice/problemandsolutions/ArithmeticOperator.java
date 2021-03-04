package midterm.problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = input.nextInt();

        System.out.println("Enter the second number ");
        int b = input.nextInt();

        int resultAdd= a+b;
        System.out.println("Addition of two number is " + resultAdd);

        int resultSub = a-b;
        System.out.println("Subtraction of two number is "+resultSub);

        int resultMulti = a*b;
        System.out.println("Multiplication of two number is "+resultMulti);

        int resultDiv = a/b;
        System.out.println("Division of two number is "+resultDiv);

    }

}



