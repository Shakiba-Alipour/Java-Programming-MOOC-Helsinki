 
import java.util.Scanner;
 
public class DoubleInput {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // write your program here
        System.out.println("Give a number:");
        double value=Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number "+value);
 
    }
}
 
