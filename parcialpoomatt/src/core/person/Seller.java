/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.Store;
import java.time.LocalDate;

/**
 *
 * @author samuelnunez
 */
public class Seller extends User {
    
    private Store store;

    public Seller(Store store, int id, String name, String email, LocalDate registrationDate) {
        super(id, name, email, registrationDate);
        this.store = store;
    }

    public Store getStore() {
        return store;
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

    
    
        
    
}
