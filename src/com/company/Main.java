/* Bir fast-food zincirinin internet sitesinde verilen siparişi modüler şekilde simüle eden kod bloğu: */
package com.company;

public class Main {

    public static void main(String[] args) {

        MealBuilder builder = new MealBuilder();

        Meal steakMeal = builder.buildSteakMeal();
        System.out.println("New Steak Meal: " + "\n");
        steakMeal.displayMeal();
        System.out.println("Total Price: " + steakMeal.getCost() + "\n");


        Meal chickenMeal = builder.buildChickenMeal();
        System.out.println("New Chicken Meal: " + "\n");
        chickenMeal.displayMeal();
        System.out.println("Total Price: " + chickenMeal.getCost() + "\n");
    }
}
