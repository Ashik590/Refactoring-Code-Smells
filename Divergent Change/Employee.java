public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
