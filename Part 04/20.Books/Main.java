import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while(true){
            String name=scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            int page=Integer.valueOf(scanner.nextLine());
            int pub=Integer.valueOf(scanner.nextLine());
            books.add(new Book(name,page,pub));
        }
        System.out.println("What information will be printed? ");
        String ans=scanner.nextLine();
        if(ans.equals("everything")){
            for(Book book: books){
                System.out.println(book.toString());
            }
        } else if(ans.equals("name")){
            for(Book book: books){
                System.out.println(book.title);
            }
        }
 
    }
}
 
