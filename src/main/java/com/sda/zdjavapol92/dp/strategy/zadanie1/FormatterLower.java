package com.sda.zdjavapol92.dp.strategy.zadanie1;

public class FormatterLower implements IFormatterCzcionki{
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.toLowerCase();
    }
}
