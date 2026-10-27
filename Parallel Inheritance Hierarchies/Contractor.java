class Contractor extends Worker {
    private int hourlyRate;

    public Contractor(String name, int hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    public void increaseHourlyRate(int increment) {
        hourlyRate += increment;
    }
}