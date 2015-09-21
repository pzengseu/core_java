package arrays;

import java.lang.reflect.*;
import java.util.*;

public class CopyOfTest {
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3};
        a = (int[])goodCopyof(a, 10);
        System.out.println(Arrays.toString(a));
        
        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[])goodCopyof(b, 10);
        System.out.println(Arrays.toString(b));
        
        System.out.println("The following call will generate an exception.");
        b = (String[])badCopyOf(b, 10);
    }

    private static Object[] badCopyOf(String[] b, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(b, 0, newArray, newLength, Math.min(b.length, newLength));
        return newArray;
    }

    private static Object goodCopyof(Object a, int newLength) {
        Class c1 = a.getClass();
        if(!c1.isArray()) return null;
        Class componentType = c1.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return  newArray;
    }
}
