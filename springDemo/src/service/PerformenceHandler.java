package service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformenceHandler implements InvocationHandler {
    private Object object;

    public PerformenceHandler(Object object) {

        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(object.getClass().getName()+"."+method.getName());
        Object obj = method.invoke(object,args);
        PerformanceMonitor.end();
        return obj;
    }
}
