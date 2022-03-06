/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class Employee extends People {
    private String manager;
    private String role;
    private double salary;

    public Employee() {
    }

    public Employee(String ID, String name, boolean gender, String address, String phoneNumber,String role, double salary, String account) {
        super(ID, name, gender, address, phoneNumber, account);
        this.role = role;
        this.salary = salary;
    }
    
    public Employee(String ID, String name, boolean gender, String address, String phoneNumber,String role, double salary, String account,String manager) {
        super(ID, name, gender, address, phoneNumber, account);
        this.manager = manager;
        this.role = role;
        this.salary = salary;
    }

    public Employee(String ID, String name, boolean gender, String address, String phoneNumber, String role, double salary, String account, String password, String userName,String manager) {
        super(ID, name, gender, address, phoneNumber, account, password, userName);
        this.manager = manager;
        this.role = role;
        this.salary = salary;
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
