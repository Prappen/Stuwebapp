module com.example.stuwebapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stuwebapp to javafx.fxml;
    exports com.example.stuwebapp;
}