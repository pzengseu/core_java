package abstractClasses;

public class PersonTest {
    public static void main(String[] args)
    {
        Person[] persons = new Person[2];
        persons[0] = new Employee("zp", 3000000, 2018, 7, 1);
        persons[1] = new Student("Mary", "Chinese culture");

        for(Person p : persons)
        {
            System.out.printf("name= " + p.getName() + ", description= " + p.getDescription());
            System.out.println();
        }
    }
}
