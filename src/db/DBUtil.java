/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class DBUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/resepmakanan";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        try {
            // Paksa load MySQL JDBC Driver secara eksplisit
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver MySQL tidak ditemukan!", e);
        }

        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}