 
import java.util.Scanner;
 
public class MainProgram {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentCard PaulsCard=new PaymentCard(20);
        PaymentCard MattsCard=new PaymentCard(30);
        //Here you can write code to test that PaymentCard works as intended
        PaulsCard.eatHeartily();
        MattsCard.eatAffordably();
        System.out.println("Paul: "+PaulsCard.toString());
        System.out.println("Matt: "+MattsCard.toString());
        PaulsCard.addMoney(20);
        MattsCard.eatHeartily();
        System.out.println("Paul: "+PaulsCard.toString());
        System.out.println("Matt: "+MattsCard.toString());
        PaulsCard.eatAffordably();
        PaulsCard.eatAffordably();
        MattsCard.addMoney(50);
        System.out.println("Paul: "+PaulsCard.toString());
        System.out.println("Matt: "+MattsCard.toString());
        // be sure to erase the extra code for the last part of the exercise!
 
    }
}
 
