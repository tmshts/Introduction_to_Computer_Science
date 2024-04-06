import java.util.Scanner;

public class Vowels {
    
    public static void main(String [] args) {
        Scanner scanner_object = new Scanner(System.in);
        System.out.println("Enter a String:");

        String input = scanner_object.nextLine();
        String input_lowercase = input.toLowerCase();
        int result = vowelCount(input_lowercase);
        System.out.println(result);

        scanner_object.close();
    }

    // vowels a, e, i, o, u
    public static int vowelCount(String input) {

        // base case
        if (input.length() == 1) {
            if (input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o' || input.charAt(0) == 'u') {
                return 1;
            }
            else {
                return 0;
            }
        }

        // recursive case
        else {
            if (input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o' || input.charAt(0) == 'u') {
                return 1 + vowelCount(input.substring(1));
            }
            else {
                return vowelCount(input.substring(1));
            }
        }
    }
}
