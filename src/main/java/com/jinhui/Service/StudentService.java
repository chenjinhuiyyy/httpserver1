package com.jinhui.Service;

import com.jinhui.DAO.StudentDAO;
import com.jinhui.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/4.
 */

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public int addStudent(Student student){         //增加学生
        if(studentDAO.getStudentById(student.getId())==null){   //如果该学号的学生不存在
            return studentDAO.addStudent(student);   //增加该学生
        }else{   //该学号的学生存在
            return studentDAO.updateStatus(student.getId(),student.getClassNumber(),student.getScore());  //直接更改学生的信息
        }
    }

}
