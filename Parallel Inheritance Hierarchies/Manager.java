class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public void assignBonus(int bonusAmount) {
        bonus = bonusAmount;
    }
}