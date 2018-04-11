

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/** 
* test Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 9, 2018</pre> 
* @version 1.0 
*/ 
public class testTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception {

    String resource = "conf";
    InputStream inputStream = Resources.getResourceAsStream(resource);

    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sessionFactory.openSession();
empMapper empMapper = sqlSession.getMapper(empMapper.class);
        String statement = "resources/empMapper.getEmp";

           System.out.println(empMapper.getEmps(1001).getEname());


}
@Test
public void Test(){
    book b = new book();
    b.setBname("sql");
    book[] arrays = new book[]{b, b, b};
    String[] arry = new String[]{"a","b","c"};
    List<book> listStrings = Arrays.asList(arrays);
    List<String> listString = Arrays.asList(arry);

    listStrings.stream().map(s -> s.getBname()).forEach(System.out::println);
}

} 
