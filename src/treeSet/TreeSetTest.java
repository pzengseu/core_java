package treeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args)
    {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Bob", 23));
        parts.add(new Item("Aod", 45));
        parts.add(new Item("Jack", 12));
        System.out.println(parts);

        SortedSet<Item> sortedByDescription = new TreeSet<>(
                new Comparator<Item>() {
                    @Override
                    public int compare(Item o1, Item o2) {
                        return o1.getDescription().compareTo(o2.getDescription());
                    }
                }
        );

        sortedByDescription.addAll(parts);
        System.out.println(sortedByDescription);
    }
}
