/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.appvending;

import java.util.Scanner;

/**
 *
 * @author miromero
 */
public class VendingInterface {

    Scanner sc;
    MoneyManager mm;
    Machine machine;

    public VendingInterface() {
        this.sc = new Scanner(System.in);
        this.mm = new MoneyManager();
        this.machine = new Machine();
    }

    public void welcome() {
        System.out.println("Welcome!");
        boolean loop = true;
        while (loop) {
            machine.getAllProducts();
            System.out.println("Total Money: ");
            System.out.println(mm.getTotalMoney());

            System.out.println("'I' for Insert Coin \nOr choose a product id.");
            System.out.println("'R' for get your money back.");

            String option = sc.next();

            switch (option) {
                case "I":
                    System.out.println("Insert coin: (10, 20, 50, 100, 200)");
                    mm.addCoin(sc.nextInt());
                    break;
                case "R":
                    mm.cashBackWithoutBuy();
                    loop = false;
                    break;
                case "1":
                    loop = buyProcces(1);
                    break;
                case "2":
                    loop = buyProcces(2);
                    break;
                case "3":
                    loop = buyProcces(3);
                    break;
                default:
                    System.out.println("Not a valid option");
            }

        }

    }

    public boolean buyProcces(int id) {
        boolean loop;
        if (mm.getTotalMoney() >= machine.getProductPrice(id)) {
            if (machine.enoughtProducts(id)) {
                machine.buyProduct(id);
                mm.cashBack(machine.getProductPrice(id));
                loop = false;
            } else {
                System.out.println("Product not avaliable");
                loop = true;
            }

        } else {
            System.out.println("Not enought money");
            loop = true;
        }
        return loop;
    }

}
