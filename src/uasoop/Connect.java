/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasoop;

/**
 *
 * @author curut
 */
import java.sql.*;

public class Connect {
    private Statement st;
    private Connection con;

    public Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "password");
            st = con.createStatement(1004, 1008);
            System.out.println("Connection Successful");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection Error");
        }
    }

    public ResultSet executeQuery(String query) {
        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection Error");
        }
        return rs;
    }

    public void executeUpdate(String query) {
        try {
            st.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection Error");
        }
    }
}