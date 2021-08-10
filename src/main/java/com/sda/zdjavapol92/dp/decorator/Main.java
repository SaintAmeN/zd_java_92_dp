package com.sda.zdjavapol92.dp.decorator;

public class Main {
    public static void main(String[] args) {
        Bohater bohater = FabrykaBohaterow.stwórzSuperBohatera("Marianek");
        bohater.walcz();
        bohater.bronieSie();

        System.out.println();
        System.out.println("Bohater na koniu:");
        BohaterNaKoniu naKoniu = new BohaterNaKoniu(bohater);
        naKoniu.walcz();
        naKoniu.bronieSie();

        System.out.println();
        System.out.println("Bohater na koniu, na koniu:");
        BohaterNaKoniu naKoniuNaKoniu = new BohaterNaKoniu(naKoniu);
        naKoniuNaKoniu.walcz();
        naKoniuNaKoniu.bronieSie();

    }
}
