package com.sda.zdjavapol92.dp.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonV3 {
    // towrzy się wraz z załadowaniem klasy
    private static SingletonV3 INSTANCE;
    private static final Object lock = new Object();

    // singleton który przechowuje nazwy pizzy.
    private List<String> nazwyPizzy;

    private SingletonV3() {
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

    // synchronized przy metodzie powoduje że do metody może wejść 1 wątek
    // nie chcemy tego ponieważ spowoduje to blokowanie wszystkich wątków
    public /*synchronized*/ static SingletonV3 getInstance() {
        // 10 wątków
        if (INSTANCE == null) {
            // tylko gdy nie istnieje wchodzimy w blok
            // 10 wątków może wejść w if
            synchronized (lock) {
                // 1 zostanie przepuszczony
                // 9 przepuszczonych sprawdzi i nie stworzy instancji
                if (INSTANCE == null) {
                    // 1 stworzy
                    INSTANCE = new SingletonV3();
                }
            }
        }
        return INSTANCE;
    }
}
