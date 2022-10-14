/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.curso.appvending;

/**
 *
 * @author miromero
 */
public class Product {
    
   
    private int id;
    private String name;
    private int price;
    private int quantity;

    /**
     * Create a new product
     *
     * @param id
     * @param name
     * @param price
     * @param quantity
     */
    public Product(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity= quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
    
    public int getQuantity() {
        return quantity;
    }


    public void restQuantity() {
        this.quantity -= 1;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  id + " - " + name + ". Price " + price;
    }

    
    
    
    
    
    
    
    
    
}
