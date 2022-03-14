/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Account;
import Model.Employee;
import java.sql.Connection;
import java.util.Date;
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
    public Employee getEmployeeById(String id){
        String query = "select * from EmployeesTB where EmployeeId="+id;// get Employee by account have been check
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
                em.setShortname(rs.getString("Shortname"));
            }
        } catch (Exception e) {
        }
        return em;
    }
    public String getNewId(int status){
            String query1 = "SELECT MAX(EmployeeId) As LastId FROM EmployeesTB";
            String query2 = "SELECT MAX(product_id) As LastId FROM Product";
            String query3 = "Select MAX(CustID) As LastId from CustomersTB";
            String query;
            String id=null;
            switch(status){
                case 1: query = query1;
                        break;
                case 2: query = query2;
                        break;
                case 3: query = query3;
                        break;
                default: return null;
            }
            try {
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
                id=rs.getString("LastId");
            }
        } catch (Exception e) {
        }
            String digit = id.substring(2);
            StringBuffer newid = new StringBuffer(id.substring(0, 2));

            int i= Integer.parseInt(digit);
            i++;
            newid = newid.append((i<10?"0"+i:i+""));
        return newid.toString();
    }
        public void addEmployee(Employee e){
//                    (ID,Name,gender,Dob,Phone,address,role,Salary,Shortname)
            String insert1="Insert into EmployeesTB values(?,?,?,'"+e.getDoB()+"',?,?,?,?,null,null,?)";
//            String insert="Insert into EmployeesTB values('EM04',N'Hoàng Văn Khuê',0,'2001-01-02','0123459876',N'Trạch Xá, Hoà Lâm, Ứng Hoà, Hà Nội',N'Phục vụ',6000000,null,null,N'Khuê')";
        try {
            PreparedStatement statement = con.prepareStatement(insert1);
            statement.setString(1,e.getID());
            statement.setString(2,e.getName());
            statement.setBoolean(3,e.isGender());
            statement.setString(4,e.getPhoneNumber());
            statement.setString(5,e.getAddress());
            statement.setString(6,e.getRole());
            statement.setDouble(7,e.getSalary());
            statement.setString(8,e.getShortname());
             statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        public void updateEmployee(Employee e){
            String update ="UPDATE EmployeesTB SET EmployeeName = ?,Gender=?, Dob=?," +
            "PhoneNumber =?,[Address]=?,[Role]=?,Salary= ?,ManagerID=null,Account=null," +
            "ShortName=? WHERE EmployeeId=?" ;
             try {
            PreparedStatement statement = con.prepareStatement(update);
            statement.setString(1,e.getName());
            statement.setBoolean(2,e.isGender());
            statement.setString(3,e.getPhoneNumber());
            statement.setString(4,e.getAddress());
            statement.setString(5,e.getRole());
            statement.setDouble(6,e.getSalary());
            statement.setString(7,e.getShortname());
            statement.setString(8,e.getID());
             statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    public ArrayList<Employee> getListEmployees(){
        ArrayList<Employee> list = new ArrayList<>();
        String query = "SELECT * FROM EmployeesTB";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {                
                Employee em = new Employee();
                em.setID(rs.getString("EmployeeId"));
                em.setName(rs.getString("EmployeeName"));
                em.setGender(rs.getByte("Gender")==1);
                em.setDob(rs.getDate("Dob"));
                em.setPhoneNumber(rs.getString("PhoneNumber"));
                em.setAddress(rs.getString("Address"));
                em.setRole(rs.getString("Role"));
                em.setSalary(rs.getDouble("Salary"));
                em.setShortname(rs.getString("Shortname"));
                list.add(em);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
class demo {
    public static void main(String[] args) {
        DBconnect con = new DBconnect();
//        for(Employee e : con.getListEmployees()){
//        System.out.println(e.getID()+" "+e.getName()+" "
//                + e.getGender()
//                + " "
//                + e.getDoB()
//                + " "
//                + e.getPhoneNumber()
//                + " "
//                + " "
//                + e.getRole()+" "
//                        + e.getAddress()
//                        + " "
//                        +(e.getSalary()/1000000+" "));
//        }
        System.out.println(con.getNewId(1));
        System.out.println(con.getNewId(2));
        System.out.println(con.getNewId(3));
        con.updateEmployee(new Employee());
    }
}