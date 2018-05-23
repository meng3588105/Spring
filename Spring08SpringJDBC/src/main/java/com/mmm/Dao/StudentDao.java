package com.mmm.Dao;

import com.mmm.bean.Student;

import java.io.Serializable;
import java.util.List;

/**
 * DAO层接口
 */
public interface StudentDao {



    int addStudent(Student student);
    int delStudent(Serializable id);
    int updateStudent(Student student);

    List<Student> findAllStudents();




}
