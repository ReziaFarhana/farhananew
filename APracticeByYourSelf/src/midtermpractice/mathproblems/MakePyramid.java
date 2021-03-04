package midterm.mathproblems;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter preferred number of stars");
        int numberOfStars = input.nextInt();//10

        for (int i = 0; i <= numberOfStars; i++) {

            for (int j = 0; j <numberOfStars-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
            input.close();

        }
    }

}

