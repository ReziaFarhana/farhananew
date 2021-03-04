package problemandsolutions;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.


    public static void main(String[] args) {
        int[] elements = {35, 44, 48, 56, 67, 71, 17, 39, 13, 45};
        int searchKey = 17;
        System.out.println("Search Key found at: " + sequentialSearch(elements, searchKey));
    }

    public static int sequentialSearch(int[] elements, int key) {

        for(int i = 0; i < elements.length; i++) {
            if(elements[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

