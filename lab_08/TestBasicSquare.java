import java.util.Scanner;

public class TestBasicSquare {
    
    public static void main(String[] args) {

        BasicSquare square_1 = new BasicSquare();
        BasicSquare square_2 = new BasicSquare();
        BasicSquare square_3 = new BasicSquare();

        Scanner scan = new Scanner(System.in);

        int input_square_1 = scan.nextInt();
        int input_square_2 = scan.nextInt();
        int input_square_3 = scan.nextInt();

        scan.close();

        square_1.setLen(input_square_1);
        square_2.setLen(input_square_2);
        square_3.setLen(input_square_3);

        int result_len_1 = square_1.getLen()
        int result_len_2 = square_2.getLen()
        int result_len_3 = square_3.getLen()

        System.out.println("Square 1 has a side of length " + result_len_1);
        System.out.println("Square 2 has a side of length " + result_len_2);
        System.out.println("Square 3 has a side of length " + result_len_3);

        int result_perimeter_1 = square_1.getPerimeter();
        int result_perimeter_2 = square_2.getPerimeter();
        int result_perimeter_3 = square_3.getPerimeter();

        System.out.println("Square 1 has a perimeter of " + result_perimeter_1);
        System.out.println("Square 2 has a perimeter of " + result_perimeter_2);
        System.out.println("Square 3 has a perimeter of " + result_perimeter_3);

        int result_area_1 = square_1.getArea();
        int result_area_2 = square_2.getArea();
        int result_area_3 = square_3.getArea();

        System.out.println("Square 1 has an area of " + result_area_1);
        System.out.println("Square 2 has an area of " + result_area_2);
        System.out.println("Square 3 has an area of " + result_area_3);

    }
}
