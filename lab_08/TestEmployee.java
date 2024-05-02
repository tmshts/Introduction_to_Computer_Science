
public class TestEmployee {
    
    public static void main(String[] args) {

        Employee employee_1 = new Employee("Tom Daly", "Teacher", 45000);
        Employee employee_2 = new Employee("Mary Murphy", "Developer", 30000);
        Employee employee_3 = new Employee();

        System.out.println("Employee " + employee_2.getEmployeeID() + " is called " + employee_2.getName());
        System.out.println("They are a " + employee_2.getJobTitle());
        System.out.println("Their salary is " + employee_2.getSalary());
        System.out.println("Their Employee ID number is " + employee_2.getEmployeeID());

        employee_3.setName("Michael Higgins");
        employee_3.setJobTitle("President");
        employee_3.setSalary(1000);

        employee_1.showEmp();
        employee_2.showEmp();
        employee_3.showEmp();

        String result_employee_1 = employee_1.toString();
        System.out.println(result_employee_1);
    }
}
