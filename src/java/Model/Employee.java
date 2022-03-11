/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    public Employee(String ID, String name, boolean gender,Date Dob, String address, String phoneNumber, String role, double salary, String account, String userName,String manager) {
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
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(Dob);
    }
    
    public void setDob(Date Dob) {
        this.Dob = Dob;
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
    
    
}