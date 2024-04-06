import java.util.Scanner;

public class LinearSearch2 {

    static int count = 0;
    public static void main (String args[]){
        String words[][] = {{"cat", "dog", "dUck"}, {"rabbit", "hen", "duCK"}, {"dUcK", "DucK", "goose"}};
        Scanner scanner_object = new Scanner(System.in);
        System.out.println("Enter searched string:");
        String input = scanner_object.nextLine();
        String input_lowerCase = input.toLowerCase();
        Integer result = countStrings(words, input_lowerCase);
        if (result == 0) {
            System.out.println(input + " was NOT found in the array");
        }
        else {
            System.out.println(input + " is contained " + result + " times in the array");
        }
        scanner_object.close();
    }

    public static int countStrings(String[][] input_array, String input) {
        for (int i = 0; i < input_array.length; i++) {
            for (int j = 0; j < input_array[0].length; j++) {
                if (input_array[i][j].toLowerCase().equals(input)) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
