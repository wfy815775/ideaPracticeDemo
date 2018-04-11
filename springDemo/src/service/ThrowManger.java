package service;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ThrowManger implements ThrowsAdvice {
    public void afterThrowing(Method method,Object[] args,Object target,Exception ex) throws Throwable{
        System.out.println("发生异常 "+method.getName());
        System.out.println("异常类 "+target.getClass().getName());
        System.out.println("处理成功，异常名 "+ex.getMessage());
    }
}
