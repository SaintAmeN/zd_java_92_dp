package com.sda.zdjavapol92.dp.singleton;

public class SingletonKrotkiOpis {
    // wzorzec i antywzorzec
    // Zadaniem wzorców projektowych jest rozwiązywanie naszych problemów programistycznych.
    // Pewne problemy programistyczne które zostały zidentyfikowane jakiś czas temu zostały rozwiązane w pewien sposób tworząc wzorzec.
    // EventDispatcher

    // Dla każdego wzorca
    // Budowa               OK
    // Jak stworzyć?        OK
    // Jak użyć?            OK
    // Kiedy używać?        OK  Kiedy chcemy mieć jeden "boski obiekt" który jest dostępny wszędzie/statycznie
    //                          Kiedy ten obiekt wymaga stanu (np. może przechowywać zmienne)
    // Kiedy nie używać?    OK  Kiedy chcemy mieć jeden "boski obiekt" który jest dostępny wszędzie/statycznie
    //                          NIGDY NIE NADUŻYWAJMY - to najgorszy błąd
    //                          Nadużywanie sprawia że aplikacja staje się statyczna - a to jest 'bebe' i Paweł będzie krzyczał

    // Singleton - istnieje jedna instancja danej klasy na cały program i nie może powstać druga!
    //      - instancja jest ogólnie dostępna wszędzie w obrębie całego kodu.
    //      - jakieś problemy? tak - instancja ma się tworzyć wcześnie?
    //                             - instancja ma się tworzyć późno (przy pierwszym użyciu)?
    //                             - jeśli wcześnie, to jak wcześnie? Czy może dojść do sytuacji że wiele wątków może
    //                                  ścigać się o stworzenie tej instancji?
    //      - jeśli coś jest static - łamie obiektowość

}
