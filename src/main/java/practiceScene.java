import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class practiceScene {
    public static Node getlayout(){
        Button b3 = new Button("Check");

        Label l1 = new Label("");
        Label l2 = new Label("");

        TextField practicetext = new TextField();
        practicetext.setMaxWidth(200);



        if(dictionary.isNotEmpty() == true){
            final String[] translation = {dictionary.getTranslation(dictionary.getRandomKey())};
            l1.setText("Translate the word: '" + translation[0] + "'");

            b3.setOnAction((event) ->{
                if(practicetext.getText().equals(dictionary.getKey(translation[0]))){
                    l2.setText("Correct!");
                }
                else{
                    l2.setText("Incorrect, the correct word is: '" + dictionary.getKey(translation[0]) + "'");
                }

                practicetext.clear();
                translation[0] = dictionary.getTranslation(dictionary.getRandomKey());
                l1.setText("Translate the word: '" + translation[0] + "'");
            });

        }
       else if(dictionary.isNotEmpty() == false){
            l1.setText("Please enter some words before starting to Practice: ");
        }


        VBox vbox1 = new VBox(10, l1,practicetext,b3,l2);
        vbox1.setAlignment(Pos.CENTER);


        return vbox1;
    }
}
