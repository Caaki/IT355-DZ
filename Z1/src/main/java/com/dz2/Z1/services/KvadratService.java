package com.dz2.Z1.services;

import com.dz2.Z1.models.Kvadrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KvadratService {
    @Autowired
    private Kvadrat kvadrat;

    public KvadratService() {
    }

    public void ispisiObim(){
        System.out.println("Obim je: " +kvadrat.obim());
    }

    public void ispisiPovrsinu(){
        System.out.println("Povrsina je: "+ kvadrat.povrsina());
    }


    public Kvadrat getKvadrat() {
        return kvadrat;
    }
}
