package com.jinhui.Service;

import com.jinhui.DAO.GradeDAO;
import com.jinhui.Model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/4.
 */
@Service
public class GradeService {

    @Autowired
    private GradeDAO gradeDAO;

    public int addGrade(Grade grade){    //增加班级
        if(gradeDAO.getGradeByCN(grade.getClassNumber())==null){     //如果该班号不存在
            return gradeDAO.addGrade(grade);     //可以直接增加该班级
        }else{    //该班号存在
            return gradeDAO.updateGrade(grade.getClassNumber(),grade.getTeacher());  //更改
        }
    }

}
