 
import java.util.ArrayList;
 
public class SimpleCollection {
 
    private String name;
    private ArrayList<String> elements;
 
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
 
    public void add(String element) {
        this.elements.add(element);
    }
 
    public ArrayList<String> getElements() {
        return this.elements;
    }
 
    public String toString() {
        String str = "";
        int c = 0;
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        if (elements.size() == 1) {
            str = str + elements.get(0);
            c = 1;
        } else {
            for (String element : elements) {
                str = str + element + "\n";
                c = c + 1;
            }
        }
        if (c == 1) {
            return "The collection " + this.name + " has " + c + " element:\n" + str;
        }
        return "The collection " + this.name + " has " + c + " elements:\n" + str;
    }
}
 
