package com.sda.zdjavapol92.dp.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;

    private String imie;
    private String nazwisko;
    private String pesel;
    private String indeks;
    private Double średnia;
}
