package com.mmm.Test;

import com.mmm.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle {

    @Test
    public void Test01(){

        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Student student= context.getBean("student", Student.class);
        System.out.println(student);
        ((ClassPathXmlApplicationContext)context).close();  //关闭容器



    }
}
