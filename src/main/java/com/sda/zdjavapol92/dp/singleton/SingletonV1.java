package com.sda.zdjavapol92.dp.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonV1 {
    // towrzy się wraz z załadowaniem klasy
    private static final SingletonV1 INSTANCE = new SingletonV1();

    // singleton który przechowuje nazwy pizzy.
    private List<String> nazwyPizzy;

    private SingletonV1() {
        this.nazwyPizzy = new ArrayList<>();
        this.nazwyPizzy.add("Margheritta");
        this.nazwyPizzy.add("Hawajska");
        this.nazwyPizzy.add("Wiejska");
    }

    public List<String> getNazwyPizzy() {
        return nazwyPizzy;
    }

    public void wypiszNazwyPizzy() {
        for (String nazwa : nazwyPizzy) {
            System.out.println(nazwa);
        }
    }

    public static SingletonV1 getInstance() {
        return INSTANCE;
    }
}
