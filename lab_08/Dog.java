public class Dog {

    private String name;
    private String breed;
    private int age;
    private int licenceNo;
    private boolean isDangerous;

    private static int lastLicenceNo = 1000;

    public Dog() {
        name = "Peter";
        breed = "Shepherd";
        age = 1;
        isDangerous = false;
        lastLicenceNo++;
        licenceNo = lastLicenceNo;
    }

    public Dog(String name, String breed, int age, boolean isDangerous) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isDangerous = isDangerous;
        lastLicenceNo++;
        licenceNo = lastLicenceNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsDangerous() {
        return isDangerous;
    }

    public void setIsDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public int getLicenceNo() {
        return licenceNo;
    }

    public void bark() {
        System.out.println(getName() + " has Licence number " + getLicenceNo() + " and says Woof! Woof! Woof!");
    }
}
