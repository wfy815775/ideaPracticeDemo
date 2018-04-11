package service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


public class PerformanceMonitor {
    private static ThreadLocal<MethodProformance> performanceRecord = new ThreadLocal<>();

  //  @Before("execution(* removeTopic(..))")
    protected static void begin(String method){
        System.out.println("begin monitor");
        MethodProformance mp = new MethodProformance(method);
        performanceRecord.set(mp);
    }
   // @After("execution(*removeTopic(..))")
    protected static void end(){
        System.out.println("end monitor");
        MethodProformance mp = performanceRecord.get();

        mp.printPerformance();
    }

}
