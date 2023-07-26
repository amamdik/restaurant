package lk.ijse.restaurant.controller;

import javafx.event.ActionEvent;
import lk.ijse.restaurant.util.Navigation;

import java.io.IOException;

public class StockForm {
    public void btnHomeOnAction(ActionEvent actionEvent) {
        try {
            Navigation.switchNavigation("DashboardForm.fxml",actionEvent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnCustomerOnAction(ActionEvent actionEvent) {
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

    public void btnAddOnAction(ActionEvent actionEvent) {
        try {
            Navigation.popupNavigation("StockAddForm.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        try {
            Navigation.popupNavigation("StockUpdateForm.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
