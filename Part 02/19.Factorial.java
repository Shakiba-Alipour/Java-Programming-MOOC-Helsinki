 
import java.util.Scanner;
 
public class Factorial {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num=Integer.valueOf(scanner.nextLine());
        int f=1;
        for(int i=2;i<=num;i++){
            f=f*i;
        }
        System.out.println("Factorial: "+f);
 
    }
}
 
