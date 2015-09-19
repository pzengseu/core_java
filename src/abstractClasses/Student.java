package abstractClasses;

public class Student extends Person{
    private String major;

    public Student(String n, String m) {
        super(n);
        major = m;
    }

    @Override
    public String getDescription() {
        return "a Stuednt majoring in " + major;
    }
}
