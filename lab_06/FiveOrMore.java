import java.util.Scanner;

public class FiveOrMore {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        String[] input_array = input.split(" ");
        int i = 0;
        String[] temp = new String[input_array.length];

        while (i < input_array.length) {
            if ( input_array[i].length() >= 5) {
                String reverted_String = reverse(input_array[i]);
                temp[i] = reverted_String;
            }
            else {
                temp[i] = input_array[i];
            }
            i++;
        }
        String result_String = new String();
        
        for(int j = 0; j < input_array.length; j++) {
            if (j == input_array.length - 1) {
                result_String = result_String + temp[j];
            }
            else {
                result_String = result_String + temp[j] + " ";
            }
        }

        System.out.println(result_String);

    }

    public static String reverse(String input) {
        // base case
        if (input.length() == 1) {
            return Character.toString(input.charAt(0));
        }
        // recursive step
        else {
            return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() -1 ));
        }
    }
}
