package learnExceptionHandling;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnTryCatch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       try {

           System.out.println("Enter a whole number for divide : ");

           int x = input.nextInt();
           System.out.println("Enter a whole number to divide by : ");

           int y = input.nextInt();
           int z = x / y;
           System.out.println("The result is :" + z);
       } catch (ArithmeticException e){
           System.out.println("It's an ArithmeticException. You can't divide by zero. Try again.");
       } catch (InputMismatchException e){
           System.out.println("It's an InputMismatchException. Try with appropriate one");
       } catch (Exception e){
           System.out.println("Something went wrong");
       }
       finally {
           input.close();
       }
    }


    }

