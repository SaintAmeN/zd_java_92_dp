package com.sda.zdjavapol92.dp.observer.wersja_boska;

import com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc.IWiadomosc;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.nadawcy.INadawca;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.odbiorcy.IOdbiorca;

import java.util.ArrayList;
import java.util.List;

public class SerwerPowiadomien implements INadawca {
    public static SerwerPowiadomien INSTANCE = new SerwerPowiadomien();
    private SerwerPowiadomien() {
        System.out.println("Stworzyłem serwer powiadomien.");
    }

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
