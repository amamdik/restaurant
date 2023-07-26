package lk.ijse.restaurant.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class OrderAddForm {
    public AnchorPane mainAnchorPane;
    public JFXButton btnClose;

    public void btnCloseOnAction(ActionEvent actionEvent) {
        Stage window = (Stage) btnClose.getScene().getWindow();
        window.close();
    }
}
