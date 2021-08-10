package com.sda.zdjavapol92.dp.decorator.zadanie1;

public class Pizzeria {
    public IPizza pizzaMargheritta(){
        return new SimplePizza();
    }

    public IPizza pizzaHawajska(){
        CustomPizza pizza = new CustomPizza(new SimplePizza());
        pizza.addIngredient("ananas");
        return pizza;
    }

    public IPizza pizzaHawajskaZKebabem(){
        CustomPizza pizza = new CustomPizza(pizzaHawajska());
        pizza.addIngredient("kebab");
        return pizza;
    }
}
