import java.util.Scanner;

public class CombineReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = 0;
        try {
            input = scan.nextInt();
        }
        catch (Exception e) {
            System.out.println("Please enter non-negative integer");
            System.exit(1);
        }
        scan.close();

        if (input < 0) {
            System.out.println("Not a valid entry!");
            System.exit(1);
        }

        long result = combine(input);
        System.out.println(result);
    }
    
    static int reverted = 0;

    public static long combine(int number) {

        reverse(number);
        long combined_number = Integer.valueOf(String.valueOf(number) + String.valueOf(reverted));

        return combined_number;
    }

    public static void reverse(int n) {         
        // base case
        if (n == 0) 
            return; 

        // recursive step 
        reverted = (reverted * 10) + n % 10; 
        reverse(n / 10); 
    } 
}
