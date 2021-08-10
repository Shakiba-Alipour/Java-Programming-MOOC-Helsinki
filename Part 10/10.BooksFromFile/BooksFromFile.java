 
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
 
public class BooksFromFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
 
    }
 
    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(part -> new Book(part[0], Integer.valueOf(part[1]), Integer.valueOf(part[2]), part[3]))
                    .forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
 
        return books;
    }
 
}
 
