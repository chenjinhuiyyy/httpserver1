HTTP Server

��Ŀ���ƣ�httpserver
ʹ�ù��ߣ�IntelliJ IDEA

��ʹ��IJ�������SpringBoot+Mybatis+Velocity��� 
��Ӹ��е�pom.xml�ļ�����Mybatis������ļ�



1. �ȿ�ʼ����Model�������ݿ�ÿ������ֶ����Ӧ��Student��Ӧstudent��Grade��Ӧgrade��!

2. ��ʼ����DAO��ʵ����ĿҪ���ÿ�������ɾ�Ĳ�(CDUS)  ��GradeDAO������Ƕ԰༶����Ϣ����CDUS��StudentDAO������Ƕ�ѧ����Ϣ��CDUS������ʹ�õ���Mybatisע�⣬����Ƚϸ��ӵ�MySQL������ʹ��XML!

3. Ȼ����Service��ʵ�ֶ�������Ŀ��ҵ�񻯣�����DAO��Ľӿڣ�StudentService���ע��͸���ѧ����ҵ����GradeService���ע��͸��°༶��ҵ����QueryService��ʵ�ֲ���ѧ�����ڰ༶���ֵܷ�ҵ���Լ�������߷�ѧ�����ڰ༶�Ľ�ʦ������ҵ��!

4. �����RegisterController��ʵ�ֶ�ѧ�����༶��ע�ᣬQueryController��ʵ�ֶ���߷�ѧ�����ڰ༶�Ľ�ʦ�����Ĳ�ѯ���Լ���ѧ�����ڵİ༶���ֵܷĲ�ѯ!

templates��
	Error.html ע��ѧ�����༶ʧ�ܷ��ص�ҳ��!
	Success.html ע��ѧ�����༶�ɹ����ص�ҳ�棡
	Register.html �Ƕ�ѧ�����༶��ע��ҳ��!
	Result.html �ǶԲ�ѯ��߷�ѧ�����ڰ༶�Ľ�ʦ�������Լ�ѧ�����ڵİ༶���ַܷ��ؽ����ҳ��!


����ʹ��localhost:8080/  ����ע��ҳ��
	localhost:8080/get-class-total-score/<student id>    ��ѯѧ�����ڵİ༶���ܷ�
	localhost:8080/get-top-teacher        	��ѯ��߷�ѧ�����ڰ༶�Ľ�ʦ����

