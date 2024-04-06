import java.util.Scanner;

public class MinimumValue {

    static int [] m_numbers_array;
    
    public static void main(String [] args) {
        Scanner scanner_object = new Scanner(System.in);
        System.out.println("Enter an integer representing the length of the array, followed by m numbers.");
        try {
            int input_n = scanner_object.nextInt();
            m_numbers_array = new int[input_n];
            while(input_n > 0) {
                int input_m = scanner_object.nextInt();
                m_numbers_array[input_n-1] = input_m;
                input_n--;
            }
        }
        catch (Exception e) {
            System.out.println("Please enter only integer numbers");
        }
        int result_iter = minArrayIter(m_numbers_array);
        int result_rec = minArrayRec(m_numbers_array, 0);
        System.out.println(result_iter + " " + result_rec);
        scanner_object.close();
    }

    public static int minArrayIter(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int minArrayRec(int [] a, int start) {
        // base case
        if (start == a.length - 1) {
            return a[start];
        }
        // recursive step
        else {
            return (Math.min(a[start],  minArrayRec(a, start + 1)));
        }
    }
}