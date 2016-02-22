/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thanguyen
 */
public class GreeterTest {
    
    public GreeterTest() {
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
     * Test of sayHello method, of class Greeter.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        Greeter instance = null;
        String expResult = "";
        String result = instance.sayHello();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Greeter.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "";
        Greeter instance = null;
        instance.setName(newName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of swapNames method, of class Greeter.
     */
    @Test
    public void testSwapNames() {
        System.out.println("swapNames");
        Greeter other = null;
        Greeter instance = null;
        instance.swapNames(other);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Greeter.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Greeter.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
