/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addresstest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.lasencinas.examenlorenzomoreno.Address;

public class AddressTest {

    @Test
    public void generate_key_pair_test() {
        Address address = new Address();
        assertNotNull(address);
        address.generateKeyPair();
        assertNotNull(address.getPK());
        assertNotNull(address.getSK());
    }


    @Test
    public void transferEZI_test() {

        Address rick = new Address();
        rick.generateKeyPair();

        rick.addEZI(20d);

        rick.transferEZI(20d);

        assertEquals(40d, rick.getBalance(), 0d);
    }

}