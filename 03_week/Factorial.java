import java.util.Scanner;

public class Factorial {
    
    static String first_number_string = "";
    static String second_number_string = "";
    static Integer first_number;
    static Integer second_number;
    static Integer result;


    public static void main(String [] args) {
        Scanner scanner_object = new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        String input = scanner_object.nextLine();
        scanner_object.close();
        
        // trim numbers by whitespace
        String [] input_numbers_strings = input.split(" ");

        // extract the (string)numbers
        for (int i = 0; i < input_numbers_strings.length; i++){
            if ( i == 0) {
                first_number_string = input_numbers_strings[i];
            }
            if ( i == 1 ) {
                second_number_string = input_numbers_strings[i];
            }
            if (i == 2) {
                System.out.println("Enter only two integer numbers separated by whitespace."); 
                System.exit(0);     
            }
        }

        // check if the input was string or integer or something else
        try {
            first_number = Integer.parseInt(first_number_string);
            second_number = Integer.parseInt(second_number_string);

            // check negative number
            if(first_number < 0 || second_number < 0){
                System.out.println("Not Valid!");
                System.exit(0);
            }
            // no 0 allowed
            else if(first_number == 0 || second_number == 0){
                System.out.println("Please enter integer higher than 0.");
                System.exit(0);
            }  
            // two integer numbers              
            else {
                //System.out.println("Valid");
                for (int i = first_number; i <= second_number; i++ ) {
                    getFactorial(i);
                }
            }

        } catch (Exception e) {
            System.out.println("Please enter 2 single numbers");
            System.exit(0);
        }
    }

    public static void getFactorial(int number) {
            Integer final_result = factorial(number);
            System.out.println(final_result);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}