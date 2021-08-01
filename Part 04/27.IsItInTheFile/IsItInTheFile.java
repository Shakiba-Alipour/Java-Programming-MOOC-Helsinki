 
import java.nio.file.Paths;
import java.util.Scanner;
 
public class IsItInTheFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
 
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
 
        int sw = 0;
        try (Scanner checkFile = new Scanner(Paths.get(file))) {
            while (checkFile.hasNextLine()) {
                if (searchedFor.equals(checkFile.nextLine())) {
                    System.out.println("Found!");
                    sw = 1;
                    break;
                }
            }
            if (sw == 0) {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Error" + "Reading the file " + file + " failed.");
        }
    }
}
 
