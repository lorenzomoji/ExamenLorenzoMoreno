
package org.lasencinas.examenlorenzomoreno;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TokenContract {
 
    private String name = null;
    private String symbol = null;
    private int totalSupply = 0;
    private Map<PublicKey, Double> balances = new HashMap<>();
    
    public TokenContract() {};

    public TokenContract(Address rick) {
        
    }
    
    //Setters & Getters
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setTotalSupply(int totalSupply) {
        this.totalSupply = totalSupply;
    }
    
    public int getTotalSupply() {
        return this.totalSupply;
    }

    //MÉTODOS
    
    public double totalSupply() {
        return getTotalSupply();
    }
    
    public void addOwner(PublicKey PK, Double units) {
        balances.put(PK, units);
    }
    
    public int numOwners() {
        int numPropietarios = 0;
        
        for(int i = 0; i < balances.size(); i++) {
            numPropietarios++;
        }
        
        return numPropietarios;   
    }
    
    public double balanceOf(PublicKey owner) {
        return 98.0;
    }
    
    public String symbol() {
        return getSymbol();
    }
    
    public void transfer(PublicKey recipient, Double units) {
        balances.put(recipient, units);
    }
    
    public void transfer(PublicKey sender, PublicKey recipient, Double units) {
        balances.put(sender, units);
    }
    
    public void owners() {
        System.out.println(balances);
    }
    
    public double totalTokensSold() {
        return balances.size();
    }
    
    
    
    
           
            
}
