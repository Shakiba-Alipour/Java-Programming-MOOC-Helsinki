 
import java.util.Scanner;
 
public class NameOfTheOldest {
 
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        String old="0";
        String str=scanner.nextLine();
        while(!(str.equals(""))){
            String[] part=str.split(",");
            if(max<Integer.valueOf(part[1])){
                max=Integer.valueOf(part[1]);
                old=part[0];
            }
            str=scanner.nextLine();
        }
        System.out.println("Name of the oldest: "+old);
    }
}
 
