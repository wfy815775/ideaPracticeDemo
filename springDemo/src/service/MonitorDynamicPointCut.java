package service;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class MonitorDynamicPointCut extends DynamicMethodMatcherPointcut {

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> aClass) {
                System.out.println("调用getClassFilter对 "+aClass.getName()+" 做静态检查");
                if (ForumService.class.isAssignableFrom(aClass)){
                    System.out.println("类名称匹配正确");
                return true;
                }else {
                    System.out.println("类名称匹配错误");
                return false;}
            }
        };
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        System.out.println("调用matches对 "+targetClass.getName()+"."+method.getName()+" 做静态检查");
        if ("removeForum".equals(method.getName()))
        {
            System.out.println("方法名匹配正确");
        return true;
        }else {
            System.out.println("方法名匹配错误");
            return false;}
    }

    @Override
    public boolean matches(Method method, Class<?> aClass, Object... objects) {
        System.out.println("调用matches对 "+aClass.getClass().getName()+"."+aClass.getName()+" 做动态检查");

        if (objects[0].equals(20)){
            System.out.println("运行时检查正确，入参匹配成功"+ objects[0]);
            return true;
        }else {
            System.out.println("运行时检查错误，入参匹配失败"+ objects[0]);
            return false;
        }

    }
}
