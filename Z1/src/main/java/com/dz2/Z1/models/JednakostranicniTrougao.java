package com.dz2.Z1.models;

import com.dz2.Z1.interfaces.Oblik;

public class JednakostranicniTrougao implements Oblik {

    private int stranica;


    public JednakostranicniTrougao(int stranicaA) {
        this.stranica = stranicaA;

    }

    public JednakostranicniTrougao() {
    }

    public int getStranicaA() {
        return stranica;
    }

    public void setStranicaA(int stranica) {
        this.stranica = stranica;
    }


    @Override
    public double obim() {
        return stranica*3;
    }

    @Override
    public double povrsina() {
        return (Math.pow(stranica,2)*Math.sqrt(3))/4;
    }
}
