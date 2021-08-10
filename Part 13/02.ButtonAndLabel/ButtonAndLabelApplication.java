package buttonandlabel;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class ButtonAndLabelApplication extends Application {
 
    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("button");
        Label lb = new Label("label");
        FlowPane flowpane = new FlowPane();
        flowpane.getChildren().add(lb);
        flowpane.getChildren().add(btn);
        Scene scene = new Scene(flowpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
}
 
