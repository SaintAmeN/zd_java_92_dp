package com.sda.zdjavapol92.dp.decorator;

public class DecoratorKrotkiOpis {
    // Wzbogacamy zachowanie obiektu
    // Obiekt który chcemy w jakiś sposób zmodyfikować nie jest edytowalny.
    // Brak możliwości rozszerzania/edycji, jedyne co możemy zrobić to wykorzystać istniejącą impl.


    // Dla każdego wzorca
    // Budowa               -
    // Jak stworzyć?        -
    // Jak użyć?            - Tworzymy klasę która wykorzystując kompozycję (lub dziedziczenie) posiada te same metody
    //                      - i tworzymy do niej interfejs używalny (kopiujemy tam metody których chemy użyć).
    //                      - Implementujemy interfejs w klasie i w dekorowanej klasie.
    //                      -
    //                      -
    // Kiedy używać?        - Kiedy chcemy wzbogacić budowę obiektu i stworzyć obiekty "z warstwami" (wielokrotne dekorowanie)
    //                      - Kiedy nie możemy dziedziczyć i chcemy zmodyfikować zachowanie obiektu
    //                      - Kiedy chcemy "dopisać coś" do metod klasy bez konieczności dziedziczenia i modyfikowania orginalnej klasy
    //                      -
    //                      -
    // Kiedy nie używać?    - kiedy możliwe jest dziedziczenie
}
