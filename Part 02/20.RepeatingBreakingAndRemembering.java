
import java.util.Scanner;
 
public class RepeatingBreakingAndRemembering {
 
    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum=0,even=0,odd=0,ct=0;
        double avg;
        while(true){
            int num=Integer.valueOf(scanner.nextLine());
            if(num==-1){
                break;
            }
            ct=ct+1;
            if(num%2==0){
                even=even+1;
            } else{
                odd=odd+1;
            }
            sum=sum+num;
        }
        avg=(1.0*sum)/ct;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+ct);
        System.out.println("Average: "+avg);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
 
    }
}
 
