 
import java.util.Scanner;
 
public class CarryOn {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Carry on?");
            String input=scanner.nextLine();
            if(input.equals("no")){
                break;
            }
        }
 
    }
}
 
