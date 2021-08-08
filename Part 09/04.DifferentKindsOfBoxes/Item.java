 
import java.util.Objects;
 
public class Item {
 
    private String name;
    private int weight;
 
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
 
    public Item(String name) {
        this(name, 0);
    }
 
    public String getName() {
        return name;
    }
 
    public int getWeight() {
        return weight;
    }
 
    public boolean equals(Item other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass() != other.getClass()) {
            return false;
        }
        Item object = (Item) other;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
 
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }
}
 
