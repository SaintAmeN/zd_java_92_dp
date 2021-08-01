package com.sda.zdjavapol92.dp.builder;

public class BuilderKrotkiOpis {
    // W przypadku klasy która posiada wiele pól a jej stworzenie jasno wskazuje potrzebe istnienia wielu konstruktorów.
    // Np. klasa bohater ma 20 pól i możemy go stworzyć wykorzystując dowolną kombinację dowolnych pól.
    // A to wszystko przez polimorfizm - możemy stworzyć wiele konstruktorów...

    // Dla każdego wzorca
    // Budowa               OK
    // Jak stworzyć?        OK
    // Jak użyć?            OK
    // Kiedy używać?        OK  Kiedy nie chcemy bałaganu w konstruktorach i widzimy potrzebę stworzenia 2+ konstruktorów
    //                          Kiedy nie chcemy dodawać wielu konstruktorów z różnymi kombinacjami parametrów.
    // Kiedy nie używać?    OK  Kiedy obiekt jest prymitywny (prosty) i potrzebujemy tylko pustego/pełnego konstruktora
}
