import java.util.Scanner;

public class Pentagons {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int result = numDots(number);

        System.out.println(result);
    }

    public static int numDots(int number) {
        // base cases
        if(number == 0) {
            return 0;
        }
        else if(number == 1) {
            return 1;
        }
        // recursive step
        else {
            int dots = 5;
            int res = (dots * number) - 5;
            return res + numDots(number-1);
        }
    }
}
