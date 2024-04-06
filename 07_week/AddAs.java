import java.util.Scanner;

public class AddAs {

    static String new_String = new String();
    static String aa = new String("aa");

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        String result = moreAs(input);
        System.out.println(result);
    }

    static int i = 0;

    public static String moreAs(String s) {

        // base case
        if (s.length() == i) {
            return new_String;
        }
        
        // recursive step
        // alena -> aaalena
        if (s.charAt(i) == 'a') {
            new_String = s.substring(0, i+1) + aa + s.substring(i+1);
            i = i + 3;
        }
        else {
            new_String = s.substring(0, i+1) + s.substring(i+1);
            i++;
        }
        return moreAs(new_String);
    }
}
