package application;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class MultipleViews extends Application {
 
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane border = new BorderPane();
        Label txt1 = new Label("First view!");
        Button btn1 = new Button("To the second view!");
        border.setTop(txt1);
        border.setCenter(btn1);
        Scene first = new Scene(border);
        VBox box = new VBox();
        Label txt2 = new Label("Second view!");
        Button btn2 = new Button("To the third view!");
        box.getChildren().addAll(btn2, txt2);
        Scene second = new Scene(box);
        GridPane grid = new GridPane();
        Label txt3 = new Label("Third view!");
        Button btn3 = new Button("To the first view!");
        grid.add(txt3, 0, 0);
        grid.add(btn3, 1, 1);
        Scene third = new Scene(grid);
        btn1.setOnAction((event) -> {
            primaryStage.setScene(second);
        });
        btn2.setOnAction((event) -> {
            primaryStage.setScene(third);
        });
        btn3.setOnAction((event) -> {
            primaryStage.setScene(first);
        });
        primaryStage.setScene(first);
        primaryStage.show();
    }
 
}
 
