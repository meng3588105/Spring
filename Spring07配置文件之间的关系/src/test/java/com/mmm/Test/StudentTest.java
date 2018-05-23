package com.mmm.Test;


import com.mmm.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {


    @Test
    public void Test(){
        /**
         * 加载的主配置文件
         *  ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
         Student student= (Student) context.getBean("student");
         System.out.println(student);
         */
        //ApplicationContext context=new ClassPathXmlApplicationContext("Spring-*.xml");
          ApplicationContext context=new ClassPathXmlApplicationContext("spring-student.xml","spring-grade.xml");
        Student student= (Student) context.getBean("student");
        System.out.println(student);

    }



}
