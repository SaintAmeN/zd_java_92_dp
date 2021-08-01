package com.sda.zdjavapol92.dp.factory.p1;

// Klasa factory
public class FabrykaFiat {
    public Samochód stworzFiat126p(){
        return Samochód.createSamochód("Fiat", "126p",
                1.0, 1000000, 60.0, 0, false, "sraczkowaty");
    }

    public Samochód stworzFiat125p(){
        return Samochód.createSamochód("Fiat", "125p",
                0.6, 1000000, 50.0, 0, false, "czarny");
    }
}
