HTTP Server

项目名称：httpserver
使用工具：IntelliJ IDEA

先使用IJ软件部署SpringBoot+Mybatis+Velocity框架 
添加该有的pom.xml文件，和Mybatis的相关文件



1. 先开始建立Model层与数据库每个表的字段相对应，Student对应student表，Grade对应grade表!

2. 开始建立DAO层实现题目要求对每个表的增删改查(CDUS)  ，GradeDAO处理的是对班级的信息进行CDUS，StudentDAO处理的是对学生信息的CDUS，这里使用的是Mybatis注解，如果比较复杂的MySQL语句可以使用XML!

3. 然后建立Service层实现对整个项目的业务化，调用DAO层的接口，StudentService层对注册和更新学生的业务处理，GradeService层对注册和更新班级的业务处理，QueryService层实现查找学生所在班级的总分的业务，以及查找最高分学生所在班级的教师姓名的业务!

4. 最后建立RegisterController层实现对学生，班级的注册，QueryController层实现对最高分学生所在班级的教师姓名的查询，以及对学生所在的班级的总分的查询!

templates：
	Error.html 注册学生，班级失败返回的页面!
	Success.html 注册学生，班级成功返回的页面！
	Register.html 是对学生，班级的注册页面!
	Result.html 是对查询最高分学生所在班级的教师姓名，以及学生所在的班级的总分返回结果的页面!


本地使用localhost:8080/  进入注册页面
	localhost:8080/get-class-total-score/<student id>    查询学生所在的班级的总分
	localhost:8080/get-top-teacher        	查询最高分学生所在班级的教师姓名

