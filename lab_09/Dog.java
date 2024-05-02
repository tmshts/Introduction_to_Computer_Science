public class Dog extends Animal {

    private int numDogBuiscuitsEaten;

    // default constructor
    public Dog() {
        super();
        numDogBuiscuitsEaten = 0;
    }

    // general constructor
    public Dog(String animalDiet, String animalSound) {
        super(animalDiet, animalSound);
        numDogBuiscuitsEaten = 0;
    }

    public int getBiscuitsEaten() {
        return numDogBuiscuitsEaten;
    }

    public void eatDogBiscuits() {
        numDogBuiscuitsEaten++;
    }

}
