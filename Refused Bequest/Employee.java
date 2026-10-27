public class Employee {
    private String name;
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
