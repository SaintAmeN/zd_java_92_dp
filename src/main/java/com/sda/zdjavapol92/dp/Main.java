package com.sda.zdjavapol92.dp;

public class Main {
    // Wzorce projektowe - eleganckie/praktyczne sposoby na rozwiązywanie problemów programistycznych
    //                      life hack - na rozwiązywanie problemów
    //
    // SOLID - jeśli piszemy kod zgodny z SOLID, to jesteśmy super fajni
    //
    // Kategorie:
    //  - stworzeniowe - za stworzenie obiektów
    //                  - builder (problem wielu parametrów w konstruktorze)
    //                  - singleton (problem pojedynczej instancji obiektu)
    //                  - factory / abstract factory (problem częstego tworzenia obiektów pewnego rodzaju)
    //                  -                            (problem ograniczenia możliwości stworzenia własnego obiektu)
    //
    //  - behawioralne - za zachowanie obiektów
    //                  - strategy (problem zachowania obiektu - chcemy żeby możliwe było zmienianie działania obiektu
    //                  -           bez konieczności jego edytowania. Zamiast tego zmieniamy obiekt wewnątrz (Setterem))
    //                  - observer (problem powiadamiania/notyfikowania obiektów poprzez rozgłaszanie - zmienia się stan
    //                              jednego obiektu [observable] a reszta jest o tym poinformowana [observer])
    //
    //  - strukturalne - za strukturę kodu
    //                  - decorator (problem braku możliwości dziedziczenia, dodajemy nowe funkcjonalności bez istotnego
    //                                  ingerowania w istniejącą implementację)
    //                  - adapter   (problem realizowania podobnych funkcjonalności ale nie w jednakowy sposób, np. nazwa
    //                                  metody może być inna)
    //                  - fasada    (problem wykonywania dużej ilości instrukcji który ma być wykonywany często)
    //                  - proxy     (problem ogranicza dostęp do metod oraz wspomaga jasne deklarowanie intecji programisty)
}