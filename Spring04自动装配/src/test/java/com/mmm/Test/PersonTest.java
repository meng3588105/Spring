package com.mmm.Test;

import com.mmm.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    @Test
    public void test(){

        ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");

        //获取主人信息
        Person person = (Person) context.getBean("person");
        System.out.println(person);

    }
}
