package com.sda.zdjavapol92.dp.observer.wersja_normalna.odbiorcy;

import com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc.IWiadomosc;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.nadawcy.INadawca;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc.TypWiadomosci;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

@Log
@AllArgsConstructor
public class Odbiorca implements IOdbiorca{
    private final String imie;

    @Override
    public void powiadom(INadawca nadawca, IWiadomosc wiadomosc) {
        if(wiadomosc.getTypWiadomosci() == TypWiadomosci.POZAR) {
            System.out.println("Ja jestem " + imie + " i zostałem/łam powiadomiony/a o: " + wiadomosc);
        }else{
            System.out.println("Ta widomosc mnie nie interesuje - " + imie);
        }
    }
}
