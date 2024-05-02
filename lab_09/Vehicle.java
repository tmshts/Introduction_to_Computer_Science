public class Vehicle {
    
    private int noOfDoors;
    private String brand;

    public Vehicle() {
        System.out.println("Default Constructor of the Super class called");
        noOfDoors = 5;
        brand = "undefined";
    }

    public Vehicle(int doors, String brand) {
        System.out.println("General Constructor of Vehicle called");
        noOfDoors = doors;
        this.brand = brand;
    }

    public void setNoOfDoors(int doors) {
        noOfDoors = doors;
    }

    public void setBrand(String x) {
        brand = x;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public void printDetails() {
        System.out.println(noOfDoors);
        System.out.println(brand);
    }
}
