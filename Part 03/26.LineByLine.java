 
import java.util.Scanner;
 
public class LineByLine {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!(str.equals(""))) {
            split(str);
            str = scanner.nextLine();
        }
    }
 
    public static void split(String str) {
        String[] part = str.split(" ");
        for (int i = 0; i < part.length; i++) {
            System.out.println(part[i]);
        }
    }
}
 
