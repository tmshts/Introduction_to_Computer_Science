import java.util.Scanner;

public class MathsFunction {
        public static void main(String [] args) {
            Scanner scanner_object = new Scanner(System.in);
            try {
                System.out.println("Enter an integer value.");
                int input = scanner_object.nextInt();
                int result_iterative = q1Iterative(input);
                int result_recursive = q1Recursive(input);
                System.out.println(result_iterative + " " + result_recursive);
            }
            catch (Exception e) {
                System.out.println("Please enter an integer value.");
            }
            scanner_object.close();
        }

        public static int q1Iterative(int n) {
            int result = 2;
            for (int i = 2; i <= n; i++) {
                result = (4 * result) - (3 * i);
            }
            return result;
        }

        public static int q1Recursive(int n) {
            if ( n <= 1) {
                return 2;
            }
            else {
                return (4 * q1Recursive(n - 1) - (3 * n));
            }
        }
}
