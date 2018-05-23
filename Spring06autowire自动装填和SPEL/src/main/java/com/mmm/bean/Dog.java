package com.mmm.bean;

/**
 * 宠物狗类
 */
public class Dog {
    private String name;
    private int age ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {
        System.out.println("Dog的无参构造");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
