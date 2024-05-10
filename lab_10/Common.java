import java.util.Scanner;
import java.util.ArrayList;

public class Common {

    public static int[] numbers_arrays_1 = new int[10];
    public static int[] count_arrays_1 = new int[10];

    public static int[] numbers_arrays_2 = new int[10];
    public static int[] count_arrays_2 = new int[10];


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number_1 = scan.nextInt();
        int number_2 = scan.nextInt();

        //System.out.println(number_1 % 10);
        //System.out.println(number_1 / 10);

        int value_1 = 0;
        while(number_1 > 0) {
            int remainder_1 = number_1 % 10;

            if(numbers_arrays_1[remainder_1] == remainder_1) {
                value_1 = count_arrays_1[remainder_1];
                value_1++;
                count_arrays_1[remainder_1] = value_1;
            }
            else {
                numbers_arrays_1[remainder_1] = remainder_1;
                count_arrays_1[remainder_1] = 1;
            }
            number_1 = number_1 / 10;
        }

        int value_2;
        while(number_2 > 0) {
            int remainder_2 = number_2 % 10;

            if(numbers_arrays_2[remainder_2] == remainder_2) {
                value_2 = count_arrays_2[remainder_2];
                value_2++;
                count_arrays_2[remainder_2] = value_2;
            }
            else {
                numbers_arrays_2[remainder_2] = remainder_2;
                count_arrays_2[remainder_2] = 1;
            }
            number_2 = number_2 / 10;
        }

        /*
        for(int i = 0; i < numbers_arrays_1.length; i++) {
            System.out.println(numbers_arrays_1[i] + " " + count_arrays_1[i] + " --- " + numbers_arrays_2[i] + " " + count_arrays_2[i]);
        }
        */

        int max_count = 1;
        int index = 0;

        for(int i = 0; i < count_arrays_1.length; i++) {
            if(count_arrays_1[i] >= 1 && count_arrays_2[i] >= 1) {
                max_count = count_arrays_1[i] + count_arrays_2[i];
                index = i;
            }
        }
        if(max_count == 1) {
            System.out.println("No Common Number");
        }
        else {
            System.out.println(numbers_arrays_1[index] + " " + max_count);
        }
    }
}