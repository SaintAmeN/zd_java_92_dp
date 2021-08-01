package com.sda.zdjavapol92.dp.strategy.zadanie1;

public class Drukarka {
    private IFormatterCzcionki formatterCzcionki;

    public void setFormatterCzcionki(IFormatterCzcionki formatterCzcionki) {
        this.formatterCzcionki = formatterCzcionki;
    }

    public void drukuj(String tekstDoDruku) {
        if (formatterCzcionki != null) {
            System.out.println(formatterCzcionki.zamienTekst(tekstDoDruku));
        } else {
            System.err.println("Nie ustawiłeś formattera");
        }
    }
}
