import java.util.Scanner;

public class Primes {

    public static void main (String[] args) {
        Scanner scanner_object = new Scanner(System.in); 
        System.out.println("Enter single integer:");
        try {
            Integer number = scanner_object.nextInt();
            Boolean isPrime = isPrime(number);
            if (isPrime) {
                System.out.println(number + " is a Prime number");
            }
            else {
                System.out.println(number + " is NOT a Prime number");
            }

            /*
            // test
            for (int i = 0; i<100; i++) {
                Boolean prime_number = isPrime(i);
                if (prime_number) {
                    System.out.println(i);
                }
            }
            */
            

        } catch (Exception e) {
            System.out.println("Please enter single integer");
        }
        scanner_object.close();
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