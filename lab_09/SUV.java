public class SUV extends Vehicle{

    private String wheelDrive;

    public SUV() {
        super();
        wheelDrive = "front";
    }
    
    public SUV(int doors, String brand, String wheelDrive) {
        super(doors, brand);
        this.wheelDrive = wheelDrive
    }


    public String getDrive() {
        return wheelDrive;
    }

    public void setDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
    }

}
