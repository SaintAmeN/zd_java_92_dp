package com.sda.zdjavapol92.dp.decorator.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class CustomPizza implements IPizza{
    private List<String> dodatkiDodaneDoPizzy = new ArrayList<>();
    private IPizza simplePizza;

    public CustomPizza(IPizza simplePizza) {
        this.simplePizza = simplePizza;
    }

    public void addIngredient(String skladnik){
        dodatkiDodaneDoPizzy.add(skladnik);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>();
        ingredients.addAll(simplePizza.getIngredients());
        ingredients.addAll(dodatkiDodaneDoPizzy);

        // suma zbiorów obu kolekcji
        return ingredients;
    }

    @Override
    public double getPrice() {
        return simplePizza.getPrice() + (2.5 * dodatkiDodaneDoPizzy.size());
    }

    @Override
    public String toString() {
        return "CustomPizza{" +
                "dodatkiDodaneDoPizzy=" + dodatkiDodaneDoPizzy +
                ", simplePizza=" + simplePizza +
                '}';
    }
}
