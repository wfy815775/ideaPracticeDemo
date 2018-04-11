package concurrent;

import java.util.concurrent.Semaphore;

public class DecThread implements Runnable {

    String name ;
    Semaphore sem;


    public DecThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;

        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("开始"+name);



            System.out.println(name+"正在准备请求信号量");

        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name+"得到了信号量");

        for (int i = 5; i >0 ; i--) {
            Shared.count--;

            System.out.println(name+":"+ Shared.count);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {


            }
        }

        System.out.println(name+"释放信号量"+ sem.getQueueLength());
        sem.release();
    }

}
