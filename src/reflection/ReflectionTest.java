package reflection;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.*;
import java.lang.reflect.*;

public class ReflectionTest {
    public static void main(String[] args)
    {
        String name;
        if(args.length > 0) name = args[0];
        else {
//            Scanner in = new Scanner(System.in);
//            System.out.print("Enter class name (e.g java.util.Date): \n");
            name = "java.util.Date";
        }

        try
        {
            Class c1 = Class.forName(name);
            Class superc1 = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print("class:" + name);
            if(superc1 != null && superc1 != Object.class)
                System.out.print(" extends " + superc1.getName());

            System.out.print("\n{\n");
            printConstructors(c1);
            System.out.println();
            printMethods(c1);
            System.out.println();
            printFields(c1);
            System.out.println();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printConstructors(Class c1)
    {
        Constructor[] constructors = c1.getDeclaredConstructors();
        for(Constructor c : constructors)
        {
            String name = c.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");

            Class[] parmTypes = c.getParameterTypes();
            for(int j = 0; j < parmTypes.length; j++)
            {
                if(j > 0) System.out.print(", ");
                System.out.print(parmTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethods(Class c1)
    {
        Method[] methods = c1.getDeclaredMethods();
        for(Method m : methods)
        {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");

            Class[] paramTypes = m.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++)
            {
                if(j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printFields(Class c1)
    {
        Field[] fields = c1.getDeclaredFields();

        for(Field f : fields)
        {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
