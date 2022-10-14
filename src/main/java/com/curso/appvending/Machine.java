/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.appvending;

import java.util.ArrayList;

/**
 *
 * @author miromero
 */
public class Machine {
    ArrayList<Product> pr;

    public Machine() {
         pr = new ArrayList<>();
         pr.add(new Product(1, "Wumpas", 1, 5));
         pr.add(new Product(2, "Plumbus", 120, 10));
         pr.add(new Product(3, "NapiaCola", 200, 0));
    }
    
    public void buyProduct(int id){
        for (Product product : pr) {
            if (product.getId() == id) {
                if (product.getQuantity()>0) {
                    product.restQuantity();
                    System.out.println("You bought a "+ product.getName());
                }
            }
        }
    }
    
    public boolean enoughtProducts(int id){
        for (Product product : pr) {
            if (product.getId() == id) {
                if (product.getQuantity()>0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void getAllProducts() {
        for (Product product : pr) {
            System.out.println(product);
        }
    }
    
    public int getProductPrice(int id){
        for (Product product : pr) {
            if (product.getId() == id) {
                int price = product.getPrice();
                return price;
            }
        }
        return 0;
    }
    
    

}
