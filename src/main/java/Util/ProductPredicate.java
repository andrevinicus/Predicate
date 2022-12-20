/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import com.mycompany.program.entites.Product;
import java.util.function.Predicate;

/**
 *
 * @author GCM_02
 */
public class ProductPredicate implements Predicate<Product>{

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
        
    }
    
}
