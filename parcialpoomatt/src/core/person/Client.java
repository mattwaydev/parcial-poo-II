/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.Order;
import core.Product;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author samuelnunez
 */
public class Client extends User {
    
    private ArrayList<Order> orders;

    public Client(int id, String name, String email, LocalDate registrationDate) {
        super(id, name, email, registrationDate);
        this.orders = new ArrayList<>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public boolean makeOrder(int i, LocalDate of) {
        Order order = new Order(i, of);
        if(!this.orders.contains(order)){
            this.orders.add(order);
            return true;
        }
        else return false;
    }

    public boolean addProductToOrder(int i, Product product, int i0) {
        for (Order order: this.orders){
            if(order.getId() == i){
                for(int k = 0; k < i0 ; k++){
                    order.addProduct(product);
                    return true;
                }  
                
            }
            else return false;
            
        }
        return false;
    }

    public void receiveOrder(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void confirmOrder(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cancelOrder(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object[] spentSentDelivered() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
