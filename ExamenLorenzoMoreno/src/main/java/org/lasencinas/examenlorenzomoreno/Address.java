
package org.lasencinas.examenlorenzomoreno;

import java.security.PrivateKey;
import java.security.PublicKey;

import org.lasencinas.examenlorenzomoreno.GenSig;
import org.lasencinas.examenlorenzomoreno.TokenContract;

public class Address {
    
    //ATRIBUTOS
    private PublicKey PK;
    private PrivateKey SK = null;
    private double balance = 0;
    private String EZI = null;
    private Address address = null;
    
    public Address() {};
    
    //Setters & Getters
    
    public void setPK(PublicKey PK) {
        this.PK = PK;
    }
    
    public PublicKey getPK() {
        return this.PK;
    }
    
    public void setSK(PrivateKey SK) {
        this.SK = SK;
    }
    
    public PrivateKey getSK() {
        return this.SK;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Address getAddress() {
        return this.address;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    //MÉTODOS
    
    public void generateKeyPair() {
        setPK(GenSig.generateKeyPair().getPublic());
    }
     
    
}
