package com.sda.zdjavapol92.dp.factory.p2;

import com.sda.zdjavapol92.dp.factory.p1.AbstractFabrykaFiat;
import com.sda.zdjavapol92.dp.factory.p1.FabrykaFiat;
import com.sda.zdjavapol92.dp.factory.p1.Samochód;

public class Main {
    public static void main(String[] args) {
//        Samochód s = new Samochód("Lamborghini", "Aventado",
//                6.75, 1000, 600.0, 10, true, "czerwony z bialym paskiem po długości");
        // jak ten szaleniec wszedł do naszej fabryki!?
        // haha, security take those guys...!

        Samochód lamborghini = Samochód.stworzLamborghiniAventado();
        //
        // tworzenie własnych obiektów nie jest dostępne ze względu na modyfikator dostępu.
//        Samochód mojWlasny = new Samochód("Lamborghini", "Aventado", 6.75, 1000, 600.0, 10, true, "czerwony z bialym paskiem po długości");

        // To jest Factory (MUSIMY STWORZYĆ OBIEKT FACTORY DO STWORZENIA OBIEKTU SAMOCHÓD):
        // najmniej popularne
//        FabrykaFiat fabrykaFiat = new FabrykaFiat();
//        Samochód samochód = fabrykaFiat.stworzFiat126p();

        // To jest abstract factory
        // najbardziej popularne jeśli mamy więcej niż 1 metode stworzeniową
        Samochód samochód = AbstractFabrykaFiat.stworzFiat126p();

    }
}
