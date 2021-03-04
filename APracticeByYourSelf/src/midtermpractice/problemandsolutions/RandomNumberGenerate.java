package midterm.problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.

    public static void main(String[] args) {

    int upperbound= 8;
    int max=8;
    int min=1;

    Random random = new Random();
    int intRandom=random.nextInt(upperbound);
    System.out.println("Random number is : "+ intRandom);

    }
}
