package com.sda.zdjavapol92.dp.singleton;

import java.util.ArrayList;
import java.util.List;

// towrzy się wraz z załadowaniem klasy
public enum SingletonV4 {
    INSTANCE;

    // singleton który przechowuje nazwy pizzy.
    private List<String> nazwyPizzy;

    private SingletonV4() {
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
}
