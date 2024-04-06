import java.util.Scanner;

public class Stars {
    
    public static void main (String[] args) {
        Scanner scanner_object = new Scanner(System.in); 
        System.out.println("Enter single integer");
        try {
            Integer number = scanner_object.nextInt();
            printStarTriangle(number);
        } catch (Exception e) {
            System.out.println("Please enter single integer");
        }
    scanner_object.close();

    }

    public static void printStarTriangle(int a) {
        int i, j;
        for(i = 0; i < a; i++){
            for (j = 0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
