package com.sda.zdjavapol92.dp.proxy;

import java.util.ArrayList;
import java.util.List;

public class ObiektProxy {
    private final List<IZaslonaProxy> klientUzytkowniks = new ArrayList<>();

    public void register(KlientUzytkownik nowyUzytkownik){
        System.out.println(nowyUzytkownik.getImie() + " adres: " + nowyUzytkownik.getIp());
        klientUzytkowniks.add(nowyUzytkownik);
    }

    public void wykonajSprawdzenieNaUzytkownikach(){
        for (IZaslonaProxy uzytkownik : klientUzytkowniks) {
            System.out.println(uzytkownik.getImie());
        }
    }
}
