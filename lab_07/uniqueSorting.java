import java.util.Scanner;

public class uniqueSorting {
    
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
        int[] result = removeDuplicates(input_array);
        printArray(result);
    }

    public static void printArray(int[] values) {
        for(int a = 0; a < values.length; a++) {
            System.out.print(values[a] + " ");
        }
        System.out.println();
    }


    public static int[] removeDuplicates(int[] int_array) {
        int size_new_array = 0;
        for(int i = 0; i < int_array.length - 1; i++) {
            if (int_array[i] != int_array[i + 1]) {
                size_new_array++;
            }
        }
        // to add last value
        size_new_array++;

        int[] new_array = new int[size_new_array];

        int index_of_new_array = 0;
        for(int j = 0; j < int_array.length - 1; j++) {
            if (int_array[j] != int_array[j + 1]) {
                new_array[index_of_new_array] = int_array[j];
                index_of_new_array++;
            }
        }
        new_array[index_of_new_array] = int_array[int_array.length-1];

        return new_array;
    }

    public static void bubbleSort(int[] int_array) {
        for (int i = 1; i < int_array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < int_array.length - i; j++) {
                if (int_array[j] > int_array[j+1]) {
                    int temp_int = int_array[j+1];
                    int_array[j+1] = int_array[j];
                    int_array[j] = temp_int;
                    isSorted = false;
                }
            }
            if (isSorted) return;
        }
    }
}
