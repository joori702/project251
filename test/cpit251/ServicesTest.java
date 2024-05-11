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
        
        ArrayList<Services> ServiceCatalog = new ArrayList<>();
        Services s1 = new Services("Shipment companies", "help to choose the best company to ship your products", 100.0);
        Services s2 = new Services("Business consulting", "Offer the best techniques for your concerns", 200.0);
        Services s3 = new Services("Technical issues", "We'll guide you to graphic designers and developers who suit the nature of your product", 300.0);
        Services s4 = new Services("Finish", "(calculate the total amount)", 0.0);

        
        Services s= new Services();
        s.addService(ServiceCatalog, s1);
        s.addService(ServiceCatalog, s2);
        s.addService(ServiceCatalog, s3);
        s.addService(ServiceCatalog, s4);
        s.displayCatalog(ServiceCatalog);

        
        String expectedResult = ".............................Welcome to our services catalog.............................\n" +System.getProperty("line.separator"); 
        expectedResult += "1. Shipment companies : help to choose the best company to ship your products - 100.0 SR" + System.getProperty("line.separator");
        expectedResult += "2. Business consulting : Offer the best techniques for your concerns - 200.0 SR" + System.getProperty("line.separator");
        expectedResult += "3. Technical issues : We'll guide you to graphic designers and developers who suit the nature of your product - 300.0 SR" + System.getProperty("line.separator");
        expectedResult += "4. Finish : (calculate the total amount) - 0.0 SR" + System.getProperty("line.separator");
//        expectedResult += "Please enter the number corresponding to the service you'd like to book:" + System.getProperty("line.separator");
        
        assertEquals(expectedResult, out.toString());
    }

    /**
     * Test of getName method, of class Services.
     */
//    @Test
//    public void testGetName() {
//        System.out.println("getName");
//        Services instance = new Services();
//        String expResult = "";
//        String result = instance.getName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDescription method, of class Services.
//     */
//    @Test
//    public void testGetDescription() {
//        System.out.println("getDescription");
//        Services instance = new Services();
//        String expResult = "";
//        String result = instance.getDescription();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPrice method, of class Services.
//     */
//    @Test
//    public void testGetPrice() {
//        System.out.println("getPrice");
//        Services instance = new Services();
//        double expResult = 0.0;
//        double result = instance.getPrice();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of addService method, of class Services.
     */
    @Test
    public void testAddService() {
        System.out.println("addService");
        ArrayList<Services> ServiceCatalog = new ArrayList<>();
        Services serviceDetails = new Services("Shipment companies", "help to choose the best company to ship your products", 100.0);
        
        serviceDetails.addService(ServiceCatalog, serviceDetails);
        
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(ServiceCatalog.contains(serviceDetails));
    }

    /**
     * Test of getName method, of class Services.
     */
//    @Test
//    public void testGetName() {
//        System.out.println("getName");
//        Services instance = new Services();
//        String expResult = "";
//        String result = instance.getName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDescription method, of class Services.
//     */
//    @Test
//    public void testGetDescription() {
//        System.out.println("getDescription");
//        Services instance = new Services();
//        String expResult = "";
//        String result = instance.getDescription();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getPrice method, of class Services.
     */
//    @Test
//    public void testGetPrice() {
//        System.out.println("getPrice");
//        Services instance = new Services();
//        double expResult = 0.0;
//        double result = instance.getPrice();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getServiceCatalog method, of class Services.
     */
//    @Test
//    public void testGetServiceCatalog() {
//        System.out.println("getServiceCatalog");
//        ArrayList<Services> expResult = null;
//        ArrayList<Services> result = Services.getServiceCatalog();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setServiceCatalog method, of class Services.
//     */
//    @Test
//    public void testSetServiceCatalog() {
//        System.out.println("setServiceCatalog");
//        ArrayList<Services> ServiceCatalog = null;
//        Services.setServiceCatalog(ServiceCatalog);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkType method, of class Services.
//     */
//    @Test
//    public void testCheckType() {
//        System.out.println("checkType");
//        int choice = 0;
//        ArrayList<Services> serviceCatalog = null;
//        Services instance = new Services();
//        double expResult = 0.0;
//        double result = instance.checkType(choice, serviceCatalog);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getServiceCatalog method, of class Services.
     */
//    @Test
//    public void testGetServiceCatalog() {
//        System.out.println("getServiceCatalog");
//        ArrayList<Services> expResult = null;
//        ArrayList<Services> result = Services.getServiceCatalog();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setServiceCatalog method, of class Services.
//     */
//    @Test
//    public void testSetServiceCatalog() {
//        System.out.println("setServiceCatalog");
//        ArrayList<Services> ServiceCatalog = null;
//        Services.setServiceCatalog(ServiceCatalog);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkType method, of class Services.
//     */
//    @Test
//    public void testCheckType() {
//        System.out.println("checkType");
//        int choice = 0;
//        ArrayList<Services> serviceCatalog = null;
//        Services instance = new Services();
//        double expResult = 0.0;
//        double result = instance.checkType(choice, serviceCatalog);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
/**
     * .............................Welcome to our services catalog.............................

1. Shipment companies : help to choose the best company to ship your products - 100.0 SR
2. Business consulting : Offer the best techniques for your concerns - 200.0 SR
3. Technical issues : We'll guide you to graphic designers and developers who suit the nature of your product - 300.0 SR
4. Finish : (calculate the total amount) - 0.0 SR
Please enter the number corresponding to the service you'd like to book: 
* 
* public void displayCatalog(ArrayList<Services> serviceCatalog) {
    System.out.println(".............................Welcome to our services catalog.............................\n");

    for (int i = 0; i < serviceCatalog.size(); i++) {
        Services service = serviceCatalog.get(i);
        System.out.println((i + 1) + ". " + service.getName() + " : " + service.getDescription() + " - " + service.getPrice() + " SR");
    }

    System.out.println("Please enter the number corresponding to the service you'd like to book:");
}
     */

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
