public class Square {

    private int length;

    public Square() {
        length = 1;
    }

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea() {
        return length * length;
    }

    public String toString() {
        String length_string = "LENGTH: ";
        String number_string = String.valueOf(length);
        String combined = length_string + number_string;
        return combined;
    }
}