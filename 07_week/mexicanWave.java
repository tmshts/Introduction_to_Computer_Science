import java.util.Scanner;

public class mexicanWave {
    
    static String[] string_array;
    static String input;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        scan.close();
        string_array = new String[input.length()];

        String[] result = wave(input);

        for(int u = 0; u < result.length; u++) {
            // anyway, why appears null in the string array??
            if (result[u] != null) {
                System.out.println(result[u]);
            }
        }
    }

    static int i = 0;

    public static String[] wave(String s) {

        // base case
        if (s.length() == i) {
            return string_array;
        }

        // recursive step
        else {
            if (s.charAt(i) != ' ') {
                char charUpper = Character.toUpperCase(s.charAt(i));
                String newString = s.substring(0, i)+charUpper+s.substring(i+1);
                string_array[i] = newString;
            }
            i++;
    
            return wave(s);
        }
    }
}
