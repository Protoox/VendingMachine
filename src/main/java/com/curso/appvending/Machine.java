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

    /**
     *Create a Machine with an ArrayList of Products object
     */
    public Machine() {
         pr = new ArrayList<>();
         pr.add(new Product(1, "Wumpas", 1, 5));
         pr.add(new Product(2, "Plumbus", 120, 10));
         pr.add(new Product(3, "NapiaCola", 200, 0));
    }
    
    
    /**
     * Buy a product checking only if there
     * is enough stocks
     * 
     * @param id id of the product
     */
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
    
    /**
     * Check if there are enough product.
     *
     * @param id
     * @return true if there are enough products
     * or false if not
     */
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

    /**
     *Get all product ant print them.
     */
    public void getAllProducts() {
        for (Product product : pr) {
            System.out.println(product);
        }
    }
    
    /**
     * Get the price of the product id selected
     *
     * @param id of the product
     * @return the price
     */
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
