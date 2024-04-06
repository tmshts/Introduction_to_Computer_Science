import java.util.Scanner;

public class poker {

    static String input;
    static String[] string_array;
    static int cards = 5;
    static String card_tripple = new String();
    static String card_pair = new String();
    static int count_pair = 0;
    static int count_tripple = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 0;
        string_array = new String[5];

        while (i < cards) {
            input = scan.nextLine();
            string_array[i] = input;
            i++;
        }
        scan.close();

        fullHouseCheck(string_array);

        if (count_tripple == 3 && count_pair == 2 ) {
            System.out.println("Full House");
        }
        else {
            System.out.println("Not a full house");
        }

    }

    public static void fullHouseCheck(String[] string_array) {

        int k = 0;
        int b = 0;
        int count = 0;


        // K B C B K
        // check tripple
        for (int j = 0; j < cards; j++) {
            while (k < cards) {
                if (string_array[j].equals(string_array[k])) {
                    count = count + 1;
                }
                k++;
            }
            if (count == 3) {
                count_tripple = count;
                card_tripple = string_array[j];
            }
            if (count == 2) { // && !string_array[j].equals(card_tripple)) {
                count_pair = count;
                card_pair = string_array[j];
                //System.out.println("in");
            }
            k = 0;
            count = 0;
        }

        //count = 0;
        /*
        // K B C B K
        // check pairs
        for (int j = 0; j < cards; j++) {
            while (k < cards) {
                if (string_array[j].equals(string_array[k])) {
                    count = count + 1;
                }
                k++;
            }
            if (count == 2 && !string_array[j].equals(card_tripple)) {
                count_pair = count;
                card_pair = string_array[j];
                System.out.println("in");
            }
            k = 0;
            count = 0;
        }
        */


        System.out.println("count_tripple");
        System.out.println(count_tripple);
        System.out.println("card_tripple");
        System.out.println(card_tripple);

        System.out.println("count_pair");
        System.out.println(count_pair);
        System.out.println("card_pair");
        System.out.println(card_pair);


    }
}
