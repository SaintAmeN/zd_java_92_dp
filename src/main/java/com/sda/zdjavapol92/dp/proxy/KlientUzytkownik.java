package com.sda.zdjavapol92.dp.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class KlientUzytkownik implements IZaslonaProxy{
    private String imie;
    private String ip;
    private String modelKomputer;

    public KlientUzytkownik(String imie, String ip, String modelKomputer) {
        this.imie = imie;
        this.ip = ip;
        this.modelKomputer = modelKomputer;
    }

    @Override // proxy na nas wymusza
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getModelKomputer() {
        return modelKomputer;
    }

    public void setModelKomputer(String modelKomputer) {
        this.modelKomputer = modelKomputer;
    }

    @Override
    public String toString() {
        return "KlientUzytkownik{" +
                "imie='" + imie + '\'' +
                ", ip='" + ip + '\'' +
                ", modelKomputer='" + modelKomputer + '\'' +
                '}';
    }
}
