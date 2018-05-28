package com.mmm;

import com.mmm.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void aspectJTest(){
        ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
        UserService service =context.getBean("userService",UserService.class);
        /*service.eat();*/ //这个方法被 环绕增强
        service.sleep();//这个方法被前置后置增强
    }

}
