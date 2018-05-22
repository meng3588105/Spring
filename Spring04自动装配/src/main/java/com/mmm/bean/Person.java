package com.mmm.bean;

/**
 * 人类
 */
public class Person {

    private String name;//姓名
    private int age;//年龄
    private Dog dog;//主人的宠物
    private Cat cat;//主人的宠物


    public Person(String name, int age, Dog dog, Cat cat) {
        this.name = name;
        this.age = age;
        this.dog = dog;
        this.cat = cat;
    }

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

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
