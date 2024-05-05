import java.util.ArrayList;
public class Manager extends Employee {
    private ArrayList<Goal> goals= new ArrayList<>();

    public Manager(String firstName, String lastName, String address, String email, String pesel, int rokZatrudnienia) {
        super(firstName, lastName, address, email, pesel, rokZatrudnienia);

    }


    public int calculateSalary(int currentYear) {
        int baseSalary = super.calculateSalary(currentYear);
        return baseSalary;
    }
    public void addGoal(Goal goal){
        goals.add(goal);
    }
}

