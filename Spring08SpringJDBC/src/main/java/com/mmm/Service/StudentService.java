package com.mmm.Service;

import com.mmm.bean.Student;

import java.io.Serializable;
import java.util.List;

public interface StudentService {


    int  addStudent(Student student);
    int  delStudent(Serializable id);
    int  updateStudent(Student student);
    List<Student> findAllStudents();




}
