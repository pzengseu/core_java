package set;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new HashSet<>();
        long totalTime = 0;
        System.out.println("Test");
        FileInputStream file = new FileInputStream("/home/zp/javaProject/core_java/src/set/emma.txt");
        Scanner in = new Scanner(file);
        while(in.hasNext())
        {
            String word = in.next();
            System.out.println(word);
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for(int i = 1; i <= 20 && iter.hasNext(); i++)
            System.out.println(iter.next());
        System.out.println("...");
        System.out.println(words.size() + " distinct words " + totalTime + "milliseconds.");
    }
}
