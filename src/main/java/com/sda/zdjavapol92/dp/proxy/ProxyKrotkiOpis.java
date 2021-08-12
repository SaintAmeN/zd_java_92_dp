package com.sda.zdjavapol92.dp.proxy;

public class ProxyKrotkiOpis {
    // Proxy:
    // Służy w celu zasłaniania części implementacji żeby nie siać dezorientacji dla "przyszłych programistów" utrzymujących kod.
    //
    //  Jeśli przy deklaracji napiszemy jakiego typu spodziewamy się obiektu to jasnym będzie po co go wykorzystujemy w
    //  naszej implementacji.


    // Dla każdego wzorca
    // Wystąpienie w java?  - Pisanie po lewej strony interfejsu a po prawej klasy końcowej (zasada L[iskov])
    // Budowa               - Przekazując obiektA do (innego) obiektuB przypisujemy go nie jako klasę końcową tylko jako
    //                          obiekt interfejsu. W ten sposób w interfejsie możemy zdefiniować wyłącznie metody które
    //                          powinny być używane, a nie tworzymy dezorientacji przekazując obiekt z tysiącem metod.
    //
    // Jak stworzyć?        - j/w
    //
    // Jak użyć?            - j/w - interfejs posiada tylko metody które były specjalnie po to przekazane
    // Kiedy używać?        - kiedy chcemy zasłonić część implementacji
    //
    //
    // Kiedy nie używać?    - -
}
