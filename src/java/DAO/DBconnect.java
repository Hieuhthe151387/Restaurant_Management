/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DBconnect {
    private Connection con;

    public DBconnect() {
        try {
            String user = "sa";
            String pass = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=restaurantDB";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    public Connection getCon() {
        return con;
    }
    public boolean check_account(String account, String password){
        String query = "select * from accountTB where Account='"+account+"' AND Password='"+password+"'";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
//class demo {
//    public static void main(String[] args) {
//        DBconnect con = new DBconnect();
//        System.out.println(""+con.check_account("Admin", "Admin"));
//    }
//}