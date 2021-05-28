 
import java.util.Scanner;
 
public class GradesAndPoints {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int grade=Integer.valueOf(scan.nextLine());
        if(grade<0){
            System.out.println("impossible!");
        } else if(grade<=49){
            System.out.println("failed");
        } else if(grade<=59){
            System.out.println(1);
        } else if(grade<=69){
            System.out.println(2);
        } else if(grade<=79){
            System.out.println(3);
        } else if(grade<=89){
            System.out.println(4);
        } else if(grade<=100){
            System.out.println(5);
        } else{
            System.out.println("incredible!");
        }
 
    }
}
 
