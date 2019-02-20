
package org.lasencinas.examenlorenzomoreno;

import java.security.PrivateKey;
import java.security.PublicKey;

import org.lasencinas.examenlorenzomoreno.GenSig;

public class Address {
    
    //ATRIBUTOS
    private PublicKey PK = null;
    private PrivateKey SK = null;
    private double balance = 0;
    private String EZI = null;
    
    
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
    
    //MÉTODOS
    
     public void generateKeyPair() {
         setPK(GenSig.generateKeyPair().getPublic());
     }
     
     
    
}
