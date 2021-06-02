 
import java.util.Scanner;
 
public class Login {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username=scanner.nextLine();
        String password=scanner.nextLine();
        check(username,password);
    }
    
    public static void check(String username,String password){
        if(username.equals("alex")){
            if(password.equals("sunshine")){
                System.out.println("You have successfully logged in!");
            } else{
                System.out.println("Incorrect username or password!");
            }
        } else if(username.equals("emma")){
            if(password.equals("haskell")){
                System.out.println("You have successfully logged in!");
            } else{
                System.out.println("Incorrect username or password!");
            }
        } else{
             System.out.println("Incorrect username or password!");
        }
    }
}
 
