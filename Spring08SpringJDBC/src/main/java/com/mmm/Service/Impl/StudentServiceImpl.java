package com.mmm.Service.Impl;


import com.mmm.Dao.StudentDao;
import com.mmm.Service.StudentService;
import com.mmm.bean.Student;

import java.io.Serializable;
import java.util.List;

/**
 * service层的作用
 *      在不改变dao层代码的前提下，增加业务逻辑操作
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao dao;

    @Override
    public int addStudent(Student student) {
        return dao.addStudent(student);
    }

    public int delStudent(Serializable id) {
        return dao.delStudent(id);
    }

    @Override
    public int updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }
    public StudentDao getDao() {
        return dao;
    }

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }
}
