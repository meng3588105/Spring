package com.mmm.service.advices;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 后置通知
 */
public class AfterAdvice implements AfterReturningAdvice {

    /**
     * 在目标方法执行之后
     * @param o 目标方法的返回值 我们可以获取返回值 但是不能操作返回值
     * @param method 目标方法
     * @param objects 目标方法的参数列表
     * @param o1 目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
/*
        System.out.println("o1====》"+o1);
        System.out.println("o====》"+o);
        System.out.println("method的名称====》"+method.getName());
*/
        System.out.println("执行**** 后置**** 通知");
    }
}
