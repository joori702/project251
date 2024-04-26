/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251;

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

    /**
     * Test of main method, of class Cpit251.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Cpit251.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of owner method, of class Cpit251.
     */
    @Test
    public void testOwner() {
        System.out.println("owner");
        Scanner scan = null;
        ArrayList AddOwner = null;
        Cpit251.owner(scan, AddOwner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
