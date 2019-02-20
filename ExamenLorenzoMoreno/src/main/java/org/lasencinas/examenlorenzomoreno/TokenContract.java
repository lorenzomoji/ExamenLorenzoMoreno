
package org.lasencinas.examenlorenzomoreno;


public class TokenContract {
 
    private String name = null;
    private String symbol = null;
    private int totalSupply = 0;
    
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

}
