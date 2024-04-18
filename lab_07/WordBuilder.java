public class WordBuilder {
    
    public static void main (String args[]) {
        // DO NOT CHANGE
        char letters[] = {'l', 'o', 'e', 'h', 'l'};
        int positions[] = {2, 4, 1, 0, 3};

        bubbleSort(positions, letters);
        printArray(letters);        
    }

    public static void printArray(char[] values) {
        for(int a = 0; a < values.length; a++) {
            System.out.print(values[a]);
        }
        System.out.println();
    }

    public static void bubbleSort(int[] int_array, char letters[]) {
        for (int i = 1; i < int_array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < int_array.length - i; j++) {
                if (int_array[j] > int_array[j+1]) {
                    int temp_int = int_array[j+1];
                    char temp_char = letters[j+1];
                    int_array[j+1] = int_array[j];
                    letters[j+1] = letters[j];
                    int_array[j] = temp_int;
                    letters[j] = temp_char;
                    isSorted = false;
                }
            }
            if (isSorted) return;
        }
    }
}
