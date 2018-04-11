package concurrent;

import java.lang.invoke.LambdaConversionException;
import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{

    CountDownLatch countDownLatch;
        String name;
    public MyThread(CountDownLatch countDownLatch,String name) {
        this.countDownLatch = countDownLatch;
        this.name = name;
        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name+" "+i);
            countDownLatch.countDown();
        }
    }
}
