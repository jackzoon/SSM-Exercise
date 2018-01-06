package com.halen.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect //声明切面
public class UserAspect {

    //拦截com.halen.service下所有的类以及类下所有的方法
    @Pointcut(value = "execution(* com.halen.service.*.*(..))")
    public void pointCut() {
    }

    //advice  我要干什么事情，什么时候干
    //前置通知
    @Before(value = "pointCut()")
    public void doBefore(JoinPoint joinPoint) {//连接点 程序执行的点
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println(name+"   "+args.toString());
    }

    //后置通知
    @After(value = "pointCut()")
    public void doAfter(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println(name);
    }

    //返回值通知
    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterRetruning(JoinPoint joinPoint, Object result) {
        System.out.println(result);
    }

    //环绕通知
    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
