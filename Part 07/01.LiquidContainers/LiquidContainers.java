
import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0, second = 0;
        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] part = input.split(" ");
            if (part[0].equals("add") && Integer.valueOf(part[1]) > 0) {
                first += Integer.valueOf(part[1]);
                if (first > 100) {
                    first = 100;
                }
            } else if (part[0].equals("move") && Integer.valueOf(part[1]) > 0) {
                if (first > 0) {
                    if (first - Integer.valueOf(part[1]) < 0) {
                        second = first;
                        first = 0;
                    } else {
                        first -= Integer.valueOf(part[1]);
                        second += Integer.valueOf(part[1]);
                    }
                    if (second > 100) {
                        second = 100;
                    }
                }
            } else if (part[0].equals("remove") && Integer.valueOf(part[1]) > 0) {
                second -= Integer.valueOf(part[1]);
                if (second < 0) {
                    second = 0;
                }
            }
        }
    }
 
}
 
