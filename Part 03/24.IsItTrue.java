
import java.util.Scanner;
 
public class IsItTrue {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a String:");
        String input=scanner.nextLine();
        if(!(input.equals("true"))){
            System.out.println("Try again!");
        } else{
            System.out.println("You got it right!");
        }
 
    }
}
 
