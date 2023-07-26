package lk.ijse.restaurant.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class EmployeeAddForm {
    public AnchorPane mainAnchorPane;
    public JFXButton btnClose;

    public void btnCloseOnAction(ActionEvent actionEvent) {
        Stage window = (Stage) btnClose.getScene().getWindow();
        window.close();
    }

}
