 
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
 
public class LimitedNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input < 0) {
                break;
            }
            list.add(input);
        }
        list.stream()
                .filter(value -> value > 0 && value < 6)
                .forEach(value -> System.out.println(value));
    }
}
 
