package treeSet;

public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    public String getDescription() {
        return description;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public Item(String description, int partNumber) {

        this.description = description;
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (partNumber != item.partNumber) return false;
        return description.equals(item.description);

    }

    @Override
    public int hashCode() {
        int result = description.hashCode();
        result = 31 * result + partNumber;
        return result;
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(partNumber, o.partNumber);
    }
}
