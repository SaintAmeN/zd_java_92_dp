package com.sda.zdjavapol92.dp.adapter.urządzenia;

// nie możemy odziedziczyć bo jest final
public final class Czajnik {
    private boolean włączony;
    public void uruchom(){
        włączony = true;
    }

    public void wyłącz(){
        włączony = false;
    }

    public boolean sprawdzCzyWłączony(){
        return włączony;
    }
}
