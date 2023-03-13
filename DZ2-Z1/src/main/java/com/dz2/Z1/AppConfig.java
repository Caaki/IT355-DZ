package com.dz2.Z1;

import com.dz2.Z1.models.JednakostranicniTrougao;
import com.dz2.Z1.models.Krug;
import com.dz2.Z1.models.Kvadrat;
import com.dz2.Z1.services.JednakostranicniService;
import com.dz2.Z1.services.KrugService;
import com.dz2.Z1.services.KvadratService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AppConfig {

    @Bean
    public Kvadrat kvadrat(){
        return new Kvadrat();
    }

    @Bean
    public Krug krug(){
        return new Krug();
    }

    @Bean
    public JednakostranicniTrougao jednakostranicniTrougao(){
        return new JednakostranicniTrougao();
    }

    @Bean
    public JednakostranicniService jednakostranicniService(){
        return new JednakostranicniService();
    }

    @Bean
    public KvadratService kvadratService(){
        return new KvadratService();
    }

    @Bean(name = "krugService")
    public KrugService krugService(){
        return new KrugService();
    }


}
