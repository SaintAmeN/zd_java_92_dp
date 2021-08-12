package com.sda.zdjavapol92.dp.observer.wersja_normalna.nadawcy;

import com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc.IWiadomosc;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.odbiorcy.IOdbiorca;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

@Log
@NoArgsConstructor
public class StacjaNadawczaRCB implements INadawca {
    private final List<IOdbiorca> listaOdbiorców = new ArrayList<>();

    @Override
    public void zarejestruj(IOdbiorca odbiorca) {
        System.out.println("Dodajemy odbiorcę do listy: " + odbiorca);
        listaOdbiorców.add(odbiorca);
    }

    @Override
    public void powiadomWszystkichOdbiorców(IWiadomosc wiadomosc) {
        System.out.println("Informuję wszystkich odbiorców o : " + wiadomosc);
        listaOdbiorców.forEach(odbiorca -> odbiorca.powiadom(this, wiadomosc));
    }
}
