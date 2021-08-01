package com.sda.zdjavapol92.dp.builder;

public class Bohater {
    private String imie;
    private String nazwisko;
    private String imieMatki;
    private String imieOjca;
    private String imiePsa;
    private String imieKota;
    private String imieSiostry;
    private String imieBrata;
    private String imieBabci;
    private double wzrost;
    private double waga;
    private double obwódWPasie;
    private double obwódKlatki;
    private double wielkośćButa;

    // 1. Tworzymy konstruktor pełny
    // 2. Tworzymy klasę wewnętrzną o nazwie Builder (pusta klasa) (public static class Builder)
    // 3.
    //    a. Klik prawym na konstruktor
    //    b. Klik refactor
    //    c. replace constructor with builder
    //    d. w okienku na samym dole wybieramy "use existing"
    //    e. wybieramy wewnątrz projektu naszą klasę i wniej klasę Builder
    private Bohater(String imie, String nazwisko, String imieMatki, String imieOjca, String imiePsa, String imieKota,
                   String imieSiostry, String imieBrata, String imieBabci, double wzrost, double waga,
                   double obwódWPasie, double obwódKlatki, double wielkośćButa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.imieMatki = imieMatki;
        this.imieOjca = imieOjca;
        this.imiePsa = imiePsa;
        this.imieKota = imieKota;
        this.imieSiostry = imieSiostry;
        this.imieBrata = imieBrata;
        this.imieBabci = imieBabci;
        this.wzrost = wzrost;
        this.waga = waga;
        this.obwódWPasie = obwódWPasie;
        this.obwódKlatki = obwódKlatki;
        this.wielkośćButa = wielkośćButa;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public static class Builder{
        // wartość pola obiektowego == null
        // watość pola liczbowego == możliwie najbliższa zeru
        //                  double = 0
        //                  short = 0
        //                  boolean = false
        private String imie;
        private String nazwisko;
        private String imieMatki;
        private String imieOjca;
        private String imiePsa;
        private String imieKota;
        private String imieSiostry;
        private String imieBrata;
        private String imieBabci;
        private double wzrost;
        private double waga;
        private double obwódWPasie;
        private double obwódKlatki;
        private double wielkośćButa;

        public Builder setImie(String imie) {
            this.imie = imie;
            return this;
        }

        public Builder setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
            return this;
        }

        public Builder setImieMatki(String imieMatki) {
            this.imieMatki = imieMatki;
            return this;
        }

        public Builder setImieOjca(String imieOjca) {
            this.imieOjca = imieOjca;
            return this;
        }

        public Builder setImiePsa(String imiePsa) {
            this.imiePsa = imiePsa;
            return this;
        }

        public Builder setImieKota(String imieKota) {
            this.imieKota = imieKota;
            return this;
        }

        public Builder setImieSiostry(String imieSiostry) {
            this.imieSiostry = imieSiostry;
            return this;
        }

        public Builder setImieBrata(String imieBrata) {
            this.imieBrata = imieBrata;
            return this;
        }

        public Builder setImieBabci(String imieBabci) {
            this.imieBabci = imieBabci;
            return this;
        }

        public Builder setWzrost(double wzrost) {
            this.wzrost = wzrost;
            return this;
        }

        public Builder setWaga(double waga) {
            this.waga = waga;
            return this;
        }

        public Builder setObwódWPasie(double obwódWPasie) {
            this.obwódWPasie = obwódWPasie;
            return this;
        }

        public Builder setObwódKlatki(double obwódKlatki) {
            this.obwódKlatki = obwódKlatki;
            return this;
        }

        public Builder setWielkośćButa(double wielkośćButa) {
            this.wielkośćButa = wielkośćButa;
            return this;
        }

        public Bohater createBohater() {
            return new Bohater(imie, nazwisko, imieMatki, imieOjca, imiePsa, imieKota, imieSiostry, imieBrata, imieBabci, wzrost, waga, obwódWPasie, obwódKlatki, wielkośćButa);
        }
    }
}
