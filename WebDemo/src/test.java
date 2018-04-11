import com.sun.org.apache.xpath.internal.SourceTree;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class test {

    public static void main(String[] args) throws IOException {


        String resource = "conf";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();


//empMapper empMapper = sqlSession.getMapper(empMapper.class);
//        String statement = "resources/empMapper.getEmp";
//         emp emp = session.selectOne(statement,1001);
//           System.out.println(empMapper.getEmps(1001));


        System.out.println("成功");
        // String statement = "userMapper.getStu";//映射sql的标识字符串

        // tb_student stu = sqlSession.selectOne(statement, 1);
        // System.out.println(stu.getOpenid());

        //  userMapper userMapper = sqlSession.getMapper(userMapper.class);
//        empMapper empMapper = sqlSession.getMapper(empMapper.class);
////
//
//        System.out.println(empMapper.getEmps(7369).getDept().getDname());

//        deptMapper deptMapper = sqlSession.getMapper(deptMapper.class);

//      List<emp> emps =   deptMapper.findDeptSales("SALES").getEmps();
//      emps.forEach(o -> System.out.println(o.getEname()));
//        List<Integer> list = new LinkedList<>();
//        list.add(30);
//        list.add(35);
//        List<emp> emps = empMapper.getEmp30(list);
//        emps.forEach(obj -> System.out.println("迭代集合元素1:" + obj.getEname()));
//        List<emp> list = new LinkedList<>();
//        for (int i = 0; i <2 ; i++) {
//            emp emp = new emp();
//            emp.setEname("王扶摇");
//            emp.setEmpno(15116
//            +i*2+1);
//            list.add(emp);
//        }
//        int i = empMapper.insetEmp(list);
//sqlSession.commit();
//        System.out.println(i);
//sqlSession.rollback();

//        List<emp> emps1 = empMapper.getEmpJob();
//        emps1.forEach(obj -> System.out.println("迭代集合元素2:" + obj.getEname()));
//        List<emp> emps2 = empMapper.getEmpComm();
//        emps2.forEach(obj -> System.out.println("迭代集合元素3:" + obj.getEname()));
        //大写A变小写a
//        List<emp> emps3 = empMapper.getEmpName();
//       emps3.stream()
//               .map(x->x.getEname().replace("A","a"))
//       .forEach(obj -> System.out.println("迭代集合元素4:" + obj));
//
//      empMapper.getEmpName1();
//
//      empMapper.getEmpLastDay().
//              forEach(obj -> System.out.println("迭代集合元素5:" + obj.getEname()+" "+obj.getHiredate()));

        //出不带R的员工
//      empMapper.getEmpRepR().
//              forEach(obj -> System.out.println("迭代集合元素6:" + obj.getEname()));
////工资比SMITH高的员工
//        empMapper.getEmpsal().
//                forEach(obj -> System.out.println("迭代集合元素7:" + obj.getEname()));

//  deptMapper deptMapper = sqlSession.getMapper(deptMapper.class);

        // deptMapper.findDeptSales("SALES").GET;
//        bookMapper bookMapper = sqlSession.getMapper(bookMapper.class);
//
//        book book = bookMapper.selectAllBooksCategoryByBid("SQL技术");
//        categoryMapper categoryMapper = sqlession.getMapper(categoryMapper.class);
//        category category = categoryMapper.selectAllCategoriesBookByBid(1);
//        category.getBooks().forEach(o -> System.out.println(o.getBname()));




//        System.out.println(book.getBname());
//        book.getCategories().forEach(o-> System.out.println(o.getCname()));
        //forEach(o-> System.out.println("C++和java对比的相关："+o.getCname()));


        sqlSession.close();

    }


}
