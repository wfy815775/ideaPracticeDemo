package concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
//在真正的多核心电脑上运行貌似不好用了

public class BarDemo {

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(2,new BarAction());
        System.out.println("开始");
        new mycThread(cb,"A");
        new mycThread(cb,"B");
        new mycThread(cb,"C");

        new mycThread(cb,"D");
        new mycThread(cb,"E");
        new mycThread(cb,"F");

    }







}
