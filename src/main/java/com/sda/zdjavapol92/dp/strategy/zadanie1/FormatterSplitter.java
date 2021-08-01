package com.sda.zdjavapol92.dp.strategy.zadanie1;

public class FormatterSplitter implements IFormatterCzcionki{
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        char[] tablicaZnakow = tekstDoZamiany.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for(char c : tablicaZnakow){
            stringBuilder.append(c).append(' ');
        }
        return stringBuilder.toString();
    }
    // +
}
