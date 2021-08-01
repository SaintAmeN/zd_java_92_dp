package com.sda.zdjavapol92.dp.strategy;

import com.sda.zdjavapol92.dp.strategy.strategie.IStrategiaWalki;
import com.sda.zdjavapol92.dp.strategy.strategie.StrategiaWalkiMieczem;

public class Bohater {
    private String imie;
    private IStrategiaWalki strategiaWalki; // domyślnie null

    public Bohater(String imie) {
        this.imie = imie;
        // ustawienie domyślnego stylu walki.
//        this.strategiaWalki = new StrategiaWalkiMieczem();
    }

    public void setStrategiaWalki(IStrategiaWalki strategiaWalki) {
        this.strategiaWalki = strategiaWalki;
    }

    public void walcz() {
        if(strategiaWalki !=null) {
            strategiaWalki.walcz();
        }else{
            System.err.println("Nie ustawiłeś strategii walki!");
        }
    }

    public void przedstawSie() {
        System.out.println("Jestem " + imie + "...");
    }
}
