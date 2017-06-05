package com.jinhui.Controller;

import com.jinhui.Service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/6/4.
 */
@Controller
public class QueryController {

    @Autowired
    private QueryService queryService;

    @RequestMapping(value = "/get-class-total-score/{studentid}",method = RequestMethod.GET)    //查询学生所在班级的总分
    public String queryScore(@PathVariable(value = "studentid") int id, Model model){
        model.addAttribute("number",1);   //给Result.html页面判断是查询总分来用

        int score=queryService.queryScore(id);
        if(score>0){            //查询到该总分
            model.addAttribute("total",score);
        }else{            //查询不到该总分
            model.addAttribute("error","student-not-found");
        }

        return "Result";
    }

    @RequestMapping(value = "/get-top-teacher",method = RequestMethod.GET)
    public String queryTeacher(Model model){
        model.addAttribute("number",2);     //给Result.html页面判断是查询教师名字来用
        model.addAttribute("teacher",queryService.getTeacher());    //存储该教师的名字

        return "Result";
    }

}
