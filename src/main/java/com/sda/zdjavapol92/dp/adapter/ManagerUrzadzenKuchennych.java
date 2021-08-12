package com.sda.zdjavapol92.dp.adapter;

import java.util.ArrayList;
import java.util.List;

public class ManagerUrzadzenKuchennych {
    private List<IUrzadzenieKuchenne> list = new ArrayList<>();

    public void addDevice(IUrzadzenieKuchenne urzadzenieKuchenne) {
        list.add(urzadzenieKuchenne);
    }

    void setDevicesEnabled() {
        // zamiast włączać każde urządzenie z osobna, stosujemy fasadę, czyli klasę która za nas
        // wykonuje czynności na wielu obiektach
        for (IUrzadzenieKuchenne iUrzadzenieKuchenne : list) {
            iUrzadzenieKuchenne.setDeviceEnabled();
        }
    }

    void setDeviceDisabled() {
        for (IUrzadzenieKuchenne iUrzadzenieKuchenne : list) {
            iUrzadzenieKuchenne.setDeviceDisabled();
        }
    }

    boolean isDeviceEnabled() {
        // sprawdzamy czy wszystkie są włączone
        for (IUrzadzenieKuchenne iUrzadzenieKuchenne : list) {
            if (!iUrzadzenieKuchenne.isDeviceEnabled()) {
                return false;
            }
        }
        return true;
    }
}
