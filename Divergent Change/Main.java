public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ashik", 20000);
        SalaryManager sm = new SalaryManager();

        sm.applyRaise(employee, 5000);

        System.out.println(employee.getSalary());

        TaxCalculator tm = new TaxCalculator(0.3);

        System.out.println(tm.calculateTax(employee));

    }
}
