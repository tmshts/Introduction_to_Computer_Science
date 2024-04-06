import java.util.Scanner;

public class SumDigits {
    
    public static void main(String [] args) {
        Scanner scanner_object = new Scanner(System.in);
        try {
            System.out.println("Enter an integer value.");
            int input = scanner_object.nextInt();
            String numberString = Integer.toString(input);
            int result = recursiveSum(numberString);
            System.out.println("Result = " + result);
        }
        catch (Exception e) {
            System.out.println("Please enter an integer value.");
        }
        scanner_object.close();
    }

    public static int recursiveSum(String input) {
        // base case
        if (input.length() == 1) {
            return Character.getNumericValue(input.charAt(0));
        }
        // recursive step
        else {
            return Character.getNumericValue(input.charAt(input.length() - 1)) + recursiveSum(input.substring(0, input.length() - 1));
        }
    }
}