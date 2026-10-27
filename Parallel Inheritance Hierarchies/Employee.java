class Employee extends Worker {
    private int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public void giveRaise(int raiseAmount) {
        salary += raiseAmount;
    }
}