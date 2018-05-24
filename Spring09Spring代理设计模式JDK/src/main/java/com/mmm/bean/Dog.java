package com.mmm.bean;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("小狗在啃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("小狗在睡觉");

    }
}
