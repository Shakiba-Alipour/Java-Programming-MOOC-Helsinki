 
import java.nio.file.Paths;
import java.util.Scanner;
 
public class PrintingAFile {
 
    public static void main(String[] args){
        try(Scanner file=new Scanner(Paths.get("data.txt"))){
            while(file.hasNextLine()){
                String row=file.nextLine();
                System.out.println(row);
            }
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
 
