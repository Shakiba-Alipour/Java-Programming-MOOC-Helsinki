 
import java.util.Scanner;
 
public class AgeOfTheOldest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        String str=scanner.nextLine();
        while(!(str.equals(""))){
            String[] part=str.split(",");
            if(max<Integer.valueOf(part[1])){
                max=Integer.valueOf(part[1]);
            }
            str=scanner.nextLine();
        }
        System.out.println("Age of the oldest: "+max);
    }
}
 
