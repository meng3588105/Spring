package com.mmm.Dao.Impl;

import com.mmm.Dao.StudentDao;

public class StudentDaoImpl implements StudentDao{

    public StudentDaoImpl(){
        System.out.println("StudentDaoImpl的无参构造");
    }

    public void sleep(){
        System.out.println("学生正在睡觉");
    }


    public String eat(){
        System.out.println("学生正在吃饭");
        return "苹果";
    }


}
