import java.util.HashMap;
import java.util.Scanner;

public class AsciiDifference {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String string_1 = new String();
        String string_2 = new String();

        string_1 = scan.nextLine();
        string_2 = scan.nextLine();
        scan.close();

        int result = difference(string_1, string_2);
        System.out.println(result);

    }

    public static int difference(String s1, String s2) {

        HashMap<Character, Integer> asciiTable = new HashMap<Character, Integer>();


        asciiTable.put(' ', 32);
        asciiTable.put('!', 33);
        asciiTable.put('"', 34);
        asciiTable.put('#', 35);
        asciiTable.put('$', 36);
        asciiTable.put('%', 37);
        asciiTable.put('&', 38);
        asciiTable.put('\'', 39);
        asciiTable.put('(', 40);
        asciiTable.put(')', 41);
        asciiTable.put('*', 42);
        asciiTable.put('+', 43);
        asciiTable.put(',', 44);
        asciiTable.put('-', 45);
        asciiTable.put('.', 46);
        asciiTable.put('/', 47);
        asciiTable.put('0', 48);
        asciiTable.put('1', 49);
        asciiTable.put('2', 50);
        asciiTable.put('3', 51);
        asciiTable.put('4', 52);
        asciiTable.put('5', 53);
        asciiTable.put('6', 54);
        asciiTable.put('7', 55);
        asciiTable.put('8', 56);
        asciiTable.put('9', 57);
        asciiTable.put(':', 58);
        asciiTable.put(';', 59);
        asciiTable.put('<', 60);
        asciiTable.put('=', 61);
        asciiTable.put('>', 62);
        asciiTable.put('?', 63);
        asciiTable.put('@', 64);
        asciiTable.put('A', 65);
        asciiTable.put('B', 66);
        asciiTable.put('C', 67);
        asciiTable.put('D', 68);
        asciiTable.put('E', 69);
        asciiTable.put('F', 70);
        asciiTable.put('G', 71);
        asciiTable.put('H', 72);
        asciiTable.put('I', 73);
        asciiTable.put('J', 74);
        asciiTable.put('K', 75);
        asciiTable.put('L', 76);
        asciiTable.put('M', 77);
        asciiTable.put('N', 78);
        asciiTable.put('O', 79);
        asciiTable.put('P', 80);
        asciiTable.put('Q', 81);
        asciiTable.put('R', 82);
        asciiTable.put('S', 83);
        asciiTable.put('T', 84);
        asciiTable.put('U', 85);
        asciiTable.put('V', 86);
        asciiTable.put('W', 87);
        asciiTable.put('X', 88);
        asciiTable.put('Y', 89);
        asciiTable.put('Z', 90);
        asciiTable.put('a', 97);
        asciiTable.put('b', 98);
        asciiTable.put('c', 99);
        asciiTable.put('d', 100);
        asciiTable.put('e', 101);
        asciiTable.put('f', 102);
        asciiTable.put('g', 103);
        asciiTable.put('h', 104);
        asciiTable.put('i', 105);
        asciiTable.put('j', 106);
        asciiTable.put('k', 107);
        asciiTable.put('l', 108);
        asciiTable.put('m', 109);
        asciiTable.put('n', 110);
        asciiTable.put('o', 111);
        asciiTable.put('p', 112);
        asciiTable.put('q', 113);
        asciiTable.put('r', 114);
        asciiTable.put('s', 115);
        asciiTable.put('t', 116);
        asciiTable.put('u', 117);
        asciiTable.put('v', 118);
        asciiTable.put('w', 119);
        asciiTable.put('x', 120);
        asciiTable.put('y', 121);
        asciiTable.put('z', 122);
        asciiTable.put('{', 123);
        asciiTable.put('|', 124);
        asciiTable.put('}', 125);
        asciiTable.put('~', 126);

        
        int sum_1 = 0;
        for(int a = 0; a < s1.length(); a++) {
            sum_1 = sum_1 + asciiTable.get(s1.charAt(a));
        }
    

        int sum_2 = 0;
        for(int a = 0; a < s2.length(); a++) {
            sum_2 = sum_2 + asciiTable.get(s2.charAt(a));
        }

        int difference = sum_1 - sum_2;

        return difference;
    }
}