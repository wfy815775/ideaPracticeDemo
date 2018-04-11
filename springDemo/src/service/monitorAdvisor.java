package service;


import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

public class monitorAdvisor extends StaticMethodMatcherPointcutAdvisor {
    @Override
    public boolean matches(Method method, Class<?> aClass) {

        return "removeTopic".equals(method.getName());
    }

    @Override
    public ClassFilter getClassFilter() {
      return new ClassFilter() {
          @Override
          public boolean matches(Class<?> aClass) {
              return ForumService.class.isAssignableFrom(aClass);
          }
      };
    }
}
