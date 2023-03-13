package com.dz2.Z1.services;

import com.dz2.Z1.models.Krug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KrugService {

    @Autowired
    private Krug krug;

    public KrugService() {
    }

    public void ispisiObim(){
        System.out.println("Obim je: " +krug.obim());
    }

    public void ispisiPovrsinu(){
        System.out.println("Povrsina je: "+ krug.povrsina());
    }

    public Krug getKrug() {
        return krug;
    }
}
