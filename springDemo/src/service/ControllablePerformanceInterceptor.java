package service;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class ControllablePerformanceInterceptor
        extends DelegatingIntroductionInterceptor implements Monitorable {
    private ThreadLocal<Boolean> monitorSatus =new   ThreadLocal<>();
    private int a;
    @Override
    public void setMonitorAdvice(boolean active) {
      monitorSatus.set(active);
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj = null;
        if (monitorSatus.get()!=null && monitorSatus.get()){
            PerformanceMonitor.begin(mi.getClass().getName()+"."+mi.getMethod().getName());
            obj = super.invoke(mi);
            PerformanceMonitor.end();
        }else {
            obj = super.invoke(mi);
        }
        return obj;
    }
}
