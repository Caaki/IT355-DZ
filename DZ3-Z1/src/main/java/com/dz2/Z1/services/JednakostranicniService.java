package com.dz2.Z1.services;

import com.dz2.Z1.models.JednakostranicniTrougao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JednakostranicniService {

    @Autowired
    private JednakostranicniTrougao jednakostranicniTrougao;

    public JednakostranicniService() {
    }
    public void ispisiObim(){
        System.out.println("Obim je: " +jednakostranicniTrougao.obim());
    }

    public void ispisiPovrsinu(){
        System.out.println("Povrsina je: "+ jednakostranicniTrougao.povrsina());
    }

    public JednakostranicniTrougao getJednakostranicniTrougao() {
        return jednakostranicniTrougao;
    }
}
