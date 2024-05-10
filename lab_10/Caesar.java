import java.util.Scanner;

public class Caesar {
    
    public static void main(String[] args) {

        Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};

        
        Scanner scan = new Scanner(System.in);
        String input_message = scan.nextLine();

        int input_shift = scan.nextInt();

        String result = recursion(input_message, input_shift, letters);

        System.out.println(result);

    }

    public static String check(String input, int shift, Character[] letters, String cipher) {

        for(int i = 0; i < letters.length; i++) {
            Character lower = Character.toLowerCase(input.charAt(input.length() - 1));
            if(letters[i] == lower) {
                if(Character.isLowerCase(input.charAt(input.length() - 1))) {
                    // edge case 25
                    if((i + shift) > 25) {
                        int new_index = (i + shift) - 26;
                        Character c = Character.toLowerCase(letters[new_index]);
                        cipher = c + cipher;           
                    }
                    // normal case
                    else {
                        Character c = Character.toLowerCase(letters[i + shift]);
                        cipher = c + cipher;
                    }
                }
                if(Character.isUpperCase(input.charAt(input.length() - 1))) {
                    // edge case 25
                    if((i + shift) > 25) {
                        int new_index = (i + shift) - 26;
                        Character c = Character.toUpperCase(letters[new_index]);
                        cipher = c + cipher;           
                    }
                    // normal case
                    else {
                        Character c = Character.toUpperCase(letters[i + shift]);
                        cipher = c + cipher;
                    }
                }
            }
        }
        return cipher;
    }

    public static String recursion(String input, int shift, Character[] letters) {

        String cipher = "";

        // base case
        if(input.length() == 1) {
            return check(input, shift, letters, cipher);
        }
        // recursive step
        else {
            // handle white space
            if (input.charAt(input.length() - 1) == ' ') {
                cipher = ' ' + cipher;
                return recursion(input.substring(0, input.length()-1), shift, letters) + cipher;
            }
            else {
                return recursion(input.substring(0, input.length()-1), shift, letters) + check(input, shift, letters, cipher);
            }
        }
    }
}