package com.company;

public class MealBuilder {

    public Meal buildSteakMeal(){
        Meal meal = new Meal();
        meal.addProduct(new SteakBurger());
        meal.addProduct(new Coke());
        return meal;
    }

    public Meal buildChickenMeal(){
        Meal meal = new Meal();
        meal.addProduct(new ChickenBurger());
        meal.addProduct(new IcedTea());
        return meal;
    }
}
