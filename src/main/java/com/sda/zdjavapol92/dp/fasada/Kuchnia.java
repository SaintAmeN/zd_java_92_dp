package com.sda.zdjavapol92.dp.fasada;

import com.sda.zdjavapol92.dp.adapter.urządzenia.Czajnik;
import com.sda.zdjavapol92.dp.adapter.urządzenia.Lodówka;
import com.sda.zdjavapol92.dp.adapter.urządzenia.Toster;

public class Kuchnia {
    private Czajnik czajnik;
    private Lodówka lodówka;
    private Toster toster;

    public Kuchnia(Czajnik czajnik, Lodówka lodówka, Toster toster) {
        this.czajnik = czajnik;
        this.lodówka = lodówka;
        this.toster = toster;
    }

    void setDevicesEnabled() {
        // uruchom wszystkie obiekty, ale żeby nie pisać w wielu miejscach powielonych instrukcji, robimy fasadę
        czajnik.uruchom();
        lodówka.on();
        toster.setEnabled(true);
    }
}
