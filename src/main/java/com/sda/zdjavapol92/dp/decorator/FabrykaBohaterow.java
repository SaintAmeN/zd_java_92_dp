package com.sda.zdjavapol92.dp.decorator;

public abstract class FabrykaBohaterow {
    public static Bohater stwórzBohatera(String imie){
        return new Bohater(imie, 76, 100);
    }

    public static Bohater stwórzSuperBohatera(String imie){
        return new Bohater(imie, 92, 110);
    }
}
