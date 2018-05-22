package com.mmm.bean;

/**
 * 小猫咪类
 */
public class Cat {
    private  String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
