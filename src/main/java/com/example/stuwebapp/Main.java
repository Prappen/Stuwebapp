//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.stuwebapp;

import java.io.IOException;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {
    public main() {
    }

    public void start(Stage stage) throws IOException, SQLException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("startPage.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load(), 600.0, 400.0);
        stage.setTitle("Ltu Library");
        stage.setScene(scene);
        stage.show();
        databaseConnection db = new databaseConnection();
        databaseConnection.connect();
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
}
