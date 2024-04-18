import java.util.Scanner;

public class BinarySearchGame {
    
    public static void main (String args[]) {
        // DO NOT CHANGE THE start AND end VARIABLES
        int start = 1;
        int end = 10;

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        sc.close();

        int counter = 0;
        int high = end, low = start, middle = 0;
        boolean found = false;

        while (low <= high && !found) {
            counter++;
            middle = (high + low) / 2;
            if (target < middle) {
                high = middle - 1;
            }
            else if (target > middle) {
                low = middle + 1;
            }
            else {
                System.out.println("The number is: " + target);
                System.out.println("It took " + counter + (counter<=1 ? " try!" : " tries!" ));
                found = true;
            }
        }
        if(!found) {
            System.out.println(target + " was not found in the list");
        }
    }

    public static void printArray(int[] values) {
        for(int a = 0; a < values.length; a++) {
            System.out.print(values[a] + " ");
        }
        System.out.println();
    }
}