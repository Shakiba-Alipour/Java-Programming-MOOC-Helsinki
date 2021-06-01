
import java.util.Scanner;
 
public class FromWhereToWhere {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Write your program here
        System.out.println("Where to?");
        int two=Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int one=Integer.valueOf(scanner.nextLine());
        while(one<=two){
            System.out.println(one);
            one=one+1;
        }
        
    }
}
 
