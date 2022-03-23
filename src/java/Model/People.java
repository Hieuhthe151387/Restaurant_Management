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
public class People{
    private String ID;
    private String name;
    private String shortname;
    private boolean gender;
    private String address;
    private String phoneNumber;
    private String account;
    public People() {
    }

    public People(String ID, String name, String shortname, boolean gender, String address, String phoneNumber, String account) {
        this.ID = ID;
        this.name = name;
        this.shortname = shortname;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.account = account;
    }
    
    public People(String ID, String name, boolean gender, String address, String phoneNumber, String account) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.account = account;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }
    public String getGender(){
        return gender?"Male":"Female";
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber!=null?phoneNumber:"Không có số";
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getShortname() {
        if(shortname==null){
            StringBuffer shortN = new StringBuffer();
            String[] arr = name.split("\\s++");
            shortN.append((gender?"Anh ":"Chị ")+arr[arr.length-1]);
            return shortN.toString();
        }
        return shortname;
    }
    
    public String getAddress(int i){
        String[] arr = this.address.split(",");
        if(arr.length<4){
            if(i<arr.length) return arr[i].trim();
            else return "";
        }
        return this.address.split(",")[i].trim();
    }
}
