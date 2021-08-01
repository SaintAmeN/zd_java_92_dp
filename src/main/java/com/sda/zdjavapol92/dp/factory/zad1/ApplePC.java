package com.sda.zdjavapol92.dp.factory.zad1;

public class ApplePC extends AbstractPC{
    private ApplePC(String nazwa, ComputerBrand brand, int cpuPower, int gpuPower, boolean overclocked) {
        super(nazwa, brand, cpuPower, gpuPower, overclocked);
    }

    public static AbstractPC createMacBookPro(){
        return new ApplePC("Pro", ComputerBrand.APPLE, 76, 67, false);
    }

    public static AbstractPC createMacBookAir(){
        return new ApplePC("Air", ComputerBrand.APPLE, 56, 61, false);
    }
}
