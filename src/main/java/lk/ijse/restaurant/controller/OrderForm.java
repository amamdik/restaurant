package lk.ijse.restaurant.controller;

import javafx.event.ActionEvent;
import lk.ijse.restaurant.util.Navigation;

import java.io.IOException;

public class OrderForm {
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

    public void btnAddOnAction(ActionEvent actionEvent) {
        try {
            Navigation.popupNavigation("OrderAddForm.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        try {
            Navigation.popupNavigation("OrderUpdateForm.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
