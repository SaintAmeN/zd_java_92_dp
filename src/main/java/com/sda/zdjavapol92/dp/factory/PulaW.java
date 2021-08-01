package com.sda.zdjavapol92.dp.factory;

import java.util.concurrent.*;

public class PulaW {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(0, 120, 60, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>());

        // metoda stworzeniowa
        // niektóre rzeczy zostały stworzone ponieważ są praktyczne i mamy je dostępne w bibliotece
        ExecutorService executor1 = Executors.newCachedThreadPool();
    }
}
