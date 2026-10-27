public class Developer extends Employee{
    private String programmingLanguage;


    Developer(String name, int salary, int bonus, String pl) {
        super(name, salary);
        this.programmingLanguage = pl;
    }
}