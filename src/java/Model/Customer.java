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
    private int AgeRange;
    
    public Customer() {
        super();
    }

    public Customer( String ID, String name, int AgeRange,boolean gender, String address, String phoneNumber, String account) {
        super(ID, name, gender, address, phoneNumber, account);
        this.AgeRange = AgeRange;
    }

    public Customer( String ID, String name,int AgeRange, boolean gender, String address, String phoneNumber, String account, String password, String userName) {
        super(ID, name, gender, address, phoneNumber, account, password, userName);
        this.AgeRange = AgeRange;
    }
    
    public int getAgeRange() {
        return AgeRange;
    }
    public void setAgeRange(int AgeRange) {
        this.AgeRange = AgeRange;
    }
}
