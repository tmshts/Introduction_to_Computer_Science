import java.util.Scanner;

public class WhichExpression {

    public static void main (String [] args) {

        Scanner scanner_object = new Scanner(System.in);

        System.out.println("Enter String");
        String input = scanner_object.nextLine();
        scanner_object.close();

        String[] regex_array = new String[]{"a(b|a)b", "(ab)*b", "a(b|a)*", "((a|b)a)*"};

        verify(input, regex_array);
    }

    public static void verify(String input, String[] regex_array) {
        boolean no_match = true;
        for(int i = 0; i < regex_array.length; i++) {
            boolean bool = input.matches(regex_array[i]);
            if (bool) {
                System.out.println(i+1);
                no_match = false;
            }
        }
        if (no_match) {
            System.out.println("Not in the language"); 
        }
    }
}
