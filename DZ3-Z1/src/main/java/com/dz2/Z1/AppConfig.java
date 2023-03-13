package com.dz2.Z1;

import com.dz2.Z1.aspects.OblikAfterAspect;
import com.dz2.Z1.aspects.OblikAroundAspect;
import com.dz2.Z1.aspects.OblikBeforeAspect;
import com.dz2.Z1.models.JednakostranicniTrougao;
import com.dz2.Z1.models.Krug;
import com.dz2.Z1.models.Kvadrat;
import com.dz2.Z1.services.JednakostranicniService;
import com.dz2.Z1.services.KrugService;
import com.dz2.Z1.services.KvadratService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass=true)
@Configuration
public class AppConfig {

    @Bean(name = "kvadrat")
    public Kvadrat kvadrat(){
        return new Kvadrat();
    }

    @Bean(name = "krug")
    public Krug krug(){
        return new Krug();
    }

    @Bean(name = "jednakostranicniTrougao")
    public JednakostranicniTrougao jednakostranicniTrougao(){
        return new JednakostranicniTrougao();
    }

    @Bean(name = "jednakostranicniService")
    public JednakostranicniService jednakostranicniService(){
        return new JednakostranicniService();
    }

    @Bean(name = "kvadratService")
    public KvadratService kvadratService(){
        return new KvadratService();
    }

    @Bean(name = "krugService")
    public KrugService krugService(){
        return new KrugService();
    }

    @Bean(name = "oblikAfterAspect")
    public OblikAfterAspect oblikAfterAspect(){
        return new OblikAfterAspect();
    }

    @Bean(name= "oblikBeforeAspect")
    public OblikBeforeAspect oblikBeforeAspect(){
        return new OblikBeforeAspect();
    }

    @Bean(name="oblikAroundAspect")
    public OblikAroundAspect oblikAroundAspect(){
        return new OblikAroundAspect();
    }


}
