package service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class MonitorAbleAspect {
    @DeclareParents(value = "service.service.ForumServiceImpl", defaultImpl = service.MonitorImpl.class)
    public Monitorable monitorable;
}
