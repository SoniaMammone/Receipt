package org.generation.italy.receipt.model;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    private static Map<Product, Integer> products = new HashMap<>();
    private static double totalCost = 0.0;

    public double addProduct(Product product, Integer quantity){
        if(product != null && quantity != 0){
            products.put(product, quantity);
            return totalCost += getCostForQuantity(product, quantity);
        }
        return totalCost;
    }

    public double removeProduct(Product product, Integer quantity){
        if(products.containsKey(product)){
            products.remove(product);
            return totalCost -= getCostForQuantity(product, quantity);
        }
        return totalCost;
    }

    public double getCostForQuantity(Product product, Integer quantity){
        return product.getCost() * quantity;
    }

    public double getDiscount(Product product, Integer quantity, int discount){
        return  (getCostForQuantity(product, quantity) / 100) * discount;
    }
}
