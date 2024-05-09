/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HQ
 */
public class ServicesTest {
    
    public ServicesTest() {
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
     * Test of getServiceNames method, of class Services.
     
    @Test
    public void testGetServiceNames() {
        System.out.println("getServiceNames");
        Services instance = new Services();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getServiceNames();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of getDescriptions method, of class Services.
     
    @Test
    public void testGetDescriptions() {
        System.out.println("getDescriptions");
        Services instance = new Services();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getDescriptions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of getPrices method, of class Services.
     
    @Test
    public void testGetPrices() {
        System.out.println("getPrices");
        Services instance = new Services();
        ArrayList<Double> expResult = null;
        ArrayList<Double> result = instance.getPrices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    /**
     * Test of displayCatalog method, of class Services.
     */
    @Test
    public void testDisplayCatalog() {
        System.out.println("displayCatalog");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        
        Services instance = new Services();
        instance.displayCatalog();
        
        String expectedResult = ".............................Welcome to our services catalog.............................\n" +System.getProperty("line.separator"); 
        expectedResult += "1. shipment companies : help to choose the best company to ship your products - 100.0 SR" + System.getProperty("line.separator");
        expectedResult += "2. business consulting : Offer the best techniques for your concerns - 200.0 SR" + System.getProperty("line.separator");
        expectedResult += "3. technical issues : We'll guide you to graphic designers and developers who suit the nature of your product - 300.0 SR" + System.getProperty("line.separator");
        expectedResult += "4. Finish (calculate the total amount)" + System.getProperty("line.separator");
        expectedResult += "Please enter the number corresponding to the service you'd like to book: " + System.getProperty("line.separator");
        
        assertEquals(expectedResult, out.toString());
    }

    /**
    @Test
    public void testCheckType() {
        System.out.println("checkType");
        int choice = 0;
        Services instance = new Services();
        double expResult = 0.0;
        double result = instance.checkType(choice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
