import java.util.HashMap;

public class Surnames {

    private static HashMap<Character, Integer> alpha;
    private static String[] split;
    
    public static void main(String args[]) {
        // DO NOT CHANGE THE ARRAY DECLARATION
        String names[]={"Vicky Violet", "Uppy Umbrella", "Dippy Duck", "Annie Apple", "Oscar Orange", "Eddie Elephant"};

        alpha = new HashMap<Character, Integer>();

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

        bubbleSort_1(names);

        for(int i = 0; i < names.length; i++) {
            if(i == names.length - 1) {
                System.out.print(names[i]);
            }
            else {
                System.out.print(names[i] + ", ");
            }
        }
        System.out.println();


    }

    public static void bubbleSort_1(String[] names) {
        for (int i = 1; i < names.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < names.length - i; j++) {
                if(alpha.get(names[j].split(" ")[1].toLowerCase().charAt(0)) > alpha.get(names[j + 1].split(" ")[1].toLowerCase().charAt(0))) {
                        String temp = names[j + 1];
                        names[j + 1] = names[j];
                        names[j] = temp;
                        isSorted = false;
                }
                if(alpha.get(names[j].split(" ")[1].toLowerCase().charAt(0)) == alpha.get(names[j + 1].split(" ")[1].toLowerCase().charAt(0))) {
                    if(alpha.get(names[j].split(" ")[1].toLowerCase().charAt(1)) > alpha.get(names[j + 1].split(" ")[1].toLowerCase().charAt(1))) {
                        String temp = names[j + 1];
                        names[j + 1] = names[j];
                        names[j] = temp;
                        isSorted = false;
                    }
                    if(alpha.get(names[j].split(" ")[1].toLowerCase().charAt(1)) == alpha.get(names[j + 1].split(" ")[1].toLowerCase().charAt(1))) {
                        if(alpha.get(names[j].split(" ")[1].toLowerCase().charAt(2)) > alpha.get(names[j + 1].split(" ")[1].toLowerCase().charAt(2))) {
                            String temp = names[j + 1];
                            names[j + 1] = names[j];
                            names[j] = temp;
                            isSorted = false;
                        }
                    }
                }
            }
            if (isSorted) return;
        }
    }
}