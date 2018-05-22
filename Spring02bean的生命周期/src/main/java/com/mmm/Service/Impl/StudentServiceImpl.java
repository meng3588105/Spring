package com.mmm.Service.Impl;


import com.mmm.Dao.StudentDao;
import com.mmm.Service.StudentService;

/**
 * service层的作用
 *      在不改变dao层代码的前提下，增加业务逻辑操作
 */
public class StudentServiceImpl implements StudentService{

    public StudentServiceImpl(){
        System.out.println("StudentServiceImpl的无参构造");

    }
    //创造出dao层实例  存在耦合 StudentDao dao=new StudentDaoImpl();
    StudentDao dao;
    @Override
    public void sleep() {
        System.out.println("开始记录日志");//系统级业务
            dao.sleep();//主业务
        System.out.println("结束记录日志");//系统级业务
    }

    @Override
    public String eat() {
        System.out.println("开始记录日志");//系统级业务
        String result =dao.eat();//主业务
        System.out.println("结束记录日志");//系统级业务
        return result;
    }

    public StudentDao getDao(){
        return dao;
    }

    //DI 依赖注入
    public void setDao(StudentDao dao){
        this.dao=dao;
    }

}
