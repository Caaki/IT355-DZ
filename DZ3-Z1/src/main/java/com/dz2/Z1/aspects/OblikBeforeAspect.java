package com.dz2.Z1.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class OblikBeforeAspect {


    @Before("execution(* *.get*())")
    public void getStranicaAdvice(){
        System.out.println("Veraca se vrednost stranice!");
    }

}
