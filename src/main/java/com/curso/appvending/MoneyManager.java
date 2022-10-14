/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.appvending;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author miromero
 */
public class MoneyManager {

    private static HashSet<Integer> coins = null;
    private static ArrayList<Integer> coinsBack = new ArrayList<>();
    private int totalMoney = 0;

    public MoneyManager() {

        if (coins == null) {
            coins = new HashSet<>();
            coins.add(10);
            coins.add(20);
            coins.add(50);
            coins.add(100);
            coins.add(200);
        }
    }

    /**
     * Get a coin and save it.
     * 
     * @param coin to insert
     */
    public void addCoin(int coin) {
        if (validCoin(coin)) {
            totalMoney += coin;
            coinsBack.add(coin);
        } else {
            System.out.println("Coin not valid (10, 20, 50, 100, 200)");
        }
    }

    /**
     * Validate a coin
     * 
     * @param coin
     * @return true if the coin exists
     * false if not
     */
    private boolean validCoin(int coin) {
        return coins.contains(coin);
    }

    /**
     *
     * @return the total amount of money
     */
    public int getTotalMoney() {
        return totalMoney;
    }

    /**
     *Calculate the amount of the cashback of a purchase
     * 
     * @param price of the purchase
     */
    public void cashBack(int price) {
        totalMoney -= price;
        if (totalMoney != 0) {
            coinsBack = new ArrayList<>();
            while (totalMoney != 0) {
                if (totalMoney >= 200) {
                    coinsBack.add(200);
                    totalMoney -= 200;
                } else if (totalMoney >= 100) {
                    coinsBack.add(100);
                    totalMoney -= 100;
                } else if (totalMoney >= 50) {
                    coinsBack.add(50);
                    totalMoney -= 50;
                } else if (totalMoney >= 20) {
                    coinsBack.add(20);
                    totalMoney -= 20;
                } else if (totalMoney >= 10) {
                    coinsBack.add(10);
                    totalMoney -= 10;
                }
            }
        }
        printCashBack();
    }

    /**
     *Print the cashback
     */
    public void printCashBack() {
        if (coinsBack != null) {
            System.out.println("Cashback: ");
            for (Integer coin : coinsBack) {

                System.out.print(coin + ", ");
            }
        }else{
            System.out.println("No cashback.");
        }
    }

    /**
     * Returns all the money inserted
     */
    public void cashBackWithoutBuy() {
        printCashBack();
    }
}
