public class Employee {
    private String name;
    private int salary;

    public void giveRaise(int raiseAmount) {
        this.applyRaise(salary + raiseAmount);
    }

    public void applyRaise(int newSalary) {
        salary = newSalary;
    }
}
