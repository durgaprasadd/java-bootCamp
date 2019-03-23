package com.bootCamp.pizza;

import java.util.ArrayList;

class Toppings {
    private String description = "";
    private int price = 0;
    private ArrayList<Topping> toppings = new ArrayList<>();

    void add(Topping topping) {
        toppings.add(topping);
        this.price += topping.getPrice();
    }

    int getPrice() {
        return this.price;
    }

    String getDescription() {
        for (Topping topping : this.toppings) {
            description += topping.getName() + "\n";
        }
        return this.description;
    }
}
