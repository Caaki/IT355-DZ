package com.dz2.Z1.models;

import com.dz2.Z1.interfaces.Oblik;

public class Krug implements Oblik {

    private int poluprecnik;

    public Krug() {
    }

    public Krug(int poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public int getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(int poluprecnik) {
        if (poluprecnik<=0){
            throw new RuntimeException();
        }
        this.poluprecnik = poluprecnik;
    }


    @Override
    public double obim() {
        return 2*poluprecnik*Math.PI;
    }

    @Override
    public double povrsina() {
        return Math.PI*Math.pow(poluprecnik,2);
    }
}
