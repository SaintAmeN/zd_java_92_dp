package com.sda.zdjavapol92.dp.strategy;

import com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc.IWiadomosc;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.nadawcy.INadawca;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.odbiorcy.IOdbiorca;
import com.sda.zdjavapol92.dp.strategy.strategie.IStrategiaWalki;

public class Bohater implements IOdbiorca {
    private String imie;
    private IStrategiaWalki strategiaWalki; // domyślnie null //

    public Bohater(String imie) {
        this.imie = imie;
        // ustawienie domyślnego stylu walki.
//        this.strategiaWalki = new StrategiaWalkiMieczem();
    }

    public void setStrategiaWalki(IStrategiaWalki strategiaWalki) {
        this.strategiaWalki = strategiaWalki;
    }

    public void walcz() {
        if (strategiaWalki != null) {
            strategiaWalki.walcz();
        } else {
            System.err.println("Nie ustawiłeś strategii walki!");
        }
    }

    public void przedstawSie() {
        System.out.println("Jestem " + imie + "...");
    }

    @Override
    public void powiadom(INadawca nadawca, IWiadomosc wiadomosc) {
        System.out.println("Jestem bohaterem(" + imie + "), dostałem wiadomość: " + wiadomosc);
    }
}
