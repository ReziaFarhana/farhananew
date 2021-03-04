package mathproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        List<Integer> fibs = new ArrayList<>();
        fibs = Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,3524578,5702887,9227465,14930352,24157817,39088169,63245986,102334155);


        first40FibonacciNumbers();

    }

    public static List<Integer> first40FibonacciNumbers() {
        List<Integer> fibNums = new ArrayList<>();
        int num1 = 0;
        int num2 = 1;
        fibNums.add(num1);
        fibNums.add(num2);
        for (int i = 0; i <= 38; i ++) {
            int num3 = num1 + num2;
            fibNums.add(num3);
            num1 = num2;
            num2 = num3;
        }

        for (int num: fibNums) {
            System.out.print(num + " ");
        }
        return fibNums;
    }




}