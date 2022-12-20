/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.entites;

/**
 *
 * @author GCM_02
 */
public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >=100.0;
    }

    /**
     *
     * @return
     */
    public boolean nonStaticProductPredicate(){
        return price >=100.0;
    }
    
    
    @Override
    public String toString(){
        return name + "," + String.format("%.2f", price);
    }
    
    
}
