/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.person.Client;
import core.person.Seller;
import core.person.User;
import java.time.LocalDate;
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

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Store> getStores() {
        return stores;
    }

    public boolean addUser(Client client) {
        if(!this.users.contains(client)){
            this.users.add(client);
            return true;
        }
        else return false;
    }
    
    public boolean addUser(Seller seller) {
        if(!this.users.contains(seller)){
            this.users.add(seller);
            return true;
        }
        else return false;
    }
    
    public boolean createStore(String name, LocalDate date, int seller){
        seller1 = getSeller(seller);
        Store store = new Store(name, date, getSeller(seller1));
        if (!this.stores.contains(store)){
            this.stores.add(store);
            return true;
        }
        else return false;
    }

    public int getSeller(int i) {
        return this.stores.get(i).getOwner().getId();
    }

    public Store getStore(int i) {
        return this.stores.get(i);
    }

    public Client getClient(int i) {
        return (Client) this.users.get(i);
    }

    public void storeSummary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void clientOrderSummary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Product getProductHighestIncome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Client getClientMostSpent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
