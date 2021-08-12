package com.sda.zdjavapol92.dp.observer.wersja_normalna.odbiorcy;

import com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc.IWiadomosc;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.nadawcy.INadawca;

public interface IOdbiorca {
    void powiadom(INadawca nadawca, IWiadomosc wiadomosc);
}
