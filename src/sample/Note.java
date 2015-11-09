package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by brian on 10/30/15
 * at 10 : 47 ,
 * working on StickyNotes.
 */
public class Note {

    public Note(double posX,double posY) {
        try {
            Stage stage=new Stage();
            stage.setX(posX);
            stage.setY(posY);
            new Main().start(stage);
        }catch (Exception e){

        }

    }

    public Note(Stage stage){


    }
    public void createNote(){

    }
    public void updateNote(){

    }
    public void deleteNote(){

    }
}
