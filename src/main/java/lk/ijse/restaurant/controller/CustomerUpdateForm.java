package lk.ijse.restaurant.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CustomerUpdateForm {
    public Pane mainPane;
    public JFXButton btnClose;

    public void btnCloseOnAction(ActionEvent actionEvent) {
        Stage window = (Stage) btnClose.getScene().getWindow();
        window.close();
    }
}
