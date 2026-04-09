/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.person.Client;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author mateocarrascal
 */
public class Order {
    
    private int id;
    private Client client;
    private LocalDate date;
    private Status status;
    private ArrayList<Product> products;

    public Order(int id, Client client, LocalDate date, Status status, ArrayList<Product> products) {
        this.id = id;
        this.client = client;
        this.date = date;
        this.status = status;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getDate() {
        return date;
    }

    public Status getStatus() {
        return status;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
            
    
    
}
