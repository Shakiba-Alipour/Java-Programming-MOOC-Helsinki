 
import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalDetails {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0,maxlength=0,ct=0;
        double avg=0;
        String max="";
        while(true){
            String input=scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] part=input.split(",");
            sum=sum+Integer.valueOf(part[1]);
            ct=ct+1;
            if(maxlength<part[0].length()){
                maxlength=part[0].length();
                max=part[0];
            }
        }
        if(ct!=0){
            avg=1.0*sum/ct;
        }
        System.out.println("Longest Name: "+max);
        System.out.println("Average of the birth years: "+avg);
    }
}
 
