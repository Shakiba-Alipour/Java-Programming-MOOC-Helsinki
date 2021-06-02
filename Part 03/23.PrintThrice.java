
import java.util.Scanner;
 
public class PrintThrice {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Write your program here
        System.out.println("Give a word:");
        String input=scanner.nextLine();
        System.out.println(input+input+input);
    }
}
