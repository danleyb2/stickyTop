package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;


public class Controller {
    public WindowLocationPoint wlp=new WindowLocationPoint();
    @FXML public Stage window;
    @FXML private ToolBar toolBar;

    public void newNote(ActionEvent actionEvent) {
        Window window=toolBar.getScene().getWindow();
        double x=window.getX();
        double w=window.getWidth();
        new Note((x>w)? x-w: x+w,window.getY());
    }

    @FXML private Button btnClose;
    public void deleteCloseNote(ActionEvent actionEvent) {

        Stage st=(Stage)btnClose.getScene().getWindow();
        st.close();

    }


    public void toolbarMousePressed(Event event) {

        window=(Stage)toolBar.getScene().getWindow();
        MouseEvent mouseEvent=((MouseEvent) event);

        wlp.setX(window.getX()- mouseEvent.getScreenX());
        wlp.setY(window.getY() - mouseEvent.getScreenY());
    }

    @FXML
    public void toolbarMouseDragged(Event event) {
        MouseEvent mouseEvent=((MouseEvent) event);

        window.setX(mouseEvent.getScreenX()+wlp.getX());
        window.setY(mouseEvent.getScreenY()+wlp.getY());

    }
}
