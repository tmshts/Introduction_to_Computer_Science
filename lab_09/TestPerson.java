import java.util.Scanner;

public class TestPerson {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input_Person_1_name = scan.nextLine();
        String input_Person_1_address = scan.nextLine();
        String input_Person_2_name = scan.nextLine();
        String input_Person_2_address = scan.nextLine();
        String input_Person_3_name = scan.nextLine();
        String input_Person_3_address = scan.nextLine();
    
        int number = 3;
        Person[] person_array = new Person[number];
    
        person_array[0] = new Person(input_Person_1_name, input_Person_1_address);
        person_array[1] = new Person(input_Person_2_name, input_Person_2_address);
        person_array[2] = new Person(input_Person_3_name, input_Person_3_address);
    
        System.out.println("Person 1 is called " + person_array[0].getName());
        System.out.println("They live in " + person_array[0].getAddress());
        System.out.println("Their PPS Number is " + person_array[0].getPpsNo());

        person_array[1].setName("Paul Smyth");
        person_array[1].setAddress("Dublin");

        for(int i = 0, i < number; i++) {
            person_array[i].showPerson();
        }

        System.out.println(person_array[2].toString());

    }
}
