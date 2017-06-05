package com.jinhui.Service;

import com.jinhui.DAO.GradeDAO;
import com.jinhui.DAO.StudentDAO;
import com.jinhui.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/4.
 */
@Service
public class QueryService {

    @Autowired
    private StudentDAO studentDAO;

    @Autowired
    private GradeDAO gradeDAO;

    public int queryScore(int id){     //根据学号查询所在班级的总分
        Student stu=studentDAO.getStudentById(id);   //如果该学号不存在
        if(stu==null){
            return 0;
        }

        int classNum=stu.getClassNumber();
        List<Student> list=studentDAO.queryScore(classNum);    //找出该班级的所有同学
        int sumScore=0;
        for(Student student:list){                //把所有同学的成绩都累加起来
                sumScore+=student.getScore();
        }
        return sumScore;
    }

    public String getTeacher(){              //查询最高分学生所在班级的教师姓名
        int classNum=studentDAO.getclassNumByHighScore();     //获得最高分的学生的班级号码
        return gradeDAO.getTeacher(classNum);                      //获得老师的姓名
    }
}
