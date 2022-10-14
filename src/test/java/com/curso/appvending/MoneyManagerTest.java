/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.curso.appvending;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miromero
 */
public class MoneyManagerTest {
    
    public MoneyManagerTest() {
    }

    /**
     * Test of getMoney method, of class MoneyManager.
     */
    @Test
    public void testGetMoney() {
        System.out.println("getMoney");
        int coin = 0;
        MoneyManager instance = new MoneyManager();
        int expResult = 0;
        int result = instance.getMoney(coin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validCoin method, of class MoneyManager.
     */
    @Test
    public void testValidCoin() {
        System.out.println("validCoin");
        int coin = 0;
        MoneyManager instance = new MoneyManager();
        boolean expResult = false;
        boolean result = instance.validCoin(coin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cashBack method, of class MoneyManager.
     */
    @Test
    public void testCashBack() {
        System.out.println("cashBack");
        int price = 0;
        MoneyManager instance = new MoneyManager();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.cashBack(price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public void testSomeMethod() {
        //given

        MoneyManager mon = new MoneyManager();
        mon.addCoin(100);
        mon.addCoin(50);
        ArrayList<Integer> expecteds = new ArrayList<>();
        expecteds.add(20);
        expecteds.add(10);

        //do
        ArrayList<Integer> aux = mon.cashBack(120);

        //expect
        assertEquals(expecteds, aux);

        // TODO review the generated test code and remove the default call to fail.
    }
    
}
