package bean;

import bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.lang.annotation.Target;


@Service("services")
public class Services {

    @Autowired
    private stu stu;
    public void say(){

        System.out.println(stu.getId());
    }

}
