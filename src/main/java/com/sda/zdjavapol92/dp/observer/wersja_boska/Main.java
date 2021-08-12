package com.sda.zdjavapol92.dp.observer.wersja_boska;

import com.sda.zdjavapol92.dp.factory.p1.AbstractFabrykaFiat;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc.TypWiadomosci;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc.Wiadomosc;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.odbiorcy.Odbiorca;
import com.sda.zdjavapol92.dp.strategy.Bohater;
import com.sda.zdjavapol92.dp.strategy.FabrykaBohaterów;

public class Main {
    public static void main(String[] args) {
        SerwerPowiadomien.INSTANCE.zarejestruj(new Bohater("Marian"));
        SerwerPowiadomien.INSTANCE.zarejestruj(new Odbiorca("Wojtek"));
        SerwerPowiadomien.INSTANCE.zarejestruj(AbstractFabrykaFiat.stworzFiat125p());
        SerwerPowiadomien.INSTANCE.zarejestruj(AbstractFabrykaFiat.stworzFiat126p());

        Bohater b = FabrykaBohaterów.stworzBohateraIZarejestruj("Gosia");

        System.out.println("");

        SerwerPowiadomien.INSTANCE.powiadomWszystkichOdbiorców(new Wiadomosc("Siema wszystkim!", TypWiadomosci.POWODZ));
    }
}
