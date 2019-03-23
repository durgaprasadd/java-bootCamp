package com.bootCamp.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {

    @Test
    void shouldReturnBasePriceForNoToppings() {
        Pizza pizza = new Pizza();
        assertEquals(50, pizza.getTotalPrice());
    }

    @Test
    void shouldReturnEmptyDescriptionForNoToppings() {
        Pizza pizza = new Pizza();
        assertEquals("", pizza.getDescription());
    }

    @Test
    void shouldReturnTotalPrice() {
        Pizza pizza = new Pizza();
        pizza.addTopping(Topping.CHICKEN);
        pizza.addTopping(Topping.VEGETABLE);
        pizza.addTopping(Topping.EXTRA_CHEESE);
        pizza.addTopping(Topping.JALAPENO);
        pizza.addTopping(Topping.MOZZARELLA);
        pizza.addTopping(Topping.TOMATO_SAUCE);
        assertEquals(180, pizza.getTotalPrice());
    }

    @Test
    void shouldReturnDescription() {
        Pizza pizza = new Pizza();
        pizza.addTopping(Topping.VEGETABLE);
        pizza.addTopping(Topping.CHICKEN);
        pizza.addTopping(Topping.VEGETABLE);
        String expected = "Vegetable\nChicken\nVegetable\n";
        assertEquals(expected, pizza.getDescription());
    }

}