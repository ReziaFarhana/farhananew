package mathproblems;


public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        int numToFactorial = 5;

        System.out.println("Find factorial of 5:");
        System.out.println();

        System.out.println("Using recursion:");
        System.out.println(calculateFactorial(numToFactorial));

        System.out.println("Using iteration:");
        System.out.println(calculateFactorialLoop(numToFactorial));

    }

    public static int calculateFactorial(int num) {
        if (num != 0) {
            return num * calculateFactorial(num -1);
        } else {
            return 1;
        }
    }

    public static int calculateFactorialLoop(int num) {
        int total = 1;
        while (num > 0) {
            total *= num;
            num--;
        }
        return total;
    }

}