package com.sda.zdjavapol92.dp.decorator;

public class BohaterNaKoniu implements IBohater{
    private IBohater bohater;
    private int dodatkowaSila = 20;
    private int dodatkowePktZycia = 20;

    public BohaterNaKoniu(IBohater bohater) {
        this.bohater = bohater;
    }

    @Override
    public int getPktZycia() {
        return bohater.getPktZycia() + dodatkowePktZycia;
    }

    @Override
    public int getSila() {
        return bohater.getSila() + dodatkowaSila;
    }

    @Override
    public void walcz() {
        System.out.println("Iiiiihaaa ! Bohater na koniu walczy!");
        System.out.println("Walczę, moja siła to: " + getSila());
    }

    @Override
    public void bronieSie() {
        System.out.println("Iiiiihaaa ! Bohater na koniu broni sie!");
        System.out.println("Obrona! Mam " + getPktZycia() + " punktów życia!");
    }
}
