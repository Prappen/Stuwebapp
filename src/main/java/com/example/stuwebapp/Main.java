package com.example.stuwebapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Loggin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("studentwebapp");
        stage.setScene(scene);
        stage.show();
        databaseConnection db = new databaseConnection();
        databaseConnection.connect();
//test
    }

    public static void main(String[] args) {
        launch();
    }
}