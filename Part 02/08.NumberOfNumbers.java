
import java.util.Scanner;
 
public class NumberOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ct=0;
        while(true){
            System.out.println("Give a number:");
            int num=Integer.valueOf(scanner.nextLine());
            if(num==0){
                break;
            }
            ct=ct+1;
        }
        System.out.println("Number of numbers: "+ct);
 
    }
}
 
