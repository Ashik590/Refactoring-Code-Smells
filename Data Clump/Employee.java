public class Employee {
    private String name;
    private ContactInfo info;
    private String department;
    private int salary;

    Employee(String name, ContactInfo info, String department, int salary) {
        this.name = name;
        this.info = info;
        this.department = department;
        this.salary = salary;
    }

    public void updateEmployee(String name, ContactInfo info, String department, int salary) {
        this.name = name;
        this.info = info;
        this.department = department;
        this.salary = salary;
    }
}
