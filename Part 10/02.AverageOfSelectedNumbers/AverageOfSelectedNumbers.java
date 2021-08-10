 
import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfSelectedNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<String> values = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            values.add(input);
        }
        System.out.println("Print the average of the negative numbers or the "
                            + "positive numbers? (n/p)");
        String sign = scanner.nextLine();
        double average = 0.0;
        
        if (sign.equals("n")) {
            average = values.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number < 0)
                        .average()
                        .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else {
            average = values.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number > 0)
                        .average()
                        .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
    }
}
 
