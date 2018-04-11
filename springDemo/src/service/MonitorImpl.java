package service;

public class MonitorImpl implements Monitorable{
    @Override
    public void setMonitorAdvice(boolean active) {
        if (active)
        System.out.println("开启监控");
        else
            System.out.println("关闭监控");
    }
}
