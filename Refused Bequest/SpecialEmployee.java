public class SpecialEmployee extends Employee {

    SpecialEmployee(String name, int salary){
        super(name, salary);
    }

    public void giveRaise(int raiseAmount) {
        super.setSalary(super.getSalary() + raiseAmount);
    }
}