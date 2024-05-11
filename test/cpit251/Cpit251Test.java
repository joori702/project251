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
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class Cpit251Test {
    
    public Cpit251Test() {
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

    @Test
    public void testPrintBill() {
        ArrayList<Services> selectedServices = new ArrayList<>();
        selectedServices.add(new Services("Service1", "Description1", 50.0));
        selectedServices.add(new Services("Service2", "Description2", 75.0));

        Cpit251.printBill(selectedServices);

        // Assert that specific elements exist in the output
        String consoleOutput = outContent.toString();
        assertTrue(consoleOutput.contains("Invoice for Selected Services"));
        assertTrue(consoleOutput.contains("Service1"));
        assertTrue(consoleOutput.contains("Service2"));
        assertTrue(consoleOutput.contains("Total Amount"));
    }
}
