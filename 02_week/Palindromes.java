import java.util.Scanner;

public class Palindromes {

    public static void main (String[] args) {
        Scanner scanner_object = new Scanner(System.in); 
        System.out.println("Enter a string/word:");
        String word = scanner_object.nextLine();
        Boolean isBoolean = isPalindrome(word);

        if (isBoolean) {
            System.out.println(word.toUpperCase() + " is a Palindrome");
        }
        else {
            System.out.println(word + " is NOT a Palindrome");
        }
        scanner_object.close();
    }

    public static Boolean isPalindrome(String word) {

        String lower_word = word.toLowerCase();

        // create array of chars
        char[] array_chars = new char[word.length()];

        // reverse word as array of chars
        for (int i = 0; i < word.length(); i++) {
            array_chars[word.length()-1-i] = lower_word.charAt(i);
        }

        // convert reverted array chars into String
        String reverse_word_lower = new String(array_chars);

        Boolean compare = lower_word.equals(reverse_word_lower);
        if (compare) {
            return true;
        }
        else {
            return false;
        }
    }
}
