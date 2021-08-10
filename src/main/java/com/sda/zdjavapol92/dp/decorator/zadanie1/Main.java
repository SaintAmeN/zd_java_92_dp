package com.sda.zdjavapol92.dp.decorator.zadanie1;

public class Main {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria();
        System.out.println(pizzeria.pizzaMargheritta());
        System.out.println();

        System.out.println(pizzeria.pizzaHawajska());
        System.out.println();

        System.out.println(pizzeria.pizzaHawajskaZKebabem());
        System.out.println();
    }
}
