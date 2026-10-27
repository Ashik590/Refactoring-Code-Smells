public class Employee {
    private String name;
    private Money salary;
    private Date hireDate;
    
    Employee(String name, Money salary, Date hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
}