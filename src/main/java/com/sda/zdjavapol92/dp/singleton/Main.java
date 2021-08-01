package com.sda.zdjavapol92.dp.singleton;

public class Main {
    public static void main(String[] args) {
        // V1 tworzy się po załadowaniu klasy
        // eager
//        SingletonV1.getInstance().wypiszNazwyPizzy();

        // V2 tworzy się w momencie wywołania getInstance()
        // lazy
//        SingletonV2.getInstance().wypiszNazwyPizzy();

        // V3 tworzy się w momencie wywołania getInstance()
        // lazy
        // jest zabezpieczone wielowątkowo
//        SingletonV3.getInstance().wypiszNazwyPizzy();

        // V4
        // eager jak V1
        SingletonV4.INSTANCE.wypiszNazwyPizzy();
    }
}
