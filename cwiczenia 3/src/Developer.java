import java.util.ArrayList;
public class Developer extends Employee {
    private ArrayList<Technology> technologies;

    public Developer(String firstName, String lastName, String address, String email, String pesel, int hireYear) {
        super(firstName, lastName, address, email, pesel, hireYear);
        this.technologies = technologies;
    }

    public int calculateSalary(int currentYear) {
        int baseSalary = super.calculateSalary(currentYear);
        return baseSalary;
    }
}
