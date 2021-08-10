package com.sda.zdjavapol92.dp.decorator.zadanie1;

import java.util.Arrays;
import java.util.List;

public class SimplePizza implements IPizza{
    @Override
    public List<String> getIngredients() {
        return Arrays.asList("sos", "ser");
    }

    @Override
    public double getPrice() {
        return 12.50;
    }

    // *******
    // ******* TU MA KOLEJNY KOD KTÓRY DZIALA OK
    // *******

}
