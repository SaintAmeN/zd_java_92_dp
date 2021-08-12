package com.sda.zdjavapol92.dp.szyfrator;

public class Main {
    public static void main(String[] args) {
        // ASCII
        //
        ISzyfrator szyfrator = new SzyfrCezara(5);
        String zaszyfrowane = szyfrator.szyfruj("Paweł lubi koty Bzzzzz!");
        System.out.println(zaszyfrowane);
        String odszyfrowane = szyfrator.odszyfruj(zaszyfrowane);
        System.out.println(odszyfrowane);

    }
}
