/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ListProduct {
    private ArrayList<Product> list;

    public ListProduct() {
        list = new ArrayList<Product>();
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public Product getProductById(String pid){
        for(Product p : list){
            if(p.getId().equals(pid)) {
                Product newp = new Product(p);
                newp.setQuantity(1);
                return newp;
            }
        }
        return null;
    }
}
