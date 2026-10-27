public class SalaryManager {
    public void applyRaise(Employee employee,double raiseAmount) {
        employee.setSalary(employee.getSalary() + raiseAmount);
    }
}

