package service;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MonitorBeforeAdvice implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        int id = (int)objects[0];
        System.out.println("准备监听，id:"+id);
    }
}
