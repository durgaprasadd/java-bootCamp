package com.bootCamp.pizza;

class Pizza {
    private Toppings toppings = new Toppings();

    void addTopping(Topping topping) {
        toppings.add(topping);
    }

    int getTotalPrice() {
        int basePrice = 50;
        return basePrice + toppings.getPrice();
    }

    String getDescription() {
        return toppings.getDescription();
    }
}
