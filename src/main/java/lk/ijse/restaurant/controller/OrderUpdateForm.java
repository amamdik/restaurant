package lk.ijse.restaurant.controller;

import com.jfoenix.controls.JFXButton;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class OrderUpdateForm {
    public Pane mainAnchorPane;
    public Button btnClose;

    public void btnCloseOnAction(ActionEvent actionEvent) {
        Stage window = (Stage) btnClose.getScene().getWindow();
        window.close();
    }
}

