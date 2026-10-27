
public class Manager extends Employee{
    private int bonus;

    Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
}