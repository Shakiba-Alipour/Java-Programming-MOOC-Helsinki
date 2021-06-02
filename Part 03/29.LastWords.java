 
import java.util.Scanner;
 
public class LastWords {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        while(!(str.equals(""))){
            first(str);
            str=scanner.nextLine();
        }
    }
    
    public static void first(String str){
        String[] part=str.split(" ");
        System.out.println(part[part.length-1]);
    }
}
 
