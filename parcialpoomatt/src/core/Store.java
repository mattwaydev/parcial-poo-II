/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.person.Seller;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author mateocarrascal
 */
public class Store {
    private String name;
    private LocalDate creationDate;
    private Seller owner;
    private ArrayList<Product> products;

    public Store(String name, LocalDate creationDate, Seller owner) {
        this.name = name;
        this.creationDate = creationDate;
        this.owner = owner;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Seller getOwner() {
        return owner;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
     
    
}
