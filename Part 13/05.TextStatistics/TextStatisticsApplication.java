package textstatistics;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
public class TextStatisticsApplication extends Application {
 
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane layout = new BorderPane();
        layout.setCenter(new TextArea());
        HBox txt = new HBox();
        txt.getChildren().add(new Label("Letters: 0"));
        txt.getChildren().add(new Label("Words: 0"));
        txt.getChildren().add(new Label("The longest word is:"));
        layout.setBottom(txt);
        Scene s = new Scene(layout);
        primaryStage.setScene(s);
        primaryStage.show();
    }
 
}
 
