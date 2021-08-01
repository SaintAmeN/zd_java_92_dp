package com.sda.zdjavapol92.dp.adapter.urządzenia;

public class Toster {
    protected boolean on;

    public void setEnabled(boolean enabled){
        this.on = enabled;
    }

    public boolean isOff(){
        return !on;
    }
}
