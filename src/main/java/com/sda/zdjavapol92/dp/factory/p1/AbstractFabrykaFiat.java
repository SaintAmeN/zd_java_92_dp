package com.sda.zdjavapol92.dp.factory.p1;

// Abstract factory - factory którego instacji nie musimy/nie możemy stworzyć
public abstract class AbstractFabrykaFiat {

    // factory method - metoda stworzeniowa
    public static Samochód stworzFiat126p(){
        return Samochód.createSamochód("Fiat", "126p",
                1.0, 1000000, 60.0, 0, false, "sraczkowaty");
    }

    public static Samochód stworzFiat125p(){
        return Samochód.createSamochód("Fiat", "125p",
                0.6, 1000000, 50.0, 0, false, "czarny");
    }
}
