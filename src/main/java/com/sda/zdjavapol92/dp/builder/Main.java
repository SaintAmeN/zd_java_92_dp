package com.sda.zdjavapol92.dp.builder;

import com.sda.zdjavapol92.dp.singleton.SingletonV1;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class Main {
    public static void main(String[] args) {
        // Stworzenie obiektu:
        Bohater obiektKtoryTworze = new Bohater.Builder()
                .setObwódKlatki(33)
                .setImie("Marian")
                .setNazwisko("Nowak")
                .createBohater();

        Student student = Student.builder()
                .imie("Jan")
                .nazwisko("Kowalski")
                .build();

    }

    @AllArgsConstructor
    @NoArgsConstructor
    class RekordStudent{
        Long id; // < dodanie do bazy danych z null sprawi że się id ustawi
        String imie;
        String nazwisko; //...
    }
}
