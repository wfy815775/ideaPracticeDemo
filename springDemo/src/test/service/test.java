package test.service;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ForumService;
import service.ForumServiceImpl;
import service.MonitorImpl;
import service.Monitorable;

public class test {

@Test
    public void AutoProxyCreater(){
    PropertyConfigurator.configure("F:\\springDemo\\src\\resources\\log4j");
    ApplicationContext context = new ClassPathXmlApplicationContext("bean2");
    ForumService forumServices = (ForumServiceImpl) context.getBean("ForumServiceProxy");
    Monitorable monitor= (Monitorable) forumServices;
    monitor.setMonitorAdvice(true);
    forumServices.removeForum(20);
    forumServices.removeTopic(20);


}



}
