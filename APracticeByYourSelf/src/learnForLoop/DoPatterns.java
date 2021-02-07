package learnForLoop;

import java.util.Scanner;

public class DoPatterns {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many stars would you like?");
        int numOfStars = input.nextInt();
        for (int i = 0; i <= numOfStars; i++) {//column
            for (int k = 0; k <= numOfStars - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
        for (int i = numOfStars-1; i >= 0; i--) {
            for (int k = 0; k <= numOfStars - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}

