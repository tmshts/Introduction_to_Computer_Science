import java.util.Scanner;

public class ValidName {

    static String input;

    public static void main (String [] args) {

        Scanner scanner_object = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            input = scanner_object.nextLine();
            //check = input_string.matches("[0-9]|[1-9][0-9]|1[0-4][0-9]|150");
            check = input.matches("[A-Z][a-z]{2,24}");
            if (!check) {
                System.out.println(input);
                System.out.println("Name is NOT valid");
            }
        }
        System.out.println(input);
        System.out.println("Name is valid");
        scanner_object.close();
    }
}
