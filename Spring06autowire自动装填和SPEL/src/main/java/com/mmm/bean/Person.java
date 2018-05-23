package com.mmm.bean;

import java.io.Serializable;

/**
 * 人类
 */
public class Person implements Serializable{

    private int age;//年龄
    private String name;//姓名
    private Dog dog ;//养的小狗




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Person() {
        System.out.println("Person的无参构造");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
