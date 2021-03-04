package midterm.mathproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}


    public static void main(String[] args){

            Set<Integer> number1= new HashSet<>();
            number1.addAll(Arrays.asList(new Integer[] {1,3,4} ));
            Set<Integer> number2= new HashSet<>();
            number2.addAll(Arrays.asList(new Integer[] {4,5,6,7,8} ));

            // To Do Union Set
            Set<Integer> union= new HashSet<>(number1);
            union.addAll(number2);
            System.out.println("Merger of two set "+union);
      }

    }
package mathproblems;

        import java.util.Arrays;
        import java.util.HashSet;
        import java.util.Iterator;
        import java.util.Set;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}


    public static void main(String[] args) {

        int [] a = {1,3,4};
        int [] b = {4,5,6,7,8};

        int [] merged = mergeArrays2(a,b);
        System.out.println(Arrays.toString(merged));

    }


//    public static int[] mergeArrays2(int[] arr1, int[] arr2){
//        int[] merged = new int[arr1.length + arr2.length];
//        System.arraycopy(arr1, 0, merged, 0, arr1.length);
//        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
//
//        Set<Integer> nodupes = new HashSet<Integer>();
//
//        for(int i=0;i<merged.length;i++){
//            nodupes.add(merged[i]);
//        }
//
//        int[] nodupesarray = new int[nodupes.size()];
//        int i = 0;
//        Iterator<Integer> it = nodupes.iterator();
//        while(it.hasNext()){
//            nodupesarray[i] = it.next();
//            i++;
//        }
//
//
//        return nodupesarray;
//    }
//
//
//}
