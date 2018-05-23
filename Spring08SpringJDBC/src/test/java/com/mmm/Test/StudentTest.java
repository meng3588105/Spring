package com.mmm.Test;

import com.mmm.Service.Impl.StudentServiceImpl;
import com.mmm.Service.StudentService;
import com.mmm.bean.Student;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;


public class StudentTest {
    ApplicationContext context=null;
    StudentService service =null;
    Logger logger = Logger.getLogger(StudentTest.class);
    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("Spring.xml");
        service=context.getBean("studentService",StudentServiceImpl.class);

    }
    //增加
    @Test
    public void add(){
        service.addStudent(new Student(666,"么么哒"));
    }
    //删除
    @Test
    public void del(){
        service.delStudent(666);
    }
    //修改
    @Test
    public void update(){
        service.updateStudent(new Student(666,"小白白"));
    }
    //查所有
    @Test
    public void findAllStudents(){
        List<Student>students=service.findAllStudents();
        for (Student student:students)
            System.out.println(student);

    }

}




