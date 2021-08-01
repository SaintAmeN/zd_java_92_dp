package com.sda.zdjavapol92.dp.strategy.zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drukarka drukarka = new Drukarka();

        boolean praca = true;
        String komenda;

        do {
            System.out.println("Podaj komendę: [zmien, formatuj]");
            komenda = scanner.nextLine();

            // split taki jak napisany niżej spowoduje że komenda zostanie podzielona po spacji, ale stworzone zostaną
            // tylko 2 kolumny (w tabeli).
            String[] slowa = komenda.split(" ", 2);
            // zmien, splitter
            // 0    , 1
            // formatuj, to jest jakiś inny tekst który chce sformatować ale nie ma mieć więcej kolumn niż dwie
            // 0         1 ...
            if (slowa[0].equalsIgnoreCase("zmien")) {
                String formatter = slowa[1].toUpperCase();
                // todo: ustawianie formattera w drukarce
                switch (formatter) {
                    case "UPPER":
                        drukarka.setFormatterCzcionki(new FormatterUpper());
                        break;
                    case "LOWER":
                        drukarka.setFormatterCzcionki(new FormatterLower());
                        break;
                    case "TRIM":
                        drukarka.setFormatterCzcionki(new FormatterTrim());
                        break;
                    case "INVERTER":
                        drukarka.setFormatterCzcionki(new FormatterInverter());
                        break;
                    case "SPLITTER":
                        drukarka.setFormatterCzcionki(new FormatterSplitter());
                        break;
                    default:
                        System.err.println("Nie ustawiam formattera.");
                }
            } else if (slowa[0].equalsIgnoreCase("formatuj")) {
                String resztaTekstuWLinii = slowa[1];
                drukarka.drukuj(resztaTekstuWLinii);

            } else if (slowa[0].equalsIgnoreCase("quit")) {
                praca = false;
            }
        } while (praca);
    }
}
