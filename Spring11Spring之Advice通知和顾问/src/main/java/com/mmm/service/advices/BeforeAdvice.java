package com.mmm.service.advices;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置通知
 */
public class BeforeAdvice implements MethodBeforeAdvice {
    /**
     * 在目标方法执行之前
     * @param method  目标方法
     * @param objects  目标方法参数列表
     * @param o        目标对象
     * @throws Throwable
     */

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
/*
        System.out.println("target的名称===》"+o);
        System.out.println("method的名称"+method.getName());
*/
        System.out.println("执行--前置--通知");



    }
}
