
package cpit251;
import static org.junit.Assert.assertEquals;
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
 * @author Marwah and Amjad
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
     * Test of DisplayCatalog method, of class Services
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
        // Add the first service without using addService method
        ServiceCatalog.add(s1);
        // Add subsequent services using addService method
        s.addService(ServiceCatalog, s2);
        s.addService(ServiceCatalog, s3);
        s.addService(ServiceCatalog, s4);
        
        // Call displayCatalog method
        s.displayCatalog(ServiceCatalog);
        
        String expectedResult = ".............................Welcome to our services catalog.............................\n" +System.getProperty("line.separator"); 
        expectedResult += "1. Shipment companies : help to choose the best company to ship your products - 100.0 SR" + System.getProperty("line.separator");
        expectedResult += "2. Business consulting : Offer the best techniques for your concerns - 200.0 SR" + System.getProperty("line.separator");
        expectedResult += "3. Technical issues : We'll guide you to graphic designers and developers who suit the nature of your product - 300.0 SR" + System.getProperty("line.separator");
        expectedResult += "4. Finish : (calculate the total amount) - 0.0 SR" + System.getProperty("line.separator");
        
        assertEquals(expectedResult, out.toString());
    }
    /**
     * Test of AddServices method, of class Services
     */
    @Test
    public void testAddService() {
        System.out.println("addService");
        ArrayList<Services> ServiceCatalog = new ArrayList<>();
        Services serviceDetails = new Services("Shipment companies", "help to choose the best company to ship your products", 100.0);
        
        serviceDetails.addService(ServiceCatalog, serviceDetails);

        assertTrue(ServiceCatalog.contains(serviceDetails));
    }

}
