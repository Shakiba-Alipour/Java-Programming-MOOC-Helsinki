package notifier;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class NotifierApplication extends Application {
    
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox layout = new VBox();
        TextField txt = new TextField();
        layout.getChildren().add(txt);
        Button btn = new Button("Update");
        layout.getChildren().add(btn);
        Label lb = new Label();
        layout.getChildren().add(lb);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb.setText(txt.getText());
            }
            
        });
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
 
