import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class
 
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String name=scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            int d=Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name,d));
        }
        System.out.println("Program's maximum duration?");
        int max=Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram p: programs){
            if(p.getDuration()<=max){
                System.out.println(p.toString());
            }
        }
    }
}
 
