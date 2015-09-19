package zp.test;

public class StaticTest {

    public static void main(String[] args) {
        Employee[] staffs = new Employee[3];
        staffs[0] = new Employee("Mary", 80000);
        staffs[1] = new Employee("Jack", 70000);
        staffs[2] = new Employee("zp", 100000000);

        for(Employee e:staffs){
            e.setId();
            System.out.printf("name = " + e.getName() + ", salary = " + e.getSalary() +
                ", id = " + e.getId());
            System.out.println();
        }

        System.out.println("Next available id is " + Employee.getNextId());
    }
}

class Employee
{
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setId(){
        id = nextId;
        nextId ++;
    }

    public int getId() {
        return id;
    }

    public static int getNextId()
    {
        return nextId;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}