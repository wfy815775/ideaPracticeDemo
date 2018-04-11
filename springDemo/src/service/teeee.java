package service;

import bean.*;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


public class teeee {

    public static void main(String[] args) {
        PropertyConfigurator.configure("F:\\springDemo\\src\\resources\\log4j");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1");
       Services services = (Services) context.getBean("services");
       services.say();

    }
}
