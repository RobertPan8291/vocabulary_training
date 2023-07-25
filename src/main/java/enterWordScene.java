import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;

public class enterWordScene {
    public static Node getlayout(){

        Button b3 = new Button("Add the word pair");

        Label l1 = new Label("French");
        Label l2 = new Label("English");

        TextField wordtext = new TextField();
        wordtext.setMaxWidth(200);

        TextField translationtext = new TextField();
        translationtext.setMaxWidth(200);


        VBox vbox1 = new VBox(10, l1, wordtext, l2, translationtext, b3);
        vbox1.setAlignment(Pos.CENTER);



        b3.setOnAction((event) ->{
            dictionary.addword(wordtext.getText(), translationtext.getText());
            wordtext.clear();
            translationtext.clear();
        });



        return vbox1;
    }

}
