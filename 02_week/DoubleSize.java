import java.util.Scanner;

public class DoubleSize {
    
    public static void main (String[] args) {
        Scanner scanner_object = new Scanner(System.in); 
        System.out.println("Enter two double numbers (press enter after inserting each number):");
        try {
            Double double_1 = scanner_object.nextDouble();
            Double double_2 = scanner_object.nextDouble();
            determineSize(double_1, double_2);
        } catch (Exception e) {
            System.out.println("Please enter only double numbers or integers");
        }
    scanner_object.close();
    }

    public static void determineSize(double a, double b) {        
        double compare_two_doubles = Double.compare(a, b);

        if ( compare_two_doubles > 0 ) {
            System.out.println("Largest = " + a);
            System.out.println("Smallest = " + b);           
        }
        else if ( compare_two_doubles < 0 ) {
            System.out.println("Largest = " + b);
            System.out.println("Smallest = " + a);  
        }
        else {
            System.out.println("Numbers are same");
        }

        // below code is not working for negative double numbers
        /*
        if ( a > b ) {
            System.out.println("Largest = " + a);
            System.out.println("Smallest = " + b);
        } else if ( a > b) {
            System.out.println("Largest = " + b);
            System.out.println("Smallest = " + a);
        } else {
            System.out.println("Numbers are same");
        }
        */
    }
}
