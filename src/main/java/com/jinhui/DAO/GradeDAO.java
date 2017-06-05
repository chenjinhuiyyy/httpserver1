package com.jinhui.DAO;

import com.jinhui.Model.Grade;
import org.apache.ibatis.annotations.*;

/**
 * Created by Administrator on 2017/6/4.
 */
@Mapper
public interface GradeDAO {

    String TABLE_NAME = " grade ";
    String INSERT_FIELDS = " classNumber, teacher ";

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values ( #{classNumber},#{teacher} )"})
    int addGrade(Grade grade);  //增加班级

    @Update({"update ",TABLE_NAME ,"set teacher=#{teacher} where classNumber=#{classNumber}"})
    int updateGrade(@Param("classNumber") int classNumber, @Param("teacher") String teacher);  //根据班级号码更改老师

    @Select({"select ", INSERT_FIELDS, " from ", TABLE_NAME, " where classNumber=#{classNumber}"})
    Grade getGradeByCN(int classNumber);   //根据班号查找班级的信息

    @Select({"select teacher from ", TABLE_NAME, " where classNumber=#{classNumber}"})
    String getTeacher(int classNumber);   //根据班号查找该班的老师姓名


}
