 
import java.util.Scanner;
 
public class LiquidContainers2 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        Container first = new Container();
        Container second = new Container();
 
        while (true) {
 
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
 
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
 
            if (command.equals("move") && amount > 0) {
                if (amount < first.contains()) {
                    second.add(amount);
                    first.remove(amount);
                } else {
                    second.add(first.contains());
                    first.setVolume(0);
                }
                if (second.contains() > 100) {
                    second.setVolume(100);
                }
            } else if (command.equals("add") && amount > 0) {
                first.add(amount);
                if (first.contains() > 100) {
                    first.setVolume(100);
                }
            } else if (command.equals("remove") && amount > 0) {
                second.remove(amount);
                if (second.contains() < 0) {
                    second.setVolume(0);
                }
            }
        }
    }
 
}
 
