/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.Order;
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
    
    
    
    
    
}
