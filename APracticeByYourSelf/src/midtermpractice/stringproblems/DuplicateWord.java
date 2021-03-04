package stringproblems;


public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String string = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        FindDuplicateWords(string);
    }

    public static void FindDuplicateWords (String string) {

        int count;
        //Converts the string into lowercase
        string = string.toLowerCase();
        //Split the string into words using built-in function
        String[] words = string.replace(".", "").split(" ");
        System.out.println("Duplicate words in a given string : ");
        int wordLengthCounter = 0;
        int duplicateWordCount = 0;
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }
            //Displays the duplicate word if count is greater than 1
            if (count > 1 && words[i] != "0") {
                System.out.println("Word: " + words[i] + ", Occurrences: " + count);
                wordLengthCounter += words[i].length();
                duplicateWordCount++;
            }
        }
        // Calculate average of word length using word length counted in previous
        // step and dividing by the number of duplicate words.
        int averageDuplicateWordLength = wordLengthCounter / duplicateWordCount;
        System.out.println("Average word length of duplicate word: " + averageDuplicateWordLength + " characters.");
    }

}