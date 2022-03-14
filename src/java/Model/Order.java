/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author Admin
 */
public class Order {
    private String id;
    private Date date;
    private ArrayList<Product> orderdetail;
    private String custid;
    private String emid;
    private double total;
    private double benefit;
    private int status; 
    public Order() {
        orderdetail=new ArrayList<>();
    }

    public Order(String id, Date date, ArrayList<Product> orderdetail, String custid, String emid) {
        this.id = id;
        this.date = date;
        this.orderdetail = orderdetail;
        this.custid = custid;
        this.emid = emid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getEmid() {
        return emid;
    }

    public void setEmid(String emid) {
        this.emid = emid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getBenefit() {
        return benefit;
    }

    public void setBenefit(double benefit) {
        this.benefit = benefit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setOrderdetail(ArrayList<Product> orderdetail) {
        this.orderdetail = orderdetail;
    }

    
    public ArrayList<Product> getOrderdetail() {
        return orderdetail;
    }
    
//    --------------------------------------------------------------------------
    public boolean isEmpty(){
        return orderdetail.isEmpty();
    }
    
    public Product getProduct(String id){
        for (Product product : orderdetail) {
            if(product.getId().equals(id)) return new Product(product);
        }
        return null;
    }
    
   // ADD PRODUCT INTO CART/ this method receive an product and add to cart 
    public void addProduct(Product p){
        // if product had existed in the cart else add p t cart 
        if(getProduct(p.getId())!=null){
            Product i = getProduct(p.getId());
            i.setQuantity(i.getQuantity()+p.getQuantity());
        } else orderdetail.add(p);
    }
    public int getQuantity(String id){
        return getProduct(id).getQuantity();
    }
        public void removeProduct(String id){
        if(getProduct(id)!=null) orderdetail.remove(getProduct(id));
    }
    
    public double gettotal(){
        double t=0;
        for(Product p: orderdetail){
            t += p.getPrice()*p.getQuantity();
        }
        total = t;
        return t;
    }
    
}
