 
import java.nio.file.Paths;
import java.util.Scanner;
 
public class RecordsFromAFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file=scanner.nextLine();
        try(Scanner check=new Scanner(Paths.get(file))){
            while(check.hasNextLine()){
                String line=check.nextLine();
                String[] part=line.split(",");
                String name=part[0];
                int age=Integer.valueOf(part[1]);
                System.out.print(name+", age: "+age);
                if(age==1){
                    System.out.println(" year");
                } else{
                    System.out.println(" years");
                }
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
 
