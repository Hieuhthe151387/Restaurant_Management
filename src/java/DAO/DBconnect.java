/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Account;
import Model.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
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
    public Account getAccount(String account, String password){
        String query = "select * from accountTB where Account='"+account+"' AND Password='"+password+"'";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
                Account a = new Account();
                a.setUsername(rs.getString("Account"));
                a.setPassword(rs.getString("Password"));
                a.setAuthority(rs.getInt("Authority"));
                a.setName(rs.getString("Username"));
                return a;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Employee getEmployee(String account){
        String query = "select * from EmployeesTB where Account='"+account+"'";// get Employee by account have been check
        Employee em = new Employee();
        try {
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {                
                em.setID(rs.getString("EmployeeId"));
                em.setName(rs.getString("EmployeeName"));
                em.setGender(rs.getByte("Gender")==1);
                em.setDob(rs.getDate("Dob"));
                em.setPhoneNumber(rs.getString("PhoneNumber"));
                em.setAddress(rs.getString("Address"));
                em.setRole(rs.getString("Role"));
                em.setSalary(rs.getDouble("Salary"));
            }
        } catch (Exception e) {
        }
        return em;
    }
    public ArrayList<Employee> getListEmployees(){
        ArrayList<Employee> list = new ArrayList<>();
        
        return list;
    }
}
class demo {
    public static void main(String[] args) {
        DBconnect con = new DBconnect();
        System.out.println(""+(con.getAccount("Mod","Mod")!=null));
    }
}