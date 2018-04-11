package test;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class test {

    public static void main(String[] args) throws IOException{



        String resource = "conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

       // InputStream is = test.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sessionFactory.openSession();


        String statement = "userMapper.getUser";//映射sql的标识字符串

        tb_student stu = session.selectOne(statement, 1);
        System.out.println(stu);
    }
}
