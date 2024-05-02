
public class TestSquare {
    
    public static void main(String[] args) {


        int number = 4;
        Square [] array_squares = new Square[number];

        for(int i = 0; i < number; i++) {
            array_squares[i] = new Square();
        }

        array_squares[0].setLength(10);
        array_squares[2].setLength(10);

        for(int i = 0; i < number; i++) {
            System.out.println("Square " i + 1 + " has a side length of " + array_squares[i].getLength());
        }

        System.out.println("Square 1 has an area of " + array_squares[0].getArea());
        System.out.println("Square 2 has an area of " + array_squares[1].getArea());

        System.out.println(array_squares[2].toString());

    }
}
