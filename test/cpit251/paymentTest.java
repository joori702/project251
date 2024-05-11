/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251Test;
//import 

import cpit251.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eng. Lilas Al Araj
 */
public class paymentTest {

    public paymentTest() {
    }

    @Test
    public void testPrintBill() {
        Service service = new Service("name of service", "description of dervice", 330.0);
        Payment instance = new Payment("xxx", "Amal", "Ahmed");
        instance.addServic(service);
        assertNotNull(instance.printBill());
    }

    /**
     * Test of subTotal method, of class payment.
     */
    @Test
    public void testSubTotal() {

        Service service = new Service("name of service", "description of dervice", 330.0);

        Payment instance = new Payment("xxx", "Amal", "Ahmed");
        instance.addServic(service);
        instance.setDiscount(20.0);
        double expResult = 310.0;
        double result = instance.subTotal();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calculateTax method, of class payment.
     */
    @Test
    public void testCalculateTax() {
        double subtotal = 69;
        double expResult = 10.35;
        double result = Payment.calculateTax(subtotal);
        assertEquals(expResult, result, 0);
    }

}
