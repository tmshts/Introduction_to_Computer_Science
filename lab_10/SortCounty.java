import java.util.Scanner;

public class SortCounty {
    
    public static void main(String[] args) {
        
        int number = 5;

        County[] data = new County[number];

        Scanner scan = new Scanner(System.in);

        String[] counties = new String[number];
        Float[] areas = new Float[number];
        int[] wins = new int[number];

        for(int i = 0; i < number; i++) {
            counties[i] = scan.nextLine();
            areas[i] = Float.parseFloat(scan.nextLine());
            wins[i] = Integer.parseInt(scan.nextLine());
        }

        for(int i = 0; i < number; i++) {
            data[i] = new County(counties[i], areas[i], wins[i]);
        }

        bubbleSortCounty(data);

        printCountyArray(data);
        
    }

    public static void printCountyArray(County data[]) {

        String[] array_to_print = new String[data.length];

        for(int i = 0; i < data.length; i++) {
            array_to_print[i] = data[i].toString();
        }
        
        for(int i = 0; i < data.length; i++) {
            System.out.println(array_to_print[i]);
        }
    }


    public static void bubbleSortCounty(County data[]) {
        for (int i = 1; i < data.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < data.length - i; j++) {
                if (data[j].getFootballWins() > data[j+1].getFootballWins()) {
                        County temp = data[j+1];
                        data[j+1] = data[j];
                        data[j] = temp;
                        isSorted = false;
                }
                /*
                else if(data[j].getFootballWins() < data[j+1].getFootballWins()) {
                    County temp[] = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                    isSorted = false;
                }
                */
            }
            if (isSorted) return;
        }
    }


}
