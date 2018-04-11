package concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExec {

    public static void main(String[] args) {

        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(6);

        ExecutorService ex = Executors.newFixedThreadPool(2);


        ex.execute(new MyThread(cd1,"A"));
        ex.execute(new MyThread(cd2,"B"));
        ex.execute(new MyThread(cd3,"C"));
        ex.execute(new MyThread(cd4,"D"));

        try {
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ex.shutdown();

        System.out.println("结束");

    }
}
