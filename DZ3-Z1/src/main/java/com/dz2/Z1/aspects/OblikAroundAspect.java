package com.dz2.Z1.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
public class OblikAroundAspect {

    @Around("execution(* obim())")
    @Order(1)
    public Object serviceAround(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Before any service method has been called");
        Object value = null;
        try{
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("After service method from: " + value.getClass());
        return value;
    }


}
