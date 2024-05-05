
public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private String pesel;
    private int rokZatrudnienia;

    public Employee(String firstName, String lastName, String email, String pesel, String s, int rokZatrudnienia){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.pesel=pesel;
        this.rokZatrudnienia=rokZatrudnienia;
    }
    public int calculateSalary(int currentYear) {
        int baseSalary = 3000;
        int yearsWorked = currentYear - rokZatrudnienia;
        int salary = baseSalary + yearsWorked * 1000;
        return salary;
    }


}
