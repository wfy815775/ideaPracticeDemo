package service;

public class MethodProformance {
    private long begin;
    private long end;
    private String serviceMethod;

    public MethodProformance(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }

    public void printPerformance(){
        end = System.currentTimeMillis();
        long elapse = end - begin;
        System.out.println(serviceMethod+"花费 " +elapse+"毫秒");
    }
}
