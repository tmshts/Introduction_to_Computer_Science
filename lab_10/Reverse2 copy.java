import java.util.Scanner;

public class Reverse2 {

    public static String result = "";
    public static int[] upper_lower;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        
        // upper is 1, lower is 0, whitespace = 9
        upper_lower = new int[input.length()];

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                upper_lower[i] = 0;
            }
            if (Character.isUpperCase(c)) {
                upper_lower[i] = 1;
            }
            if (c == ' ') {
                upper_lower[i] = 9;
            }
            if (Character.isDigit(c)) {
                upper_lower[i] = 5;
            }
        }

        for(int i = 0; i < input.length(); i++) {
            System.out.print(upper_lower[i] + " ");
        }
        System.out.println();

        reverse(input);

        // System.out.println(result);

        for(int i = 0; i < upper_lower.length - 1; i++) {
            if(upper_lower[i] == 9) {
                int temp = upper_lower[i+1];
                upper_lower[i+1] = upper_lower[i];
                upper_lower[i] = temp;
            }
        }

        for(int i = 0; i < input.length(); i++) {
            System.out.print(upper_lower[i] + " ");
        }
        System.out.println();

        Character[] newResult = new Character[input.length()];

        for(int i = 0; i < result.length(); i++) {
            // lower case
            if (upper_lower[i] == 0) {
                newResult[i] = Character.toLowerCase(result.charAt(i));
            }
            //upper case
            else if (upper_lower[i] == 1) {
                newResult[i] = Character.toUpperCase(result.charAt(i));
            }
            // white space
            else if (upper_lower[i] == 9) {
                newResult[i] = ' ';
            }
            // other, e. g. number
            else if (upper_lower[i] == 5) {
                newResult[i] = result.charAt(i);
            }
        }

        String output = "";
        for(int i = 0; i < newResult.length; i++) {
            //System.out.print(newResult[i] + " ");
            output = output + newResult[i];
        }
        //System.out.println();

        System.out.println(output);
    }

    public static void reverse(String input) {

        // base case
        if(input.length() == 1) {
            result = result + input;
        }
        // recursive
        else {
            String last_letter = input.substring(input.length() - 1);
            //System.out.println(last_letter);
            result = result + last_letter;
            reverse(input.substring(0, input.length() - 1));
        }
    }
}