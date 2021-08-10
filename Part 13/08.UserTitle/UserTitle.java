package title;
 
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
 
public class UserTitle extends Application {
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Type the title: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        primaryStage.setTitle(title);
        primaryStage.show();
    }
 
}
 
