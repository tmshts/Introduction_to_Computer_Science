import java.util.Scanner;

public class ValidAge {

    static int input;

    public static void main (String [] args) {

        Scanner scanner_object = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            try {
                input = scanner_object.nextInt();
                String input_string = Integer.toString(input);
                //check = input_string.matches("[0-9]|[1-9][0-9]|1[0-4][0-9]|150");
                check = input_string.matches("[0-9]{1,2}|1[0-4][0-9]|150");
                if (!check) {
                    System.out.println(input);
                    System.out.println("Age is NOT valid");
                }
            }
            catch (Exception e) {
                System.out.println("Please enter integer");
                System.exit(1);
            }

        }
        System.out.println(input);
        System.out.println("Age is valid");
        scanner_object.close();
    }
}
