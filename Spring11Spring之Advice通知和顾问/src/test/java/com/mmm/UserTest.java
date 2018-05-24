package com.mmm;

import com.mmm.service.UserService;
import com.mmm.service.exceptionPackage.ExceptionService;
import com.mmm.service.exceptionPackage.UserException;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    //前置 后置 通知测试
    @Test
    public void testBefore(){
        ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
        UserService service =context.getBean("userProxy",UserService.class);
        service.eat();
        System.out.println("********");
        service.sleep();
    }

    //环绕 通知测试
    @Test
    public void testAround(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        UserService service=  context.getBean("userProxy",UserService.class);
        String result= service.eat();
        System.out.println(result);
        System.out.println("*************");
        service.sleep();
    }

    //异常通知测试
    @Test
    public void testException(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        ExceptionService service= (ExceptionService) context.getBean("exceptionProxy");
        try {
            service.checkUser("admin",25);
        } catch (UserException e) {
            e.printStackTrace();
        }

    }




}
