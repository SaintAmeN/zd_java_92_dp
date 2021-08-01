package com.sda.zdjavapol92.dp.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonV2 {
    // towrzy się wraz z załadowaniem klasy
    private static SingletonV2 INSTANCE;

    // singleton który przechowuje nazwy pizzy.
    private List<String> nazwyPizzy;

    private SingletonV2() {
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

    public static SingletonV2 getInstance() {
        if(INSTANCE == null){
            // zjawisko wyścigów NIE MOŻE WYSTĘPOWAĆ
            INSTANCE = new SingletonV2();
        }
        return INSTANCE;
    }
}
