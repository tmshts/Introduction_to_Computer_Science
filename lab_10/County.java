
public class County {
    
    private String name;
    private float area;
    private int footballWins;

    // default constructor
    public County() {
        name = "undefinded";
        area = 0f;
        footballWins = 0;
    }

    // general constructor
    public County(String name, float area, int footballWins) {
        this.name = name;
        this.area = area;
        this.footballWins = footballWins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getFootballWins() {
        return footballWins;
    }

    public void setFootballWins(int footballWins) {
        this.footballWins = footballWins;
    }

    public String toString() {
        String details = "County Name: " + getName();
        details += "\nCounty Area: " + getArea();
        details += "\nFootball Wins: " + getFootballWins();
        return details;
    }
}
