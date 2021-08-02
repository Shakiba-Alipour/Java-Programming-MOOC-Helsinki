 
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Grades list = new Grades();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        double avg = list.average();
        System.out.println("Point average (all): " + avg);
        double validavg = list.validavg();
        if (validavg != -1) {
            System.out.println("Point average (passing): " + validavg);
        } else {
            System.out.println("Point average (passing): -");
        }
        double pass = list.passPercentage();
        System.out.println("Pass percentage: " + pass);
        list.distribution();
    }
}
 
