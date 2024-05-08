module com.example.stuwebapp {
    requires javafx.controls;
    requires javafx.fxml;   
    requires java.sql;


    opens com.example.stuwebapp to javafx.fxml;
    exports com.example.stuwebapp;
}