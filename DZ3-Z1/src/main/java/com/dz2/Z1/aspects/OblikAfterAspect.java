package com.dz2.Z1.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
public class OblikAfterAspect {


    @After("args(stranica)")
    public void  logDodelaVrednost(int stranica){
        System.out.println("Dodenjena je vrednost: "+ stranica);
    }

    @AfterReturning(pointcut = "execution(* getPoluprecnik())", returning = "returnInt")
    public void getPoluprecnikReturnignAdvice(String returnInt){
        System.out.println("getPoluprecnikReturnignAdvice executed. Returned Int=" + returnInt);
    }

    @AfterReturning(pointcut = "execution(* getStranica())", returning = "returnInt")
    public void getStranicaReturnignAdvice(String returnInt){
        System.out.println("getStranicaReturnignAdvice executed. Returned Int=" + returnInt);
    }

    @AfterThrowing("within(com.dz2.Z1.*)")
    public void logException(JoinPoint joinPoint){
        System.out.println("Exception thronw in number exception= "+joinPoint.toString());
        System.exit(0);
    }

}
