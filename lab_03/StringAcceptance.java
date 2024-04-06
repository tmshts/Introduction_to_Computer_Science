import java.util.Scanner;

public class StringAcceptance {

    public static void main (String [] args) {

        Scanner scanner_object = new Scanner(System.in);

        System.out.println("Enter String");
        String input = scanner_object.nextLine();
        scanner_object.close();
        Boolean bool = input.matches("[01]+");
        System.out.println(bool);
    }

}
