package com.mycompany.lab_01;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField textFieldMessage;

    @FXML
    private void showMessage() {
        //System.out.println("Button Was Pressed");
        Alert a = new Alert(AlertType.INFORMATION);
        //a.setContentText("Show Message Button Pressed");
        String msg = textFieldMessage.getText();
        a.setContentText(msg);
        a.show();
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void switchToUserInfo() throws IOException {
        App.setRoot("userinfo");
    }
}
