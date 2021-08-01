
import java.nio.file.Paths;
import java.util.Scanner;
 
public class PrintingASpecifiedFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try(Scanner file=new Scanner(Paths.get(str))){
            while(file.hasNextLine()){
                String row=file.nextLine();
                System.out.println(row);
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
 
