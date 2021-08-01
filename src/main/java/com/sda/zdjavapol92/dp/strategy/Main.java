package com.sda.zdjavapol92.dp.strategy;

import com.sda.zdjavapol92.dp.strategy.strategie.StrategiaWalkiMagią;
import com.sda.zdjavapol92.dp.strategy.strategie.StrategiaWalkiMieczem;
import com.sda.zdjavapol92.dp.strategy.strategie.StrategiaWalkiŁukiem;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generatorLiczbLosowych = new Random();

        Bohater bohater = new Bohater("Marian");
        bohater.przedstawSie();
        bohater.walcz();

        for (int i = 0; i < 5; i++) {
            int losowy = generatorLiczbLosowych.nextInt(3);

            if (losowy == 0) {
                bohater.setStrategiaWalki(new StrategiaWalkiMagią());
            } else if (losowy == 1) {
                bohater.setStrategiaWalki(new StrategiaWalkiMieczem());
            } else {
                bohater.setStrategiaWalki(new StrategiaWalkiŁukiem());
            }
            bohater.walcz();
        }
    }
}
