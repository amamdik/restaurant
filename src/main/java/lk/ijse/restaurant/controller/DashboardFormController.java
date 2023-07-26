package lk.ijse.restaurant.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import lk.ijse.restaurant.util.Navigation;

import java.io.IOException;

public class DashboardFormController {
    public static Pane MainPane;

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        try {
            Navigation.switchNavigation("CustomerForm.fxml",actionEvent);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void btnEmployeeOnAction(ActionEvent actionEvent) {
        try {
            Navigation.switchNavigation("EmployeeForm.fxml",actionEvent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnOrderOnAction(ActionEvent actionEvent) {
        try {
            Navigation.switchNavigation("OrderForm.fxml",actionEvent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnPaymentOnAction(ActionEvent actionEvent) {
        try {
            Navigation.switchNavigation("PaymentForm.fxml",actionEvent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnSalaryOnAction(ActionEvent actionEvent) {
        try {
            Navigation.switchNavigation("SalaryForm.fxml",actionEvent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnStockOnAction(ActionEvent actionEvent) {
        try {
            Navigation.switchNavigation("StockForm.fxml",actionEvent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnHomeOnAction(ActionEvent actionEvent) {
    }

    public void btnHomeOnAction1(ActionEvent actionEvent) {
    }

    public void btnOrdersOnAction(ActionEvent actionEvent) {

    }



    private void setUi(String URI) throws IOException {

    }

    public void btnAddOnAction(ActionEvent actionEvent) {
        try {
            Navigation.switchNavigation("EmployeeAddForm.fxml",actionEvent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        try {
            Navigation.switchNavigation("EmployeeUpdateForm.fxml",actionEvent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
