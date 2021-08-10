package buttonandtextfield;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class ButtonAndTextFieldApplication extends Application {
 
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("button");
        TextField txt = new TextField();
        FlowPane fp = new FlowPane();
        fp.getChildren().add(btn);
        fp.getChildren().add(txt);
        Scene scene = new Scene(fp);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
}
