
package cpit251;

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
 * @author hala
 */
public class PaymentTest {
    
    public PaymentTest() {
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
     * Test of ComputeTax method, of class Cpit251.
     */
    @Test
    public void testComputeTax() {
        System.out.println("ComputeTax");
        double total = 100.0;
        double expResult = 15.0;
        double result = Cpit251.ComputeTax(total);
        assertEquals(expResult, result, 0.0);
    }

   private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    /**
     * Test of payment method, of class Payment
     */
    @Test
    public void testpayment() {
        ArrayList<Services> selectedServices = new ArrayList<>();
        selectedServices.add(new Services("Service1", "Description1", 50.0));
        selectedServices.add(new Services("Service2", "Description2", 75.0));

        Payment.payment(selectedServices);

        // Assert that specific elements exist in the output
        String consoleOutput = outContent.toString();
        assertTrue(consoleOutput.contains("Invoice for Selected Services"));
        assertTrue(consoleOutput.contains("Service1"));
        assertTrue(consoleOutput.contains("Service2"));
        assertTrue(consoleOutput.contains("Total Amount"));
 
}
    
}
