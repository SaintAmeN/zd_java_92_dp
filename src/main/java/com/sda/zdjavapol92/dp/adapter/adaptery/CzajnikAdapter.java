package com.sda.zdjavapol92.dp.adapter.adaptery;

import com.sda.zdjavapol92.dp.adapter.IUrzadzenieKuchenne;
import com.sda.zdjavapol92.dp.adapter.urządzenia.Czajnik;

public class CzajnikAdapter implements IUrzadzenieKuchenne {
    private Czajnik czajnik;

    public CzajnikAdapter(Czajnik czajnik) {
        this.czajnik = czajnik;
    }

    @Override
    public void setDeviceEnabled() {
        czajnik.uruchom();
    }

    @Override
    public void setDeviceDisabled() {
        czajnik.wyłącz();
    }

    @Override
    public boolean isDeviceEnabled() {
        return czajnik.sprawdzCzyWłączony();
    }
}
