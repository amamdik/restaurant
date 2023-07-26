package lk.ijse.restaurant.controller;

import javafx.event.ActionEvent;
import lk.ijse.restaurant.util.Navigation;


import java.io.IOException;

public class LoginFormController {
    public void loginOnAction(ActionEvent actionEvent) {
        try {
         Navigation.switchNavigation("DashboardForm.fxml",actionEvent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
