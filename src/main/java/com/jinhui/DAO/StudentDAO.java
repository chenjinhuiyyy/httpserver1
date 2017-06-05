package com.jinhui.DAO;

import com.jinhui.Model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/6/4.
 */
@Mapper
public interface StudentDAO {

    String TABLE_NAME = " student ";
    String INSERT_FIELDS = " classNumber, score ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", SELECT_FIELDS,
            ") values (#{id},#{classNumber},#{score} )"})
    int addStudent(Student student);        //注册学生

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where id=#{id}"})
    Student getStudentById(int id);    //根据学生号查询该学生的资料

    @Update({"update ",TABLE_NAME ,"set classNumber=#{classNumber} ,score=#{score} where id=#{id}"})
    int updateStatus(@Param("id") int id, @Param("classNumber") int classNumber, @Param("score") int score);  //根据该学生号码更改学生的状态

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where classNumber=#{classNumber}"})
    List<Student> queryScore(int classNumber);   //根据班号查询当前班的所有学生

    @Select({"select classNumber from ", TABLE_NAME, " group by score order by score desc limit 1 "})
    int getclassNumByHighScore();   //查询最高成绩学生的班级号码  如果分数相同则按学号最小
}
