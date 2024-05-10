import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Reverse2 {

    public static int[] upper_lower;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //String input = scan.nextLine();
        //String input = "UPPER lower";
        //String input = "Computer";
        String input = "1 23 456";
        //String input = "Llama or Alpaca";

        // upper is 1, lower is 0, whitespace = 9, digit = 5
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

        System.out.println("upper_lower");
        for(int i = 0; i < input.length(); i++) {
            System.out.print(upper_lower[i]);
        }
        System.out.println();

        String result = reverse(input);

        System.out.println("result");
        for(int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i));
        }
        System.out.println();
        
        System.out.println("chars");
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : result.toCharArray()) {
            System.out.print(c);
            chars.add(c);
        }
        System.out.println();

        /*
        for (int d = 0; d < chars.size(); d++) {
            System.out.print(chars.get(d));
            System.out.print(d);
        }
        */

        //System.out.println(chars.get(0));

        Character[] result_array = new Character[result.length()];
        
        // mapping

        // upper is 1, lower is 0, whitespace = 9, digit = 5
        for(int i = 0; i < upper_lower.length; i++) {
            int number = upper_lower[i];
            // upper 1
            if (number == 1) {
                for (int d = 0; d < chars.size(); d++) {
                    if(chars.get(d) != '@') {
                        result_array[i] = Character.toUpperCase(chars.get(d));
                        chars.set(d, '@');
                        break;
                    }
                }
            }
            // lower 0
            if (number == 0) {
                for (int d = 0; d < chars.size(); d++) {
                    if(chars.get(d) != '@') {
                        result_array[i] = Character.toLowerCase(chars.get(d));
                        chars.set(d, '@');
                        break;
                    }
                }
                upper_lower[i] = 1;
            }
            // whitespace 9
            if (number == 9) {
                for (int d = 0; d < chars.size(); d++) {
                    if(chars.get(d) != '@') {
                        result_array[i] = ' ';
                        chars.set(d, '@');
                        break;
                    }
                }
            }
            // digit 5
            if (number == 5) {
                for (int d = 0; d < chars.size(); d++) {
                    if(chars.get(d) != '@') {
                        result_array[i] = chars.get(d);
                        chars.set(d, '@');
                        break;
                    }
                }
            }
        }
        
        System.out.println("result_array");
        for(int i = 0; i < result_array.length; i++) {
            System.out.print(result_array[i]);
        }
        System.out.println();

    }

    public static String reverse(String input) {

        String result = "";
        // base case
        if(input.length() == 1) {
            result = input + result;
            return result;
        }
        // recursive step
        else {
            String last_letter = input.substring(input.length() - 1);
            result = last_letter + result;
            return result + reverse(input.substring(0, input.length() - 1));
        }
    }
}