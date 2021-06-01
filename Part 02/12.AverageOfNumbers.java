 
import java.util.Scanner;
 
public class AverageOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ct=0;
        double avg=0;
        while(true){
            System.out.println("Give a number:");
            int num=Integer.valueOf(scanner.nextLine());
            if(num==0){
                break;
            }
            ct=ct+1;
            avg=avg+num;
        }
        avg=avg/ct;
        System.out.println("Average of the numbers: "+avg);
 
    }
}
 
