package com.mmm.Test;

import com.mmm.Service.Impl.StudentServiceImpl;
import com.mmm.Service.StudentService;
import com.mmm.bean.Student;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class StudentTest {

    @Test
    public void test01(){
        //实例化service层对象
        StudentService ss = new StudentServiceImpl();
        ss.sleep();
    }

    /**
     * Spring容器的工作
     * 01.创建各种bean对象
     * 02.管理bean之间的关系
     *
     * ApplicationCantext接口有个实现类
     * ClassPathXmlAppLicationContext("Spring.xml")
     *
     *  特点：
     *
     *  spring.xml文件中配置的所有bean都实例化了！
     *
     */
    @Test
    public void test02(){
        //通过spring容器来  实例化 service层对象
        ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
        System.out.println("=============");
        //spring.xml文件中bean的id
        StudentService ss =(StudentService)context.getBean("studentService");
        ss.sleep();
    }

    /**
     * 实现按需加载 不是把核心文件中配置的所有bean都实例化！
     *
     */

    @Test
    public void test03(){
        //通过spring荣起来 实例化 service层对象
        XmlBeanFactory context =new XmlBeanFactory(new ClassPathResource("Spring.xml"));
        System.out.println("==================");
        //spring.xml 文件中bean的id
        StudentService ss =(StudentService)context.getBean("studentService");
        ss.sleep();


    }


    /**
     * 从某个位置获取核心配置文件
     */
    @Test
    public void teat04(){
        //通过spring容器来实例化service层对象
        ApplicationContext context =new FileSystemXmlApplicationContext("E:/Spring.xml");
        System.out.println("==============");
        //spring.xml 文件中bean的id
        StudentService ss =(StudentService)context.getBean("studentService");
        ss.sleep();

    }

    /**
     * 验证单例模式
     * 所有由spring容器创建出来的对象 默认都是单例模式的
     */
    @Test
    public void test05(){
        //通过spring容器来  实例化service层对象
        ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
        System.out.println("===================");
        //Spring.xml 文件中bean的id
        Student stu1=(Student) context.getBean("student");
        System.out.println(stu1);
        Student stu2 =(Student)context.getBean("student");
        System.out.println(stu1==stu2);


    }


}




