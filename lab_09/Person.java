public class Person {

    private String name;
    private String address;
    private int ppsNo;

    private static int counter = 1001;

    public Person() {
        setName("");
        setAddress("");
        this.ppsNo = counter++;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.ppsNo = counter++;;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public int getPpsNo() {
        return ppsNo;
    }

    public void showPerson() {
        System.out.println("*****PERSONAL DETAILS*****");
        System.out.println("NAME: " + name);
        System.out.println("ADDRESS: " + address);
        System.out.println("PPS NUMBER: " + ppsNo);
    }

    public String toString() {
        String details = "NAME: " + name;
        details += "\nADDRESS: " + address;
        details += "\nPPS NUMBER: " + ppsNo;
        return details;
    }
}
