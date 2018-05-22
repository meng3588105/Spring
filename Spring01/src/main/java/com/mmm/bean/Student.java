package com.mmm.bean;

/**
 * 实体类
 */
public class Student {

    private  Integer id;//学生编号
    private String name ;//学生姓名

    public Student(){
        System.out.println("student类中的无参构造");
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
