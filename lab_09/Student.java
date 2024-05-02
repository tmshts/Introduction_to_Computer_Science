public class Student {

    private String name;
    private String course;
    private int student_id;

    private static int counter = 1000;

    public Student () {
        name = "Tomas Hatas";
        course = "Intro";
        counter++;
        student_id = counter;
    }

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
        counter++;
        student_id = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getStudent_ID() {
        return student_id;
    }

    public void showStudent() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + student_id);
        System.out.println("---");
    }

}