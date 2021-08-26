package com.company;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product){
        products.add(product);
    }

    public float getCost(){
        float cost = 0.0F;

        for(Product product: products){
            cost += product.price();
        }
        return cost;
    }

    public void displayMeal(){
        for(Product product: products){
            System.out.println("Product name: " + product.name() + "\n");
            System.out.println("Wrapping: " + product.packing().pack() + "\n");
            System.out.println("Product price: " + product.price() + "\n");
        }
    }
}
