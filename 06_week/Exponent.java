import java.util.Scanner;

public class Exponent {

    static int base;
    static int power;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 integers");

        for (int i = 0; i < 2; i++) {
            if (i == 0 ) {
                try {
                    base = scan.nextInt();
                }
                catch (Exception e) {
                    System.out.println("Please enter Integer.");
                    System.exit(1);
                }            }
            if (i == 1 ) {
                try {
                    power = scan.nextInt();
                }
                catch (Exception e) {
                    System.out.println("Please enter Integer.");
                    System.exit(1);
                }               
            }         
        }
        scan.close();

        int result = powerTo(base, power);
        System.out.println(result);
        
    }

    public static int powerTo(int base, int power) {

        // base case
        if (power == 1) {
            return base;
        }

        // recursive case
        else {
            return base * powerTo(base, power-1);
        }
    }
}