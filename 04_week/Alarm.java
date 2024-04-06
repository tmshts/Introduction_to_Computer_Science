import java.util.Scanner;

public class Alarm {

    public static void main (String [] args) {

        Scanner scanner_object = new Scanner(System.in);
        String input = scanner_object.nextLine();
        scanner_object.close();
        verify(input);
    }

    public static void verify(String input) {
        if(input.length() >= 10) {
            System.out.println(("Alarm Activated"));
            System.exit(1);
        }
        boolean check = input.matches(".*1234.*");
        if(check) {
            System.out.println(("Alarm Deactivated"));
        }
        else {
            System.out.println(("Alarm Activated")); 
        }
    }
}
