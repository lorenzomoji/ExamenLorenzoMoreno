/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokencontracttest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.examenlorenzomoreno.Address;
import org.lasencinas.examenlorenzomoreno.TokenContract;

public class TokenContractTest {

    @Test
    public void payable_test() {

        Address rick = new Address();
        rick.generateKeyPair();
        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.addOwner(rick.getPK(), 100d);
        Address morty = new Address();
        morty.generateKeyPair();

        morty.addEZI(20d);

        // verifico la transferencia de entradas
        ricknillos.payable(morty.getPK(), morty.getBalance());
        assertEquals(4d, ricknillos.balanceOf(morty.getPK()), 0d);   

        // verifico la trasnferencia de EZI
        assertEquals(20d, ricknillos.owner().getBalance(), 0d);
    }
    
    @Test
    public void balanceOf_test() {
        TokenContract tokenContract = new TokenContract();
        double num = 150d;
        //assertEquals(150d, balance.contains(num));
    }
}