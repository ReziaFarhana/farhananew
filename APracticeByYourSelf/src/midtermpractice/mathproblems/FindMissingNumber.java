package mathproblems;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        System.out.println(findMissingNum(array));

    }

    public static int findMissingNum (int [] array) {
        int missingNum = 0;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[(i+1) % array.length] > array[i] + 1) {
                missingNum = array[i] + 1;
            }
        }

        return missingNum;
    }
}

