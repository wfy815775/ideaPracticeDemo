package concurrent;

import java.util.concurrent.CountDownLatch;

public class CDLdemo {

    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("开始");
//        new MyThread(cdl);
        try {
            cdl.await();//暂停了主线程的执行，为了等待释放锁存器
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("结束");

    }
}
