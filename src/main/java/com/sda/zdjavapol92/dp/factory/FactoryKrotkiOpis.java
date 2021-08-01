package com.sda.zdjavapol92.dp.factory;

public class FactoryKrotkiOpis {
    // Factory występuje w 3 formach (metoda stworzeniowa) :
    //  - factory method
    //  - abstract factory
    //  - factory
    // Jestem klientem który jest zainteresowany zakupem samochodu.
    // Istnieje potrzeba zdefniowania pewnych obiektów/lub ich rodzajów które (mają się zachowywać/mają być zbudowane )
    //  w pewien zamierzony z góry sposób. Chcemy żeby istaniły obiekty które są praktyczne i (mają) bardzo określone (pola).


    // Dla każdego wzorca
    // Wystąpienie w java?  Executors.new
    // Budowa               OK
    // Jak stworzyć?        Tworzymy metodę która jest statyczna/factory, która przyjmuje mniej parametrów niż pełny konstruktor (część
    //                         parametrów jest wypełniona). Metoda zwraca obiekt stworzony.
    // Jak użyć?            OK
    // Kiedy używać?        1. Kiedy chcemy zabronić dostępu do tworzenia dodatkowych obiektów poza package - opcjonalne wymaganie
    //                      2. Kiedy chcemy stworzyć pewien praktyczny obiekt który tworzymy we wielu miejscach
    //                          Jeśli widzimy wiele miejsc gdzie wywołujemy stworzenie tego samego obiektu to warto
    //                          "wyciągnąć stworzenie obiektu" do metody factory.
    //                      3. Ułatwia tworzenie obiektów "znanych"/"sparametryzowanych"
    //                      4. Jeśli jest jedna metoda stworzeniowa, to przeważnie jest to factory method w klasie instancji tworzonej.
    //                      5. Celem factory jest zgromadzenie WIELU METOD STWORZENIOWYCH.
    // Kiedy nie używać?    Kiedy metoda stworzeniowa ma za zadanie wyłącznie skopiować konstruktor.
}
