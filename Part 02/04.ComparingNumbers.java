 
import java.util.Scanner;
 
public class ComparingNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one=Integer.valueOf(scanner.nextLine());
        int two=Integer.valueOf(scanner.nextLine());
        if(one>two){
            System.out.println(one+" is greater than "+two);
        } else if(one<two){
            System.out.println(one+" is smaller than "+two);
        } else{
            System.out.println(one+" is equal to "+two);
        }
 
    }
}
 
