package com.sda.zdjavapol92.dp.adapter.adaptery;

import com.sda.zdjavapol92.dp.adapter.IUrzadzenieKuchenne;
import com.sda.zdjavapol92.dp.adapter.urządzenia.Lodówka;

public class LodówkaAdapter extends Lodówka implements IUrzadzenieKuchenne {
    @Override
    public void setDeviceEnabled() {
        super.on();
    }

    @Override
    public void setDeviceDisabled() {
        super.off();
    }

    @Override
    public boolean isDeviceEnabled() {
        return enabled;
    }
}
