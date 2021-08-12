package com.sda.zdjavapol92.dp.szyfrator;

public class Main {
    public static void main(String[] args) {
        // ASCII
        //
//        ISzyfrator szyfrator = new SzyfrCezara(5);
        SzyfratorMapujacy szyfrator = new SzyfratorMapujacy();
        szyfrator.dodaj('A', '1');
        szyfrator.dodaj('b', '2');
        szyfrator.dodaj('z', '3');
        szyfrator.dodaj('t', '4');
        szyfrator.dodaj('P', '5');
        szyfrator.dodaj('w', '7');
        szyfrator.dodaj('e', '8');
        szyfrator.dodaj('ł', '9');
        szyfrator.dodaj('l', '-');
        szyfrator.dodaj('u', '+');
        szyfrator.dodaj('i', '!');
        szyfrator.dodaj(' ', 'x');

        String zaszyfrowane = szyfrator.szyfruj("Paweł lubi koty Bzzzzz!");
        System.out.println(zaszyfrowane);
        String odszyfrowane = szyfrator.odszyfruj(zaszyfrowane);
        System.out.println(odszyfrowane);

    }
}
