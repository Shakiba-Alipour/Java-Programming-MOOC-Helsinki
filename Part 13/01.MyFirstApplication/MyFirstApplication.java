package myFirstApplication;
 
import javafx.application.Application;
import javafx.stage.Stage;
 
public class MyFirstApplication extends Application {
 
    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My first application");
        primaryStage.show();
    }
 
}
