 
import java.util.Scanner;
 
public class AVClub {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        while(!(str.equals(""))){
            avclub(str);
            str=scanner.nextLine();
        }
    }
    
    public static void avclub(String str){
        String[] part=str.split(" ");
        for(int i=0;i<part.length;i++){
            if(part[i].contains("av")){
                System.out.println(part[i]);
            }
        }
    }
}
 
