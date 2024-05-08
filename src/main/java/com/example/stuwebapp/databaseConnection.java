package com.example.stuwebapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseConnection {
    public static Connection conn = null;
    static Statement st = null;
    public Connection connect;


    public static void connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ltulibrarysql"; // Replace with your MySQL URL
        String username = ""; // Replace with your MySQL username
        String password = ""; // Replace with your MySQL password

        // Establishing the connection
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
