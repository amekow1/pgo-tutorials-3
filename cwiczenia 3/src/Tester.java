import java.util.ArrayList;
public class Tester extends Employee {
    private ArrayList<String> testTypes;

    public Tester(String firstName, String lastName, String address, String email, String pesel, int hireYear) {
        super(firstName, lastName, address, email, pesel, hireYear);
        this.testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

}