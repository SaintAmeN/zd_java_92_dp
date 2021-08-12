package com.sda.zdjavapol92.dp.observer.wersja_normalna.nadawcy;

import com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc.IWiadomosc;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.odbiorcy.IOdbiorca;

public interface INadawca {
    void zarejestruj(IOdbiorca odbiorca);
    void powiadomWszystkichOdbiorców(IWiadomosc wiadomosc);
}
