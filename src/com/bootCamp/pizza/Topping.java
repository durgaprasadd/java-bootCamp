package com.bootCamp.pizza;

class Topping {
    static final Topping VEGETABLE = new Topping("Vegetable",20);
    static final Topping CHICKEN = new Topping("Chicken",30);
    static final Topping MOZZARELLA = new Topping("Mozzarella",10);
    static final Topping TOMATO_SAUCE = new Topping("Tomato sauce",5);
    static final Topping EXTRA_CHEESE = new Topping("Extra cheese",25);
    static final Topping JALAPENO = new Topping("Jalapeno",40);
    private String name;
    private int price;

    private Topping(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }
}
