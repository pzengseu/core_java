package zp.test;

public class ParamTest {
    public static void main(String[] args)
    {
        System.out.println("Test tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        System.out.println("\nTest tripleSalary:");
        Employee harry = new Employee("harry", 100000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        System.out.println("\nTest swap:");
        Employee mary = new Employee("Mary", 100000);
        Employee jack = new Employee("Jack", 100000);
        System.out.println("Before mary=" + mary.getName());
        System.out.println("Before jack=" + jack.getName());
        swap(mary, jack);
        System.out.println("After mary=" + mary.getName());
        System.out.println("After jack=" + jack.getName());
    }

    public static void swap(Employee x, Employee y)
    {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }

    public static void tripleValue(double percent)
    {
        percent = percent * 3;
        System.out.println("End of method: percent=" + percent);
    }

    public static void tripleSalary(Employee employee)
    {
        employee.raiseSalary(300);
        System.out.println("End of method: salary=" + employee.getSalary());
    }
}
