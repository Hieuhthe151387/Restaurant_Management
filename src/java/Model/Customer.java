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
public class Customer extends People{
    private int Age;
    
    public Customer() {
        super();
    }

    public Customer( String ID, String name, int Age,boolean gender, String address, String phoneNumber, String account) {
        super(ID, name, gender, address, phoneNumber, account);
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    
}
