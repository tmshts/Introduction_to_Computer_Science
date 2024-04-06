import java.util.Scanner;

public class VariousArrayTasks {
    
    public static void main (String [] args) {
        int[] filled_array = fillArray();
        //System.out.println(Arrays.toString(filled_array));
        int sum_result = sumArray(filled_array);
        System.out.println("Sum = " + sum_result);
        double avg_result = avgArray(filled_array);
        System.out.println("Average = " + avg_result);
        printArray(filled_array);
    }

    public static int[] fillArray() {
        Scanner scanner_object = new Scanner(System.in);
        System.out.println("Enter a number representing the lenght of the array followed by numbers to fill the array (use whitespace between numbers):");
        String input = scanner_object.nextLine();

        // trim strings by whitespace
        String [] input_strings = input.split(" ");
        //System.out.println(Arrays.toString(input_strings));

        // first string will be then converted to integer = length of array 
        String array_length_string = input_strings[0];

        // declare and initialize array with 0s
        int[] array_to_fill = new int[0];
        try {
            // convert string to integer
            Integer array_length_integer = Integer.parseInt(array_length_string);
            // create array of n-size
            array_to_fill = new int[array_length_integer];
    
            // fill the array with integers which were converted from strings
            for (int i = 1; i < input_strings.length; i++) {
                // convert string to integer and fill array
                array_to_fill[i-1] = Integer.parseInt(input_strings[i]);
            }    
        }
        catch (Exception e) {
            System.out.println("Please enter only integers (use whitespace between numbers).");
            System.exit(0);
        }
    
        scanner_object.close();
        return array_to_fill;
    }

    public static int sumArray(int[] input_array) {
        int result = 0;
        for (int i = 0; i < input_array.length; i++) {
            result = result + input_array[i];
        }
        return result;
    }

    public static Double avgArray(int[] input_array) {
        int result_sum = sumArray(input_array);
        int array_length = input_array.length;
        double average_result = (double) result_sum / (double) array_length;
        return average_result;
    }

    public static void printArray(int[] input_array) {
        for ( int i = 0; i < input_array.length; i++) {
            System.out.print(input_array[i] + " ");
        }
        System.out.println();
    }
}
