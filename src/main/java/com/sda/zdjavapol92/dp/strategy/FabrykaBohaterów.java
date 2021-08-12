package com.sda.zdjavapol92.dp.strategy;

import com.sda.zdjavapol92.dp.observer.wersja_boska.SerwerPowiadomien;
import com.sda.zdjavapol92.dp.observer.wersja_normalna.nadawcy.INadawca;

public interface FabrykaBohaterów {

    /**
     * Stworzenie bohatera który subskrybował do wiadomości
     * @param imie - imie
     * @param nadawca - klasa która może powiadamiać bohatera o nowych wiadomościach
     * @return bohater subskrybowany
     */
    public static Bohater stworzBohatera(String imie, INadawca nadawca){
        Bohater bohater = new Bohater(imie);
        nadawca.zarejestruj(bohater);
        return bohater;
    }

    public static Bohater stworzBohateraIZarejestruj(String imie){
        Bohater bohater = new Bohater(imie);
        SerwerPowiadomien.INSTANCE.zarejestruj(bohater);
        return bohater;
    }
}
