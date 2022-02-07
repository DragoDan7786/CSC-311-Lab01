module com.mycompany.lab_01 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab_01 to javafx.fxml;
    exports com.mycompany.lab_01;
}
