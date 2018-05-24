package com.mmm.service.advices;

import com.mmm.service.exceptionPackage.AgeException;
import com.mmm.service.exceptionPackage.UserNameException;
import org.springframework.aop.ThrowsAdvice;


public class ExceptionAdvice implements ThrowsAdvice {

    /**
     * @param ex 用户名异常
     */
    public  void  afterThrowing(UserNameException ex){
        System.out.println(ex.getMessage());
    }
    /**
     * @param ex 年龄异常
     */
    public  void  afterThrowing(AgeException ex){
        System.out.println(ex.getMessage());
    }
}
