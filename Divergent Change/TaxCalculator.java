public class TaxCalculator {
    private double taxRate;

    TaxCalculator(double taxRate){
        this.taxRate = taxRate;
    }

    public double calculateTax(Employee employee){
        return taxRate * employee.getSalary();
    }
}
