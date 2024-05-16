
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
 * @author wed
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
     * Test of addOwner method, of class Owner.
     */
    @Test
    public void testAddOwner() {
        System.out.println("addOwner");
        ArrayList<Owner> AddOwner = new ArrayList<Owner>();
        Owner instance = new Owner("wed", "Alotibi", "Alasail", "0544381416", "wedabdullh2003@gmail.com", "1126565726", "12345678");
        instance.addOwner(AddOwner, instance);

        assertNotNull(AddOwner.get(0));
    }
    
}
