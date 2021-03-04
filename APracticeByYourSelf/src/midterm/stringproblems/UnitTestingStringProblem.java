package stringproblems;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

    }


    @Test
    public void testCheckPermutation(){

    }

    @Test
    public void isAnagramTest(){
        String word = "CAT";
        String word2 = "ACT";
        boolean expectedResult = true;
        boolean actualResult = Anagram.isAnagram(word, word2);
        Assert.assertEquals("Test Fail", expectedResult, actualResult);
    }


}
