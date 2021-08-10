package com.sda.zdjavapol92.dp.decorator;

import lombok.Data;

public class Bohater implements IBohater {
    private String imie;
    private int sila;
    private int pktZycia;

    public Bohater(String imie, int sila, int pktZycia) {
        this.imie = imie;
        this.sila = sila;
        this.pktZycia = pktZycia;
    }

    public String getImie() {
        return imie;
    }

    public int getSila() {
        return sila;
    }

    public int getPktZycia() {
        return pktZycia;
    }

    public void walcz(){
        System.out.println("Walczę, moja siła to: " + getSila());
    }

    public void bronieSie(){
        System.out.println("Obrona! Mam " + getPktZycia() + " punktów życia!");
    }
}
