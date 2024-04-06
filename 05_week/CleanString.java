import java.util.Scanner;

public class CleanString {
    
    public static void main(String [] args) {
        Scanner scanner_object = new Scanner(System.in);
        System.out.println("Enter a String:");

        String input = scanner_object.nextLine();

        String result = cleanString(input);
        System.out.println(result);

        scanner_object.close();
    }
    
    public static String cleanString(String input) {
        // base case
        if (input.length() <= 1) {
                return input;
        }
        // recursive step
        else {
            if (input.charAt(0) == input.charAt(1)) {
                return cleanString(input.substring(1, input.length()));
            }
            else {
                return input.charAt(0) + cleanString(input.substring(1, input.length()));
            }
        }
    }
    
}