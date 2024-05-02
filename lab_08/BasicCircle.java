import java.lang.Math.*;

public class BasicCircle {
 
    private int radius;

    public BasicCircle() {
        radius = 1;
    }

    public BasicCircle(int input_radius) {
        radius = input_radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int input_radius) {
        radius = input_radius;
    }

    public double getCircumference() {
        double circumference = (2 * Math.PI * radius);
        double result = Math.round(circumference * 100.0) / 100.0;
        return result;
    }

    public double getArea() {
        double area = (radius * radius) * Math.PI;
        double result = Math.round(area * 100.0) / 100.0;
        return result;
    }
}