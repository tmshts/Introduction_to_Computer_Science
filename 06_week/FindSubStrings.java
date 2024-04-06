import java.util.Scanner;

public class FindSubStrings {

    static String core_string;
    static String sub_string;
    static String number_string;
    static int global_number;
    static int counter = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 strings and 1 integer");

        for (int i = 0; i < 3; i++) {
            if (i == 0 ) {
                core_string = scan.nextLine();
            }
            if (i == 1 ) {
                sub_string = scan.nextLine();
            }         
            if (i == 2) {
                try {
                    global_number = scan.nextInt();
                }
                catch (Exception e) {
                    System.out.println("Please enter Integer.");
                    System.exit(1);
                }
            }
        }
        scan.close();

        Boolean result = checkForSub(core_string, sub_string, global_number);
        System.out.println(result);
        
    }

    public static Boolean checkForSub(String core_string, String sub_string, int core_number) {

        int sub_string_length = sub_string.length();
        int core_string_length = core_string.length();
        
        // base case
        if (core_string_length < sub_string_length) {
            if (counter == core_number) {
                return true;
            }
            else return false;
        }

        // recursive case
        else {
            String tested_substring = core_string.substring(0, sub_string_length);
            if (tested_substring.equals(sub_string)) {
                counter++;
            }
            return checkForSub(core_string.substring(1), sub_string, core_number);
        }
    }
}