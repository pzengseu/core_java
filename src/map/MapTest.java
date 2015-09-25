package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args)
    {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("a", new Employee("Adown"));
        staff.put("b", new Employee("Bob"));
        staff.put("c", new Employee("Cow"));
        staff.put("d", new Employee("down"));

        System.out.println(staff);
        staff.remove("b");
        staff.put("c", new Employee("cccc"));
        System.out.println(staff);
        System.out.println(staff.get("d"));

        for(Map.Entry<String, Employee> se : staff.entrySet())
        {
            String key = se.getKey();
            Employee e = se.getValue();
            System.out.println("key=" + key + ", value=" + e.getName());
        }
    }
}
