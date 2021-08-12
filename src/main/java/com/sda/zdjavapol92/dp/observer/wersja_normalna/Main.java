package com.sda.zdjavapol92.dp.observer.wersja_normalna;

import com.sda.zdjavapol92.dp.observer.wersja_normalna.nadawcy.StacjaNadawczaRCB;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.odbiorcy.Odbiorca;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc.TypWiadomosci;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc.Wiadomosc;
import com.sda.zdjavapol92.dp.strategy.FabrykaBohaterów;

public class Main {
    public static void main(String[] args) {
        // golang ->
        //      -> struktury  (obiekt który ma pola)
        //      -> interfejsy
        StacjaNadawczaRCB stacjaNadawczaRCB = new StacjaNadawczaRCB();
        // tworząc obiekty mówimy im - zarejestruj się, to będziesz powiadomiony
        FabrykaBohaterów.stworzBohatera("Marian", stacjaNadawczaRCB);

        stacjaNadawczaRCB.zarejestruj(new Odbiorca("Marian"));
        stacjaNadawczaRCB.zarejestruj(new Odbiorca("Kasia"));
        stacjaNadawczaRCB.zarejestruj(new Odbiorca("Zosia"));
        stacjaNadawczaRCB.zarejestruj(new Odbiorca("Marek"));
        stacjaNadawczaRCB.zarejestruj(new Odbiorca("Ola"));

        // model rozgłoszeniowy który wykorzystywany jest WSZĘDZIE!
//        stacjaNadawczaRCB.zarejestruj(bohater);

        stacjaNadawczaRCB.powiadomWszystkichOdbiorców(new Wiadomosc("Powódź na morzu!", TypWiadomosci.CIASTKA));
    }
}
