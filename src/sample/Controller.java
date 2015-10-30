package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    public void newNote(ActionEvent actionEvent) {
        //new Note(Main.STAGE);
        new Note();

    }

    @FXML private Button btnClose;
    public void deleteCloseNote(ActionEvent actionEvent) {

        Stage st=(Stage)btnClose.getScene().getWindow();
        st.close();



    }
}
