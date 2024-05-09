/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wedab
 */
public class OwnerTest {
    
    public OwnerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBusinessName method, of class Owner.
     */
//    @Test
//    public void testGetBusinessName() {
//        System.out.println("getBusinessName");
//        Owner instance = null;
//        String expResult = "";
//        String result = instance.getBusinessName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setBusinessName method, of class Owner.
     */
//    @Test
//    public void testSetBusinessName() {
//        System.out.println("setBusinessName");
//        String BusinessName = "";
//        Owner instance = null;
//        instance.setBusinessName(BusinessName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of addOwner method, of class Owner.
     */
    @Test
    public void testAddOwner() {
        System.out.println("addOwner");
        ArrayList<Owner> AddOwner = new ArrayList<Owner>();
        Owner instance = new Owner("wed", "Alotibi", "Alasail", "0544381416", "wedabdullh2003@gmail.com", "1126565726", "12345678");
        instance.addOwner(AddOwner, instance);
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(AddOwner.get(0));
    }
    
}
