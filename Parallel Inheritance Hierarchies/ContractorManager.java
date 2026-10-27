class ContractorManager extends Contractor {
    private int bonus;

    public ContractorManager(String name, int hourlyRate) {
        super(name, hourlyRate);
    }

    public void assignBonus(int bonusAmount) {
        bonus = bonusAmount;
    }
}