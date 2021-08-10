 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
 
public class AverageOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<String> values = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            values.add(input);
        }
        
        double average = values.stream()
                       .mapToInt(s -> Integer.valueOf(s))
                       .average()
                       .getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}
 
