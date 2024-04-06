import java.util.Scanner;

public class Genomes {

    public static void main (String [] args) {

        Scanner scanner_object = new Scanner(System.in);
        String input = scanner_object.nextLine();
        scanner_object.close();
        boolean result = genom(input);
        System.out.println(result);
    }

    public static boolean genom(String input) {
        boolean check = input.matches("[c,g,a,t]*");
        return check;
    }
}
