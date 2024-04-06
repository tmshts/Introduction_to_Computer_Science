import java.util.Scanner;

public class FlightCodes {

    static String input;

    public static void main (String [] args) {

        Scanner scanner_object = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            input = scanner_object.nextLine();
            //check = input_string.matches("[0-9]|[1-9][0-9]|1[0-4][0-9]|150");
            check = input.matches("[A-Z]{2,3}[0-9]{3,4}");
            if (!check) {
                System.out.println(input);
                System.out.println("Flight code is NOT valid");
            }
        }
        System.out.println(input);
        System.out.println("Flight code is valid");
        scanner_object.close();
    }
}
