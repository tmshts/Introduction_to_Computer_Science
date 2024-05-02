
public class BasicSquare {
    
    private int len;

    public BasicSquare() {
        len = 1;
    }

    public BasicSquare(int input_len) {
        len = input_len;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int input_len) {
        len = input_len;
    }

    public int getPerimeter() {
        return len * 4;
    }

    public int getArea() {
        return len * len;
    }
}
