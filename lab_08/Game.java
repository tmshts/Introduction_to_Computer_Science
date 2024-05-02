public class Game {
    
    public static void main(String[] args) {

        Dice dice_1 = new Dice();
        Dice dice_2 = new Dice();
        Dice dice_3 = new Dice(12, 4);

        int result_numOfSides_1 = dice_1.getNumOfSides();

        int result_faceValue_2 = dice_2.getFaceValue();

        dice_3.setNumOfSides(8);

        dice_1.rollDice();
        dice_2.rollDice();
        dice_3.rollDice();
    }
}
