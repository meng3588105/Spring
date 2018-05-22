package com.mmm.bean;

/**
 * 年级的实体类
 */
public class Grade {
    private int id;
    private String gradeName;

    public Grade(int id, String gradeName) {
        this.id = id;
        this.gradeName = gradeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Grade() {
        super();
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }
}
