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
public class Product {
    private String id;
    private String name;
    private int quantity;
    private double price;
    private double cost;

    public Product() {
    }

    public Product(String id, String name, int quantity, double price, double cost) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.cost = cost;
    }

    public Product(Product p){
        this.id = p.id;
        this.name = p.name;
        this.quantity = 1;
        this.price = p.price;
        this.cost = p.cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
    
    public String getprice(){
        return price/1000 +"k VNĐ";
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setPrice(String price) {
        if(price.matches("\\d+")){
            this.price = Double.parseDouble(price) * 1000;
        } else {
            this.price = Double.parseDouble(price.toLowerCase().trim().split("k")[0])*1000;
        }
    }

    public double getCost() {
        return cost;
    }
    
    public String getcost(){
        return cost/1000+"k VNĐ";
    }
    
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setCost(String cost){
        if(cost.matches("\\d+")){
            this.cost = Double.parseDouble(cost) * 1000;
        } else {
            this.cost = Double.parseDouble(cost.toLowerCase().trim().split("k")[0])*1000;
        }
    }
}