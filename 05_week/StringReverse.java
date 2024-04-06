import java.util.Scanner;

public class StringReverse {
    
    public static void main(String [] args) {
        Scanner scanner_object = new Scanner(System.in);
        System.out.println("Enter a String:");

        String input = scanner_object.nextLine();

        String result = reverseRec(input);
        System.out.println(result);

        scanner_object.close();
    }

    public static String reverseRec(String input) {
        // base case
        if (input.length() == 1) {
            return Character.toString(input.charAt(0));
        }
        // recursive step
        else {
            return input.charAt(input.length() - 1) + reverseRec(input.substring(0, input.length() -1 ));
        }
    }
}