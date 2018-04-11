package test.service;


import bean.Services;
import bean.stu;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import service.*;


import javax.annotation.Resource;
import java.lang.reflect.Proxy;


@ContextConfiguration("classpath:bean1")
public class stuText {
    @Resource(name = "services") Services ser;
    @Autowired stu stu;
    @Test
    public void s() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1");
        System.out.println(stu.getId());

//        student s = context.getBean("student",student.class);
//        classes c = context.getBean("classes",classes.class);
//        System.out.println(c.getNumOfStu()+" "+c.getStu().getGrage());

    }

//    @Test
//    public void a() {
//        BeanFactory bf = new ClassPathXmlApplicationContext("ApplicationContext");
//        car hongqi = bf.getBean("hongqi", car.class);
//        hongqi.toString();
//    }

//    @Test
//    public void b() {
//        //PropertyConfigurator.configure("F:\\springDemo\\src\\resources\\log4j");
//        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext");
////        zoo zoo = context.getBean("zoo", DAO.zoo.class);
////        tigger tigger = context.getBean("tigger", DAO.tigger.class);
////        System.out.println(zoo.getTigger().getName());\
//        classes classes = context.getBean("classes", DAO.classes.class);
//        classes.getCar().toString();
//        System.out.println(classes.getList().getClass().toString());
//
//    }
//
//
//    @Test
//
//    public void ListText() throws Exception {
//        PropertyConfigurator.configure("F:\\springDemo\\src\\resources\\log4j");
//        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext");
//        classes classes = context.getBean("classes", DAO.classes.class);
////        classes.getList().add(0);
////        classes.getList().add(1);
////        classes.getList().add(2);
//
//        System.out.println(classes.getList().toString());
////        classes classes = new classes();
////        classes.getList().add(0);
////        classes.getList().add(1);
////        classes.getList().add(2);
////        System.out.println(classes.getList().toString());
//
//    }
//
//    @Test
//    public void zooTest() {
//        //  PropertyConfigurator.configure("F:\\springDemo\\src\\resources\\log4j");
//        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext");
//        zoo zoo = context.getBean("zoo", DAO.zoo.class);
//        System.out.println(zoo.getList().toString());
//    }

    @Test
    public void jdkproxy() {


        ForumService fs = new ForumServiceImpl();
        PerformenceHandler ph = new PerformenceHandler(fs);

        ForumService proxy = (ForumService) Proxy.newProxyInstance(fs.getClass().getClassLoader(),
                fs.getClass().getInterfaces(),
                ph);

        proxy.removeTopic(10);
        proxy.removeForum(12);
    }

    @Test
    public void cglibProxy() {
        cglibProxy cglibProxy = new cglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl) cglibProxy.getProxy(ForumServiceImpl.class);
        forumService.removeTopic(20);
        forumService.removeForum(20);
    }

    @Test
    public void springAopText() {
        ForumService forumService = new ForumServiceImpl();
        BeforeAdvice bf = new MonitorBeforeAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(forumService);
        proxyFactory.addAdvice(bf);

        ForumService proxy = (ForumService) proxyFactory.getProxy();
        proxy.removeForum(20);
        proxy.removeTopic(20);
    }

    @Test
    public void springAop() {
        PropertyConfigurator.configure("F:\\springDemo\\src\\resources\\log4j");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1");
        ForumService forumService = (ForumService) context.getBean("ForumService");
        forumService.removeTopic(20);
        forumService.removeForum(20);
        forumService.ThrowExc(20);
    }

    @Test
    public void IntroduceTest() {
        PropertyConfigurator.configure("F:\\springDemo\\src\\resources\\log4j");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1");
        ForumService forumService = (ForumService) context.getBean("ForumService");
        forumService.removeTopic(20);
        forumService.removeForum(20);

        Monitorable monitorable = (Monitorable) forumService;
        monitorable.setMonitorAdvice(true);
        forumService.removeTopic(20);
        forumService.removeForum(20);
    }
    @Test
   public  void  advisosr(){
        PropertyConfigurator.configure("F:\\springDemo\\src\\resources\\log4j");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1");
        ForumService forumServices =(ForumService) context.getBean("removeTopic");
        forumServices.removeTopic(20);
        forumServices.removeForum(20);
    }
    @Test
    public  void  DynamicAdvisosr(){
        PropertyConfigurator.configure("F:\\springDemo\\src\\resources\\log4j");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1");
        ForumService forumServices =(ForumService) context.getBean("removeFormu");
        forumServices.removeTopic(20);
        forumServices.removeForum(20);
        forumServices.removeForum(21);
    }


}
