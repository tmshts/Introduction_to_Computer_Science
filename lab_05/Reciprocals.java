import java.util.Scanner;

public class Reciprocals {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int input = scan.nextInt();
            double result = sumTo(input);
            double final_result = Math.round(result * 100.0) / 100.0;
            System.out.println(final_result);
        }
        catch (Exception e) {
            System.out.println("Please enter integer");
            System.exit(1);
        }
        scan.close();
    }

    public static double sumTo(int number) {

        // base case
        if ( number == 0) {
            return 0.0;
        }

        if (number == 1) {
            return 1.0;
        }

        // recursive step
        double result = 1/(double)number;
        //System.out.println(Math.round(result * 100.0) / 100.0);
        return  sumTo(number - 1) + result;
    }
}
