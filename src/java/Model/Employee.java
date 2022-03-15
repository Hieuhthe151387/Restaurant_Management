/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Employee extends People {
    private Date Dob;
    private String manager;
    private String role;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String ID, String name, boolean gender, Date Dob, String phoneNumber,String address,String role, 
            double salary, String manage,String account,String shortname) {
        super(ID, name, shortname, gender, address, phoneNumber, account);
        this.Dob = Dob;
        this.role = role;
        this.manager = manage;
        this.salary = salary;
    }
    
    public Employee(String ID, String name, boolean gender, Date Dob,String address, String phoneNumber,String role, double salary, String account) {
        super(ID, name, gender, address, phoneNumber, account);
        this.Dob = Dob;
        this.role = role;
        this.salary = salary;
    }
    
    public Employee(String ID, String name, boolean gender, Date Dob, String address, String phoneNumber,String role, double salary, String account,String manager) {
        super(ID, name, gender, address, phoneNumber, account);
        this.Dob = Dob;
        this.manager = manager;
        this.role = role;
        this.salary = salary;
    }
    
    public Date getDob() {
        return Dob;
    }
    
    public String getDoB(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(Dob);
    }
    
    public void setDob(Date Dob) {
        this.Dob = Dob;
    }
    public void setDob(String dob) {
        java.util.Date date;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = df.parse(dob);
            this.Dob = new Date(date.getTime());
        } catch (ParseException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setSalary(String salary) {
        this.salary = 1000000*Double.parseDouble(salary.split(" ")[0].trim());
    }
    
    
}