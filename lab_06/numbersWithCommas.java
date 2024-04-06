import java.util.Scanner;

public class numbersWithCommas {
    

    public static void main(String[] args) {

        int input = 0;
        Scanner scan = new Scanner(System.in);

        try {
            input = scan.nextInt();
        }
        catch (Exception e) {
            System.out.println("Please enter integer");
            System.exit(1);
        }
        scan.close();

        String result = commaNumbers(input);
        System.out.println(result);
    }

    public static String commaNumbers(int number) {

        // base case
        if (number < 1000) {
            // convert int to String
            char[] integer_array = String.valueOf(number).toCharArray();
            String integer_array_string = new String(integer_array);
            return integer_array_string;
        }

        // recursive step
        else {
            int tousand = 0;
            // to get tousand
            tousand = number % 1000;
            // e.g. 43000 || 1000 -> tousand is 0 -> handle this case with if
            if (tousand == 0) {
                String zero = new String("000");
                int rest = number / 1000;
                return commaNumbers(rest) + "," + zero;
            }
            // e.g. 43002 || 1002 -> tousand is 02 -> handle this case with if
            if (tousand <= 9 && tousand > 0) {
                String zero = new String("00");
                int rest = number / 1000;
                return commaNumbers(rest) + "," + zero + tousand;
            }
            // e.g. 43022 || 1022 -> tousand is 22 -> handle this case with if
            if (tousand <= 99 && tousand > 9) {
                String zero = new String("0");
                int rest = number / 1000;
                return commaNumbers(rest) + "," + zero + tousand;
            }
            // e. g. 1345
            int rest = number / 1000;
            return commaNumbers(rest) + "," + tousand;
        }
    }
}
