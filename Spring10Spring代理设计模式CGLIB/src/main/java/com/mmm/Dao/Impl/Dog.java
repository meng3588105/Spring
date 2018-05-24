package com.mmm.Dao.Impl;

import com.mmm.Dao.Animal;

public class Dog implements Animal {
    //主业务
    @Override
    public void eat() {
        System.out.println("小狗狗在睡觉...");
    }
    //主业务
    @Override
    public void sleep() {
        System.out.println("小狗狗在啃骨头...");
    }
}
