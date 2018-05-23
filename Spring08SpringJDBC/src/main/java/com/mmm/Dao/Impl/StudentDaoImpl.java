package com.mmm.Dao.Impl;

import com.mmm.Dao.StudentDao;
import com.mmm.bean.Student;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Spring 有一个类叫 JdbcDaoSupport ===》BaseDao
 * JdbcDaoSupport  有一个属性叫JdbcTemplate
 * 在创建JdbcTemplate的时候 需要一个DataSource
 *
 * 我们只需要在配置文件中 配置数据源 即可
 */
public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {


    @Override
    public int addStudent(Student student) {
        String sql = "insert into student values(?,?)";
        return getJdbcTemplate().update(sql, student.getSid(), student.getSname());
    }

    @Override
    public int delStudent(Serializable id) {
        String sql = "delete from student where sid =?";
        return getJdbcTemplate().update(sql, id);
    }

    @Override
    public int updateStudent(Student student) {
        String sql="update student set sname=?  where sid=?";
        return getJdbcTemplate().update(sql,student.getSname(),student.getSid());

    }

    @Override
    public List<Student> findAllStudents() {

        String sql = "select * from student";
        //使用匿名内部类

        return getJdbcTemplate().query(sql, new RowMapper<Student>() {
            /**
             * 这里的ResultSet是返回一个对象！
             * 我们之前使用的是 一个结果集！
             */
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                //创建student对象  依次返回
                Student student = new Student();
                student.setSid(rs.getInt("sid"));
                student.setSname(rs.getString("sname"));
                return student;
            }
        });


    }
}
