package com.sda.zdjavapol92.dp.szyfrator;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Map;

public class SzyfratorMapujacy implements ISzyfrator{
    private final BiMap<Character, Character> klucze = HashBiMap.create();
    public void dodaj(char znakMapowanieZ, char znakMapowanieNa){
        klucze.put(znakMapowanieZ, znakMapowanieNa);
    }

    @Override
    public String szyfruj(String tekst) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            char litera = tekst.charAt(i);
            if (klucze.containsKey(litera)) {
                // podmieniamy jeśli mamy czym
               builder.append(klucze.get(litera));
            } else {
                builder.append((char) litera);
            }
        }
        return builder.toString();
    }

    @Override
    public String odszyfruj(String tekst) {
        BiMap<Character, Character> inverseMap = klucze.inverse();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            char litera = tekst.charAt(i);
            if (inverseMap.containsKey(litera)) {
                // podmieniamy jeśli mamy czym
                builder.append(inverseMap.get(litera));
            } else {
                builder.append((char) litera);
            }
        }
        return builder.toString();
    }
}
