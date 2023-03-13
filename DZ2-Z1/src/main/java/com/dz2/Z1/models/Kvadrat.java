package com.dz2.Z1.models;

import com.dz2.Z1.interfaces.Oblik;
import org.springframework.beans.factory.annotation.Autowired;


public class Kvadrat implements Oblik {

    private int stranica;

    public Kvadrat(int stranica) {
        this.stranica = stranica;
    }

    public Kvadrat() {
    }

    public int getStranica() {
        return stranica;
    }

    public void setStranica(int stranica) {
        this.stranica = stranica;
    }

    @Override
    public double obim() {
        return stranica*4;
    }

    @Override
    public double povrsina() {
        return Math.pow(stranica,2);
    }

}
