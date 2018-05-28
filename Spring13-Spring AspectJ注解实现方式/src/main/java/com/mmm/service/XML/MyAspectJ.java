package com.mmm.service.XML;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 当前类就是 整个程序中需要的各种系统级业务
 * 就是一个切面类
 */
@Aspect
public class MyAspectJ {
    //前置增强
    @Before("execution(* *..UserService.sleep(..))")
    public void before(){
        System.out.println("前置增强");
    }

    //后置增强
    @AfterReturning("execution(* *..UserService.sleep(..))")
    public void afterReturning(){
        System.out.println("后置增强");
    }

    //如果想获取方法的返回值
    @AfterReturning(value = "execution(* *..UserService.slppe(..))",returning = "result")
    //后置增强带参数
    public void afterReturning(String result){
        System.out.println("后置增强"+result);
    }

    /**
     * 环绕增强可以改变返回值
     */
    //环绕增强  必须需要一个参数
    @Around("execution(* *..UserService.eat(..))")
    public Object around(ProceedingJoinPoint point){
        System.out.println("环绕增强进来···········");

        Object result=null;
        try {
            result= point.proceed();//执行目标方法


        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("环绕增强出去·········");
        return "多米多";
    }


}
