import java.lang.Math.*;


public class Employee {
    
    private String name;
    private String jobTitle;
    private float salary;
    private int employeeID;

    private static int lastEmployeeID = 1000;


    public Employee() {
        name = "Tomas Hatas";
        jobTitle = "Manager";
        salary = 50000f;
        lastEmployeeID++;

        employeeID = lastEmployeeID;
    }

    public Employee(String input_name, String input_jobTitle, float input_salary) {
        name = input_name;
        jobTitle = input_jobTitle;
        salary = input_salary;

        lastEmployeeID++;
        employeeID = lastEmployeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String input_name) {
        name = input_name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String input_jobTitle) {
        jobTitle = input_jobTitle;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float input_salary) {

        if(input_salary < 19000f) {
            salary = 19000f;
            System.out.println("Entered salary of " + input_salary + " is too low. Salary set at minimum wage of 19000.0");
        }
        else {
            salary = input_salary;
        }
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void showEmp() {
        System.out.println("EMPLOYEE RECORD");
        String details = "NAME: " + getName();
        details += "\nJOB TITLE: " + getJobTitle();
        details += "\nCURRENT SALARY: " + getSalary();
        details += "\nEMPLOYEE ID: " + getEmployeeID();
        System.out.println(details);
    }

    public String toString() {
        String details = "NAME: " + getName();
        details += "\nJOB TITLE: " + getJobTitle();
        details += "\nCURRENT SALARY: " + getSalary();
        details += "\nEMPLOYEE ID: " + getEmployeeID();
        return details;
    }
}
