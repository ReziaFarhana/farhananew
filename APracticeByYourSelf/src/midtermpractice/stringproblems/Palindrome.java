package stringproblems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String dad = "dad";
        System.out.println("True or false. Is dad a palindrome? " + isPalindrome(dad));
    }

    public static boolean isPalindrome (String inputString) {

        boolean isPalindrome = true;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length()-1-i)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

}