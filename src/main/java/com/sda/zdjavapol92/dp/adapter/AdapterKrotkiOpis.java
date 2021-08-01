package com.sda.zdjavapol92.dp.adapter;

public class AdapterKrotkiOpis {
    // Adapter pozwala zmienić wykorzystanie z jednej formy na drugą - adoptuje
    // Stworzyć adaptery dla różnych rozwiązań

    // Dla każdego wzorca
    // Budowa               - OK
    // Jak stworzyć?        - OK
    // Jak użyć?            - Tworzymy klasę (np. CzajnikAdapter) która implementuje nasz zadany (niezbędny) interfejs
    //                      -   np. (IUrządzenieKuchenne) i przyjmuje jako pole obiekt klasy "adaptowanej" (tutaj Czajnik)
    //                      -   następnie dokonujemy adaptacji metod interfejsu na metody klasy (czajnika)
    //                      -   adapter.setDeviceEnabled() => czajnik.uruchom();
    //                      -
    // Kiedy używać?        - Kiedy integrujemy urządzenia lub oprogramowanie różnych producentów
    //                      - Kiedy mamy metodę/implementację która wymaga aby obiekty spełniały pewien kontrakt
    //                      -   ale nie mamy dostepu do tego by modyfikować klasy.
    //                      - Kiedy mamy obiekty o podobnym zachowaniu ale ich metody różnią się od siebie (nazwa)
    //                      - Kiedy zabronione jest dziedziczenie (patrz klasa Lodówka)
    //                      -
    // Kiedy nie używać?    -


}
