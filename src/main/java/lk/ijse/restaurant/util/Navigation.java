package lk.ijse.restaurant.util;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lk.ijse.restaurant.controller.DashboardFormController;

import java.io.IOException;
import java.net.URL;

public class Navigation {

    private static Stage stage;
    private static Scene scene;

    public static void switchNavigation(String link, ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Navigation.class.getResource("/view/"+link));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void switchNavigation(String link, MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(Navigation.class.getResource("/view/"+link));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    public static void popupNavigation(String link) throws IOException {
        URL resource = Navigation.class.getResource("/view/" + link);
        Parent parent = FXMLLoader.load(resource);
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();
    }



}