import java.util.Random;

public class Dice {
    
    private int numOfSides;
    private int faceValue;

    Random rn = new Random();

    public Dice() {
        numOfSides = 6;

        int number = rn.nextInt(6) + 1;
        faceValue = number;
    }

    public Dice(int input_numOfSides, int input_faceValue) {
        numOfSides = input_numOfSides;
        faceValue = input_faceValue;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setNumOfSides(int input_numOfSides) {
        numOfSides = input_numOfSides;
    }

    public int rollDice() {
        int number = rn.nextInt(numOfSides) + 1;
        return number;
    }
}
