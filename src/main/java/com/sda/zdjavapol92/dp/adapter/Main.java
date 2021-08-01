package com.sda.zdjavapol92.dp.adapter;

import com.sda.zdjavapol92.dp.adapter.adaptery.CzajnikAdapter;
import com.sda.zdjavapol92.dp.adapter.adaptery.LodówkaAdapter;
import com.sda.zdjavapol92.dp.adapter.adaptery.TosterAdapter;
import com.sda.zdjavapol92.dp.adapter.urządzenia.Czajnik;
import com.sda.zdjavapol92.dp.adapter.urządzenia.Lodówka;
import com.sda.zdjavapol92.dp.adapter.urządzenia.Toster;

public class Main {
    public static void main(String[] args) {
        ManagerUrzadzenKuchennych managerUrzadzenKuchennych = new ManagerUrzadzenKuchennych();

        // w tym przypadku użyliśmy kompozycji (obiekty/urządzenia są POLEM klasy a nie są dziedzione)
        Czajnik czajnik = new Czajnik();
        managerUrzadzenKuchennych.addDevice(new CzajnikAdapter(czajnik));
        Toster toster = new Toster();
        managerUrzadzenKuchennych.addDevice(new TosterAdapter(toster));

        // w tym przypadku użyliśmy dziedziczenia, wiec obiekt lodówka z poniższej linii jest niepotrzebny
        Lodówka lodówka = new Lodówka();
        managerUrzadzenKuchennych.addDevice(new LodówkaAdapter());

    }
}
