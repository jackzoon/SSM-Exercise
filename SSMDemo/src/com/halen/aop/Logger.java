package com.halen.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {

    public void doLog(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
