package com.jinhui.Controller;

import com.jinhui.Model.Grade;
import com.jinhui.Model.Student;
import com.jinhui.Service.GradeService;
import com.jinhui.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/6/4.
 */
@Controller
public class RegisterController {


    @Autowired
    private StudentService studentService;
    @Autowired
    private GradeService gradeService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String login(){     //直接访问到注册的页面
        return "Register";
    }

    @RequestMapping(value = "/register-student",method = RequestMethod.POST)
    public String registerSdudent(@RequestParam (value = "id") int id,     //注册学生的信息 从Register.html页面来的
                                   @RequestParam (value = "classNumber") int classNumber,
                                   @RequestParam (value = "score") int score, Model model){

        Student student=new Student();
        student.setId(id);
        student.setClassNumber(classNumber);
        student.setScore(score);

        if(studentService.addStudent(student)>0){    //增加学生信息成功
            model.addAttribute("attribute","student");
            return "Success";
        }else{             //增加学生信息失败
            model.addAttribute("attribute","student");
            return "Error";
        }

    }

    @RequestMapping(value = "/register-class",method = RequestMethod.POST)
    public String registerGrade( @RequestParam (value = "classNumber") int classNumber,     //注册班级的信息 从Register.html页面来的
                                 @RequestParam (value = "teacher") String teacher,Model model){

        Grade grade=new Grade();
        grade.setClassNumber(classNumber);
        grade.setTeacher(teacher);
        if(gradeService.addGrade(grade)>0){
            model.addAttribute("attribute","grade");  //增加班级信息成功
            return "Success";
        }
        else{               //增加班级信息失败
            model.addAttribute("attribute","grade");
            return "Error";
        }
    }

}
