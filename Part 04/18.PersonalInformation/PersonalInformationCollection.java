 
import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalInformationCollection {
 
    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
 
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String first=scanner.nextLine();
            if(first.isEmpty()){
                break;
            }
            String last=scanner.nextLine();
            String id=scanner.nextLine();
            PersonalInformation person=new PersonalInformation(first,last,id);
            System.out.println(first+" "+last);
        }
    }
}
 
