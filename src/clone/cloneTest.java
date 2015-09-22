package clone;

public class cloneTest {
    public static  void main(String[] args)
    {
        Employee original = new Employee("John Q.Public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = null;
        try {
            copy = original.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        copy.raiseSalary(10);
        copy.setHireDay(2033, 3, 3);
        System.out.println("original=" + original);
        System.out.println("copy=" + copy);
    }
}
