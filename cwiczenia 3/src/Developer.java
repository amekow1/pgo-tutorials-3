import java.util.ArrayList;
public class Developer extends Employee {
    private ArrayList<Technology>
            technologies=new ArrayList<>();

    public Developer(String firstName, String lastName, String address, String email, String pesel, int rokZatrudnienia) {
        super(firstName, lastName, address, email, pesel, rokZatrudnienia);

    }

    public int calculateSalary(int currentYear) {
        int baseSalary = super.calculateSalary(currentYear);
        return baseSalary;
    }


    public void addtechnologies(Technology t) {
        technologies.add(t);

    }
}
