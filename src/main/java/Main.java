import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage window){
        Button b1 = new Button("Enter new words");
        Button b2 = new Button("Practice");

        HBox hbox1 = new HBox(b1, b2);

        BorderPane borderpane1 = new BorderPane();

        borderpane1.setTop(hbox1);
        borderpane1.setCenter(enterWordScene.getlayout());
        borderpane1.setPrefSize(800,400);

        b2.setOnAction((event) -> {
                borderpane1.setCenter(practiceScene.getlayout());
        });

        b1.setOnAction((event) -> {
                borderpane1.setCenter(enterWordScene.getlayout());
        });

        Scene wordScene = new Scene(borderpane1);
        window.setScene(wordScene);

        window.show();
     }

    public static void main(String[] arg){
        launch();
    }

}
