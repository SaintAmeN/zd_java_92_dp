package com.sda.zdjavapol92.dp.strategy.zadanie1;

public class FormatterTrim implements IFormatterCzcionki{
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.trim();
    }
}
