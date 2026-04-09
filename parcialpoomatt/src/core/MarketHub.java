/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.person.Client;
import core.person.Seller;
import core.person.User;
import java.util.ArrayList;

/**
 *
 * @author mateocarrascal
 */
public class MarketHub {
    private ArrayList<User> users;
    private ArrayList<Store> stores;

    public MarketHub() {
        this.users = new ArrayList<>();
        this.stores = new ArrayList<>();
    }

<<<<<<< HEAD

=======
    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Store> getStores() {
        return stores;
    }
    
    
>>>>>>> 4ce444523835564453cb8d87a15d2ace85024b31
}
