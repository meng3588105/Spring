package com.mmm.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * 实体类
 */
public class Student implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean{

    private int age ;//年龄
    private String stuName;//姓名

    private String beanName;//bean 在容器中的id或者name
    private BeanFactory beanFactory;//bean所在的工厂

    public Student() {
        System.out.println("===Student类中的无参构造==");
    }

    /**
     * BeanFactoryAware中的setBeanFactory（）
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("===执行了BeanNameAware接口中的setBeanFactory（）");
        this.beanFactory=beanFactory;
    }

    /**
     * BeanNameAware接口中的setBeanName()
     */
    @Override
    public void setBeanName(String beanName) {
        System.out.println("===执行了BeanNameAware接口中的setBeanName");
        this.beanName=beanName;
    }

    public  void myDestroy(){
        System.out.println("===Student类中的myDestroy（）===");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("===DisposableBean中的destroy()===");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("===InitializingBean中的afterPropertiesSet()===");

    }
    public void initMethod(){
        System.out.println("===Student类中的initMethod（）===");
    }
    public void setAge(int age) {
        System.out.println("===Student类中给属性赋值 setAge()===");

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getBeanName() {
        return beanName;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", beanName='" + beanName + '\'' +
                ", beanFactory=" + beanFactory +
                '}';
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
