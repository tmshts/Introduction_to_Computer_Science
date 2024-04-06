import java.util.Scanner;

public class Password {

    static String [] regex_list = {".*[a-z].*", ".*[a-z].*[a-z].*", ".*[A-Z].*", ".*[A-Z].*[A-Z].*", ".*[0-9].*", ".*[0-9].*[0-9]*.", ".*[#!?@].*", ".*[#!?@].*[#!?@].*"};

    public static void main (String [] args) {

        Scanner scanner_object = new Scanner(System.in);
        String input = scanner_object.nextLine();
        scanner_object.close();
        int score = verify(input);

        String strength = new String();

        if (score < 4) {
            strength = "Weak";
        }
        else if (score < 6) {
            strength = "Fair";
        }
        else if (score < 8) {
            strength = "Good";
        }
        else {
            strength = "Strong";
        }
        System.out.println(("Password strength: " + strength)); 

    }

    public static int verify(String input) {
        int score = 0;

        if (input.length() >= 8) {
            System.out.println(("length 8")); 
            score++;
        }
        if (input.length() >= 12) {
            System.out.println(("length 12")); 
            score++;
        }

        for (int i = 0; i < regex_list.length; i++) {
            boolean result = input.matches(regex_list[i]);
            if (result) {
                score++;
            }
        }

        return score;
    }
}
