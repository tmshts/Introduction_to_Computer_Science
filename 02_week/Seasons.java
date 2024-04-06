import java.util.Scanner;


public class Seasons{

    public static void main (String[] args) {
        printSeason();
    }

    public static void printSeason() {
        Scanner scanner_object = new Scanner(System.in); 
        System.out.println("Enter single integer between 1 and 12");
        try {
            Integer month_input = scanner_object.nextInt();
            String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            String[] season = {"Winter", "Winter", "Spring", "Spring", "Spring", "Summer", "Summer", "Summer", "Autumn", "Autumn", "Autumn", "Winter"};
    
            if (month_input <= 0 || month_input > 12) {
                System.out.println("Enter single integer between 1 and 12.");
            }
            else {
                for(int i=0; i<=month.length; i++) {
                    if (i==month_input-1) {
                        System.out.println(month[i] + " is in " + season[i]);
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("Enter single integer between 1 and 12.");
        }

        scanner_object.close();

    }
}