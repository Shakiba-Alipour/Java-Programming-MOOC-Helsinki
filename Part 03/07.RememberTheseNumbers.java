 
import java.util.ArrayList;
import java.util.Scanner;
 
public class RememberTheseNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }
 
            numbers.add(luku);
        }
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
    }
}
 
