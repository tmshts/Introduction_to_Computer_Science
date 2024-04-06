import java.lang.Math;
import java.util.Scanner;


public class MethodOverload {

    public static void main(String [] args) {
        Scanner scanner_object = new Scanner(System.in);
        System.out.println("Enter shape for the area:");
        String input_shape = scanner_object.nextLine();
        String input_shape_toLowerCase = input_shape.toLowerCase();

        switch(input_shape_toLowerCase) {
            case "square":
                System.out.println("Enter a length of a side as Integer number:");
                try {
                    int input_integer = scanner_object.nextInt();
                    double result = area(input_integer);
                    System.out.println("Area: " + result);
                }
                catch (Exception e) {
                    System.out.println("Please enter Integer number");
                }
                break;
            case "rectangle":
                System.out.println("Enter the width of a side as First Integer number:");
                try {
                    int integer_1 = scanner_object.nextInt();
                    System.out.println("Enter the height of a side as Second Integer number:");

                    int integer_2 = scanner_object.nextInt();
                    double result = area(integer_1, integer_2);
                    System.out.println("Area: " + result);

                }
                catch (Exception e) {
                    System.out.println("Please enter Integer number");
                }
                break;
            case "triangle":
                System.out.println("Enter the base as Double number:");
                try {
                    double double_1 = scanner_object.nextDouble();
                    System.out.println("Enter the height as Integer number:");
                    try {
                        int integer_1 = scanner_object.nextInt();
                        double result = area(double_1, integer_1);
                        System.out.println("Area: " + result);
                    }
                    catch (Exception e) {
                        System.out.println("Please enter Integer number");
                    }
                }
                catch (Exception e) {
                    System.out.println("Please enter Double number");
                }
                break;
            case "circle":
                System.out.println("Enter a radius of the circle as Double number:");
                try {
                    double double_1 = scanner_object.nextDouble();
                    double result = area(double_1);
                    System.out.println("Area: " + result);
                }
                catch (Exception e) {
                    System.out.println("Please enter Double number");
                }
                break;
            case "ellipse":
                System.out.println("Enter the length of the major axis as Double number:");
                try {
                    double double_1 = scanner_object.nextDouble();
                    System.out.println("Enter the length of the minor axis Double number:");
                    double double_2 = scanner_object.nextDouble();
                    double result = area(double_1, double_2);
                    System.out.println("Area: " + result);
                }
                catch (Exception e) {
                    System.out.println("Please enter Double number");
                }
                break;
            default:
                System.out.println("Not a valid shape!");
                break;
        }
        scanner_object.close();
    }

    // square
    public static double area(int len) {
        return (double) (len*len);
    }

    // rectangle
    public static double area(int w, int h) {
        return (double) (w * h);
    }

    // triangle
    public static double area(double b, int h) {
        return (double) ((0.5) * b * h);
    }
    
    // circle
    public static double area(double r) {
        return (double) (Math.PI * (r * r));
    }

    // ellipse
    public static double area(double a, double b) {
        return (double) (Math.PI * a * b);
    }
}