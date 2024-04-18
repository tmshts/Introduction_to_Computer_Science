import java.util.Scanner;
import java.util.HashMap;

public class Alphabetical {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String result = bubbleSort(input);
        System.out.println(result);
    }

    public static String bubbleSort(String input) {

        HashMap<Character, Integer> alpha = new HashMap<Character, Integer>();

        alpha.put('a', 1);
        alpha.put('b', 2);
        alpha.put('c', 3);
        alpha.put('d', 4);
        alpha.put('e', 5);
        alpha.put('f', 6);
        alpha.put('g', 7);
        alpha.put('h', 8);
        alpha.put('i', 9);
        alpha.put('j', 10);
        alpha.put('k', 11);
        alpha.put('l', 12);
        alpha.put('m', 13);
        alpha.put('n', 14);
        alpha.put('o', 15);
        alpha.put('p', 16);
        alpha.put('q', 17);
        alpha.put('r', 18);
        alpha.put('s', 19);
        alpha.put('t', 20);
        alpha.put('u', 21);
        alpha.put('v', 22);
        alpha.put('w', 23);
        alpha.put('x', 24);
        alpha.put('y', 25);
        alpha.put('z', 26);

        int limit = input.length();

        for (int i = 0; i < input.length(); i++) {
            limit--;
            for (int j = 0; j < limit; j++) {
                if (alpha.get(input.charAt(j)) > alpha.get(input.charAt(j+1))) {
                    input = input.substring(0, j)+input.charAt(j+1)+input.charAt(j)+input.substring(j+2);
                }
            }
        }
        
        return input;
    }
}