 
import java.nio.file.Paths;
import java.util.Scanner;
 
public class NumbersFromAFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ct=0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try(Scanner check=new Scanner(Paths.get(file))){
            while(check.hasNextLine()){
                int num =Integer.valueOf(check.nextLine());
                if(num>=lowerBound&&num<=upperBound){
                    ct=ct+1;
                }
            }
            System.out.println("Numbers: "+ct);
        }
        catch(Exception e){
                    System.out.println("Error: "+e.getMessage());
        }
    }
 
}
 
