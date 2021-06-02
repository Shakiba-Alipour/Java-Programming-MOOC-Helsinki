 
import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfAList {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        int sum=0;
        for(int i=0;;i++){
            int num=Integer.valueOf(scanner.nextLine());
            if(num==-1){
                break;
            }
            list.add(num);
            sum=sum+num;
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        double avg=1.0*sum/list.size();
        System.out.println("Average: "+avg);
        
    }
}
 
