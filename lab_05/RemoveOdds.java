import java.util.Scanner;

public class RemoveOdds {

    static int input;
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            input = scan.nextInt();
        }
        catch (Exception e) {
            System.out.println("Please enter integer");
        }
        scan.close();
        int result = evenDigits(input);
        System.out.println(result);
    }

    public static int evenDigits(int number) {

        // base case
        if (number == 0) {
            return 0;
        }

        // recursive step
        else {
            // even -> 0
            if ((number % 10) % 2 == 0) {
                return  (number % 10) + evenDigits(number/10) * 10;
            }
            // odd -> keep number
            else {
                return evenDigits(number/10);
            }
        }
    }
}