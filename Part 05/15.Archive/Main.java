 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String n = scanner.nextLine();
            if (n.isEmpty()) {
                break;
            }
            Item it = new Item(id, n);
            if (!items.contains(it)) {
                items.add(it);
            }
        }
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).toString());
        }
    }
}
 
