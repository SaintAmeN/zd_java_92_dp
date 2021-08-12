package com.sda.zdjavapol92.dp.szyfrator;

// ilość liter = 26
//  A = 65
//  a = 97
public class SzyfrCezara implements ISzyfrator {
    private int klucz;
    private final int ZNAKOW_W_ALFABECIE = 'Z' - 'A' + 1;

    public SzyfrCezara(int klucz) {
        this.klucz = klucz;
    }

    private String szyfruj(String tekst, int uzytyKlucz) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            char litera = tekst.charAt(i);
            if ((litera >= 'A' && litera <= 'Z')) {
                int znak = litera - 'A'; // K=75 A=65   K-A = 10 (znak w alfabecie)
                znak = znak + uzytyKlucz;     //                   10 + 1000 = 1010
                znak = znak % ZNAKOW_W_ALFABECIE;
                znak = znak + 'A';
                builder.append((char) znak);
            } else if ((litera >= 'a' && litera <= 'z')) {
                int znak = litera - 'a'; // K=75 A=65   K-A = 10 (znak w alfabecie)
                znak = znak + uzytyKlucz;     //                   10 + 1000 = 1010
                while (znak < 0) {
                    znak += ZNAKOW_W_ALFABECIE;
                }
                znak = znak % ZNAKOW_W_ALFABECIE;
                znak = znak + 'a';
                builder.append((char) znak);
            } else {
                builder.append((char) litera);
            }
        }
        return builder.toString();
    }

    @Override
    public String szyfruj(String tekst) {
        return szyfruj(tekst, klucz);
    }

    @Override
    public String odszyfruj(String tekst) {
        return szyfruj(tekst, -klucz);
    }
}
