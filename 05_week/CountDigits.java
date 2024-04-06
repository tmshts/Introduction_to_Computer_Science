import java.util.Scanner;

public class CountDigits {

    /*  
        int    int  float    int
        1234 / 10 = 123,4 -> 123

        int    int  int   modulus
        1234 % 10 = 123 -> 4
     */
    
    public static void main(String [] args) {
        Scanner scanner_object = new Scanner(System.in);
        try {
            System.out.println("Enter an integer value.");
            int input = scanner_object.nextInt();
            int result = countEights(input);
            System.out.println("Result = " + result);
        }
        catch (Exception e) {
            System.out.println("Please enter an integer value.");
        }
        scanner_object.close();
    }

    public static int countEights(int input) {

        String numberString = Integer.toString(input);

        // base cases
        if (numberString.length() == 1) {
            if (input == 8) {
                return 1;
            }
            else {
                return 0;
            }
        }
        
        // recursive step
        else {
            if (input % 10 == 8 && (input / 10) % 10 == 8) {
                    return 2 + countEights(input/10);
                }
            else {
                if (input % 10 == 8) {
                    return 1 + countEights(input/10);
                }
                else {
                    return countEights(input/10);
                }
            }
        }
    }
}
