import java.util.Scanner;
import BasicCircle;

public class TestBasicCircle {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        int input_circle_1 = scan.nextInt();
        int input_circle_2 = scan.nextInt();
        int input_circle_3 = scan.nextInt();

        scan.close();

        BasicCircle circle_1 = new BasicCircle(input_circle_1);
        BasicCircle circle_2 = new BasicCircle(input_circle_2);
        BasicCircle circle_3 = new BasicCircle(input_circle_3);

        int result_radius_1 = circle_1.getRadius();
        int result_radius_2 = circle_2.getRadius();
        int result_radius_3 = circle_3.getRadius();

        double result_circumference_1 = circle_1.getCircumference();
        double result_circumference_2 = circle_2.getCircumference();
        double result_circumference_3 = circle_3.getCircumference();

        double result_area_1 = circle_1.getArea();
        double result_area_2 = circle_2.getArea();
        double result_area_3 = circle_3.getArea();

        System.out.println("Circle 1 has a radius of " + result_radius_1);
        System.out.println("Circle 2 has a radius of " + result_radius_2);
        System.out.println("Circle 3 has a radius of " + result_radius_3);

        System.out.println("Circle 1 has a circumference of " + result_circumference_1);
        System.out.println("Circle 2 has a circumference of " + result_circumference_2);
        System.out.println("Circle 3 has a circumference of " + result_circumference_3);

        System.out.println("Circle 1 has an area of " + result_area_1);
        System.out.println("Circle 2 has an area of " + result_area_2);
        System.out.println("Circle 3 has an area of " + result_area_3);

    }
}