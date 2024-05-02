public class Car extends Vehicle {

    private boolean sportsModel;

    public Car() {
        super(5, "Tesla"),
        sportsModel = false;
    }

    public Car(int doors, String brand, boolean sportsModel) {
        super(doors, brand),
        this.sportsModel = sportsModel;
    }

    public void setSportsModel(boolean sports) {
        sportsModel = sports;
    }

    public boolean isSportsModel() {
        return sportsModel;
    }




}
