import java.util.Scanner;

public class MethodOverloading2 {

    
    static int n;
    static String m;
    static int x;
    static int x1;
    static char c;
    static char c1;


    public static void main(String [] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values:");

        n = scan.nextInt();
        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = scan.next();
        }

        m = String.join(" ", input);
        
        try {
            x = scan.nextInt();
        }
        catch (Exception e) {
            System.out.println("Please enter Integer.");
            System.exit(1);
        }

        try {
            x1 = scan.nextInt();
        }
        catch (Exception e) {
            System.out.println("Please enter Integer.");
            System.exit(1);
        }
        c = scan.next().charAt(0);
        c1 = scan.next().charAt(0);

        scan.close();
        

        /*
        int n = 6;
        String m = new String("THE CAT SAT ON THE MAT");
        //String m = new String("a");
        int x = 1;
        int x1 = 12;
        char c = 'a';
        char c1 = 'm';
        */
        
        String m_lowercase = m.toLowerCase();

        String result_manipulation_1 = manipulation(m_lowercase);
        System.out.println(result_manipulation_1);
        String result_manipulation_2 = manipulation(m_lowercase,c);
        System.out.println(result_manipulation_2);
        String result_manipulation_3 = manipulation(m_lowercase, x);
        System.out.println(result_manipulation_3);
        String result_manipulation_4 = manipulation(m_lowercase, x, x1);
        System.out.println(result_manipulation_4);
        String result_manipulation_5 = manipulation(m_lowercase, c, c1);
        System.out.println(result_manipulation_5);
        String result_manipulation_6 = manipulation(m_lowercase, c, x);
        System.out.println(result_manipulation_6);

        
    }

    // manipulation 1 - remove whitespace
    public static String manipulation(String s) {
        return s.replace(" ", "");
    }

    // manipulation 2 - remove character
    public static String manipulation(String s, char c) {
            // base case
            if (s.length() <= 1) {
                if (s.charAt(0) == c) {
                    return "";
                }
                return s;
            }
            // recursive step
            else {
                if (s.charAt(0) == c) {
                    return manipulation(s.substring(1, s.length()), c);
                }
                else {
                    return s.charAt(0) + manipulation(s.substring(1, s.length()), c);
                }
            }
    }

    // manipulation 3 - check the index i for char and delete everyting
    public static String manipulation(String s, int i) {
        if (s.length() < i || s.length() < 1) {
            return s;
        }
        
        Character index_char = s.charAt(i);
        return manipulation(s, index_char);
    }
    
    // manipulation 4 - remove all char between indexes
    public static String manipulation(String s, int i, int n) {
        if (s.length() < i || s.length() < n) {
            return s;
        }
        String start = s.substring(0, i + 1);
        String end = s.substring(n);
        String compose = start + end;
        return compose;
    }

    // manipulation 5 - remove all chars between first index of char c and last index of char h
    public static String manipulation(String s, char c, char h) {
        int start_index = s.indexOf(c);
        int end_index = s.lastIndexOf(h);
        if (start_index < 1 || end_index < 1) {
            return s;
        }
        return manipulation(s, start_index, end_index);
    }

    // manipulation 6 - remove all char from start ... a 1
                                        // ("cuckoo", 'c', 2) => "ckoo"
    public static String manipulation(String s, char c, int i) {
        int count = 0;
        String result = s;
        for(int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == c) {
                count++;
            }
            if (count == i) {
                result = s.substring(j, s.length());
                return result;
            }
        }
        return result;
    }
}