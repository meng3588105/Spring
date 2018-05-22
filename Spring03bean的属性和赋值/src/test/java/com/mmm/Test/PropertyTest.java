package com.mmm.Test;


import com.mmm.bean.Grade;
import com.mmm.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyTest {

    @Test
    public void Test01(){

        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        //获取指定的年级
        Grade grade= (Grade) context.getBean("grade");
        System.out.println(grade);
        //获取指定的学生
        Student student= (Student) context.getBean("student");
        System.out.println(student);
    }
}
