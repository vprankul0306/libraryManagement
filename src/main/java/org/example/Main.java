package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class Main {

    private static Connection connect() {
        // Connect to the database
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/LibraryDB";
            String user = "root"; // Your database user
            String password = ""; // Your database password
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        JFrame jframe = new JFrame("Library Management");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(600, 600);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JButton addBookBtn = new JButton("1. Add a book");
        JButton searchBookBtn = new JButton("2. Search book");
        JButton deleteBookBtn = new JButton("3. Delete a book");
        JButton editBookBtn = new JButton("4. Edit a book");

        mainPanel.add(addBookBtn);
        mainPanel.add(searchBookBtn);
        mainPanel.add(deleteBookBtn);
        mainPanel.add(editBookBtn);

        jframe.add(mainPanel);


        jframe.setVisible(true);
    }
}