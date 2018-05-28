package com.mmm.service.XML;


import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 纯切面  通过xml的配置   把切面织入到指定的目标方法中
 */
public class MyAspectJ {
    //前置增强
    public void before(){
        System.out.println("前置增强");
    }

    //后置增强
    public void afterReturning(){
        System.out.println("后置增强");
    }

    //环绕增强  必须需要一个参数
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
