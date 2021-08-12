package com.sda.zdjavapol92.dp.observer.wersja_normalna.wiadomosc;

public class Wiadomosc implements IWiadomosc{
    private final String tresc;
    private final TypWiadomosci typ;

    public Wiadomosc(String tresc, TypWiadomosci typ) {
        this.tresc = tresc;
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Wiadomosc{" +
                "tresc='" + tresc + '\'' +
                '}';
    }

    @Override
    public TypWiadomosci getTypWiadomosci() {
        return typ;
    }
}
