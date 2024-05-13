package com.example.stuwebapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {
    static Connection conn = null;

    public static void connect() throws SQLException {
        if (conn != null) {
            return; // Already connected
        }
        String url = "jdbc:mysql://localhost:3306/ltulibrarysql";
        String username = "root";
        String password = "Lösenord";

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
            throw e;
        }
    }

    public static Connection getConnection() {
        return conn;
    }
}
