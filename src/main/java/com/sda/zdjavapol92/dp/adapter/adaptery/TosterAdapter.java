package com.sda.zdjavapol92.dp.adapter.adaptery;

import com.sda.zdjavapol92.dp.adapter.IUrzadzenieKuchenne;
import com.sda.zdjavapol92.dp.adapter.urządzenia.Toster;

public class TosterAdapter implements IUrzadzenieKuchenne {
    private Toster toster;

    public TosterAdapter(Toster toster) {
        this.toster = toster;
    }

    @Override
    public void setDeviceEnabled() {
        toster.setEnabled(true);
    }

    @Override
    public void setDeviceDisabled() {
        toster.setEnabled(false);
    }

    @Override
    public boolean isDeviceEnabled() {
        return !toster.isOff();
    }
}
