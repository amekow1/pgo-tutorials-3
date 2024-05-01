import java.util.ArrayList;
public class Manager extends Employee {
    private ArrayList<Goal> goals;

    public Manager(String firstName, String lastName, String address, String email, String pesel, int hireYear) {
        super(firstName, lastName, address, email, pesel, hireYear);
        this.goals = goals;
    }


    public int calculateSalary(int currentYear) {
        int baseSalary = super.calculateSalary(currentYear);
        return baseSalary;
    }
}

