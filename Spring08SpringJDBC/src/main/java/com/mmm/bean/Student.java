package com.mmm.bean;

/**
 * 实体类
 */
public class Student {


    private int sid;

    private String sname;

    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
