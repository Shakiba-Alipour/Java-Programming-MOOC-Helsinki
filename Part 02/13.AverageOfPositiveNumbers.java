
import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ct = 0;
        double avg = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0) {
                ct = ct + 1;
                avg = avg + num;
            }
        }
        if (ct == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            avg = avg / ct;
            System.out.println(avg);
        }
 
    }
}
 
