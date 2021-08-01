 
import java.util.Scanner;
 
public class NumberOfStrings {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ct=0;
        while(true){
            String str=scanner.nextLine();
            if(str.equals("end")){
                break;
            }
            ct=ct+1;
        }
        System.out.println(ct);
    }
}
 
