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
public class ProductTest {
    
    public ProductTest() {
    }

    /**
     * Test of values method, of class Product.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Product[] expResult = null;
        Product[] result = Product.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Product.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        Product expResult = null;
        Product result = Product.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
