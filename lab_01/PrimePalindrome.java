import java.util.Scanner;

public class PrimePalindrome {

    public static void main (String[] args) {
        Scanner scanner_object = new Scanner(System.in); 
        System.out.println("Enter single integer:");
        try {
            Integer number = scanner_object.nextInt();

            Integer original_number = number;
      
            while(!(isPrime(number) && isPalindrome(number))) {
                number++;
            }

            if (original_number == number) {
                System.out.println(number + " is a Prime Palindrome");
            }
            else {
                System.out.println("The next Prime Palindrome is " + number);
            }
            

        } catch (Exception e) {
            System.out.println("Please enter single integer");
        }
        scanner_object.close();
    }

    public static Boolean isPalindrome(int number) {

        // create array of chars(digits) of the number
        char[] integer_array = String.valueOf(number).toCharArray();

        // create integer of the same size as number
        Integer reverted_number = number;

        // create array of chars(digits) of the reverted number
        char[] reverted_integer_array = String.valueOf(reverted_number).toCharArray();

        // reverse integer_array as array of chars
        for (int i = 0; i < integer_array.length; i++) {
            reverted_integer_array[reverted_integer_array.length-1-i] = integer_array[i];
        }

        // convert reverted array of chars(digits) into String
        String integer_array_string = new String(integer_array);
        String reverted_integer_array_string = new String(reverted_integer_array);

        Boolean compare = integer_array_string.equals(reverted_integer_array_string);
        
        if (compare) {
            return true;
        }
        else {
            return false;
        }
    }

    public static Boolean isPrime(int a) {

        if ( a < 2 ) {
            return false;
        }
        if (a == 2 ) {
            return true;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}