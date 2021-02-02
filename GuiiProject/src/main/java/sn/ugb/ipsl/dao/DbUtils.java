/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DbUtils {
    private static Connection connection;

    public static Connection getConnection() throws Exception {
        if (connection == null) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipsl?useSSL=false", "root", "passer");

        }
        return connection;
    }

    public static void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }
   
}
