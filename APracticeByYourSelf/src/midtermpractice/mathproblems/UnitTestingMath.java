package mathproblems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
    }

    @Test
    public void testCalculateFactorial () {
        int numToFactorial = 5;
        int expectedResult = 120;
        int actualResult = Factorial.calculateFactorial(5);
        Assert.assertEquals("Test fail", expectedResult, actualResult);
    }

    @Test
    public void testFirst40FibonacciNumbers () {
        List<Integer> expectedResult = new ArrayList<>();
        List<Integer> actualResult = new ArrayList<>();
        expectedResult = Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,3524578,5702887,9227465,14930352,24157817,39088169,63245986,102334155);
        actualResult = Fibonacci.first40FibonacciNumbers();
        Assert.assertEquals("Test fail", expectedResult, actualResult);
    }

    @Test
    public void testLowestDifference () {
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int expectedResult = 1;
        int actualResult = FindLowestDifference.findLowestDifference(array1, array2);
        Assert.assertEquals("Test fail", expectedResult, actualResult);
    }

    @Test
    public void testFindMissingNum () {
        int [] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int expectedResult = 9;
        int actualResult = FindMissingNumber.findMissingNum(array);
        Assert.assertEquals("Test fail", expectedResult, actualResult);
    }

    @Test
    public void testLowestNumber () {
        int [] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int expectedResult = 1;
        int actualResult = LowestNumber.lowestNumber(array);
        Assert.assertEquals("Test fail", expectedResult, actualResult);
    }

    @Test
    public void testMakePyramid () {
        String expectedResult = "      *\n     * *\n    * * *\n   * * * *\n  * * * * *\n * * * * * *\n";
        String actualResult = MakePyramid.makePyramid();
        Assert.assertEquals("Test fail", expectedResult, actualResult);
    }

    @Test
    public void testMergeArrays2 () {
        int [] array1 = {1,3,4};
        int [] array2 = {4,5,6,7,8};
        int [] expectedResult = {1,3,4,5,6,7,8};
        int [] actualResult = MergeTwoArraysAndRemoveDuplicatesProgram.mergeArrays2(array1, array2);
        Assert.assertArrayEquals("Test fail", expectedResult, actualResult);
    }

    @Test
    public void testIsPrime () {
        int num = 13;
        boolean expectedResult = true;
        boolean actualResult = PrimeNumber.isPrime(num);
        Assert.assertEquals("Test fail", expectedResult, actualResult);
    }


}