package com.sda.zdjavapol92.dp.strategy.zadanie1;

public class FormatterInverter implements IFormatterCzcionki{
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        char[] tablicaZnakow = tekstDoZamiany.toCharArray();

        // podmiana następuje w  tablicy
        // czytanie zachodzi ze string'a
        for (int i = 0; i < tekstDoZamiany.length(); i++) {
            if(Character.isUpperCase(tekstDoZamiany.charAt(i))){ // jeśli jest wielka to...
                // zamień na małą literę
                tablicaZnakow[i] = Character.toLowerCase(tekstDoZamiany.charAt(i));
            }else if(Character.isLowerCase(tekstDoZamiany.charAt(i))){ // jeśli jest mała to...
                // zamień na dużą literę
                tablicaZnakow[i] = Character.toUpperCase(tekstDoZamiany.charAt(i));
            }
        }

        return new String(tablicaZnakow);
    }
}
