import java.util.Scanner;

public class LinearSearch1 {
    
    public static void main(String args[]) {
        double num[] = {254.98,3.43,43321.54};

        Scanner scanner_object = new Scanner(System.in);
        System.out.println("Enter searched number:");

        try {
            Double input = scanner_object.nextDouble();

            Boolean result = findElement(num, input);
            if (result) {
                System.out.println(input + " was found in the array");
            }
            else {
                System.out.println(input + " was NOT found in the array");
            }
        }
        catch (Exception e) {
            System.out.println("Please enter number");
        }

        scanner_object.close();

    }

    public static Boolean findElement(double[] input_array, double searched_number) {
        for (int i = 0; i < input_array.length; i++) {
            if (input_array[i] == searched_number) {
                return true;
            }
        }
        return false;
    }
}
