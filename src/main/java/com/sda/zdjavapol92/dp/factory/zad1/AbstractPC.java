package com.sda.zdjavapol92.dp.factory.zad1;

public abstract class AbstractPC {
    //pole tekst - nazwę komputera
    protected String nazwa;

    //pole ComputerBrand - (enum) markę komputera
    protected ComputerBrand brand;

    //pole cpuPower - moc komputera (int 0-100)
    protected int cpuPower; // procesor

    //pole gpuPower - moc grafiki komputera (double 0.00 - 1.00)
    protected int gpuPower; // grafika

    //pole isOverclocked - flaga definiująca czy komputer był "podrasowany"
    protected boolean overclocked; // podkręcony

    public AbstractPC(String nazwa, ComputerBrand brand, int cpuPower, int gpuPower, boolean overclocked) {
        this.nazwa = nazwa;
        this.brand = brand;
        this.cpuPower = cpuPower;
        this.gpuPower = gpuPower;
        this.overclocked = overclocked;
    }
}
