public class Horse extends Animal{
    
    private int speed;

    // default constructor
    public Horse() {
        super();
        speed = 35;
    }

    // general constructor
    public Horse(String animalDiet, String animalSound, int speed) {
        super(animalDiet, animalSound);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
