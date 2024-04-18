
public class missingElement {
    
    public static void main(String[] args) {

        int[] missing = {1, 4, 7, 9, 3, 6, 8, 5};
        int missing_number;

        bubbleSort(missing);
        //printArray(missing);
        missing_number = find(missing);
        System.out.println(missing_number);
    }

    public static int find(int[] check_array) {
        int number = 0;
        for (int b = 0; b < check_array.length - 1; b++) {
            if (check_array[b+1] - check_array[b] > 1) {
                number = check_array[b] + 1;
            }
        }
        return number;
    }


    public static void printArray(int[] values) {
        for(int a = 0; a < values.length; a++) {
            System.out.println(values[a]);
        }
    }

    public static void bubbleSort(int[] int_array) {
        int limit = int_array.length;
        int temp = 0;
        for (int i = 0; i < int_array.length; i++) {
            limit--;
            for (int j = 0; j < limit; j++) {
                if (int_array[j] > int_array[j+1]) {
                    temp = int_array[j+1];
                    int_array[j+1] = int_array[j];
                    int_array[j] = temp;
                }
            }
        }
    }
}
