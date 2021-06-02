 
import java.util.ArrayList;
import java.util.Scanner;
 
public class IndexOfSmallest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;;i++){
            int number=Integer.valueOf(scanner.nextLine());
            if(number==9999){
                break;
            }
            list.add(number);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int min=9999,index=0;
        for(int i=0;i<list.size();i++){
            if(min>list.get(i)){
                min=list.get(i);
                index=i;
            }
        }
        System.out.println("Smallest number: "+min);
        for(int i=index;i<list.size();i++){
            if(min==list.get(i)){
                System.out.println("Found at index: "+i);
            }
        }
        
    }
}
 
