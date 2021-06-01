 
import java.util.Scanner;
 
public class Counting {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.valueOf(scanner.nextLine());
        int ct=0;
        while(ct<=num){
            System.out.println(ct);
            ct=ct+1;
        }
 
    }
}
