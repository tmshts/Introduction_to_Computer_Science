import java.util.Scanner;

public class BubbleSortInt {

    static int n;
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            n = scan.nextInt();
        }
        catch (Exception e) {
            System.out.println("Please enter only Integers.");
            System.exit(1);
        }

        int[] input_array = new int[n];

        for (int i = 0; i < n; i++) {
            try {
                input_array[i] = scan.nextInt();
            }
            catch (Exception e) {
                System.out.println("Please enter only Integers.");
                System.exit(1);
            }
        }
        scan.close();
        bubbleSort(input_array);
        printArray(input_array);
    }

    public static void printArray(int[] values) {
        for(int a = 0; a < values.length; a++) {
            System.out.print(values[a] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] int_array) {
        for (int i = 1; i < int_array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < int_array.length - i; j++) {
                if ( String.valueOf(int_array[j]).length() == String.valueOf(int_array[j + 1]).length()) {
                    if (int_array[j] > int_array[j+1]) {
                        int temp = int_array[j+1];
                        int_array[j+1] = int_array[j];
                        int_array[j] = temp;
                        isSorted = false;
                    }
                }
                else if(int_array[j] < int_array[j+1]) {
                    int temp = int_array[j+1];
                    int_array[j+1] = int_array[j];
                    int_array[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) return;
        }
    }
}
