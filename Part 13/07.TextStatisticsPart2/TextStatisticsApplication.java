package textstatistics;
 
import java.util.Arrays;
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
        TextArea area = new TextArea();
        layout.setCenter(area);
        HBox txt = new HBox();
        Label letters = new Label("Letters: 0");
        txt.getChildren().add(letters);
        Label wordCount = new Label("Words: 0");
        txt.getChildren().add(wordCount);
        Label longestWord = new Label("The longest word is:");
        txt.getChildren().add(longestWord);
        layout.setBottom(txt);
        
        area.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
 
            // set values of text elements
            letters.setText("Letters: " + characters);
            wordCount.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);
        });
        
        Scene s = new Scene(layout);
        primaryStage.setScene(s);
        primaryStage.show();
    }
}
 
