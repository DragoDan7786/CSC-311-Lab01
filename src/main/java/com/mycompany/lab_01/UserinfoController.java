
package com.mycompany.lab_01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;


public class UserinfoController implements Initializable {
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    @FXML
    private TextField textFieldFirst;
    @FXML
    private TextField textFieldLast;
    
    private void showFullName(){
        String name = textFieldFirst.getText() + " " + textFieldLast.getText();
        Alert b = new Alert(AlertType.INFORMATION);
        b.setContentText(name);
        b.show();
    }
    
    
    
}
