package concurrent;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable{
    Exchanger<String> ex;
    String str;


    public UseString(Exchanger<String> ex) {
        this.ex = ex;
        new  Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            try {
                str = ex.exchange(new String());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("Gaot"+str);
        }
    }
}
