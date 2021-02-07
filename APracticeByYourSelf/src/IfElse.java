import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age>=13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are not an adult");
        }


    }
}

