/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.curso.appvending;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miromero
 */
public class MachineTest {
    
    public MachineTest() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyProduct method, of class Machine.
     */
    @Test
    public void testBuyProduct() {
        System.out.println("buyProduct");
        int id = 0;
        Machine instance = new Machine();
        instance.buyProduct(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enoughtProducts method, of class Machine.
     */
    @Test
    public void testEnoughtProducts() {
        System.out.println("enoughtProducts");
        int id = 0;
        Machine instance = new Machine();
        boolean expResult = false;
        boolean result = instance.enoughtProducts(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllProducts method, of class Machine.
     */
    @Test
    public void testGetAllProducts() {
        System.out.println("getAllProducts");
        Machine instance = new Machine();
        instance.getAllProducts();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductPrice method, of class Machine.
     */
    @Test
    public void testGetProductPrice() {
        System.out.println("getProductPrice");
        int id = 0;
        Machine instance = new Machine();
        int expResult = 0;
        int result = instance.getProductPrice(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
