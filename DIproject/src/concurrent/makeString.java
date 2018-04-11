package concurrent;

import java.util.concurrent.Exchanger;

public class makeString implements Runnable{
    Exchanger<String> ex;
    String str;

    public makeString(Exchanger<String> ex) {
        this.ex = ex;
        str = new String();
        new Thread(this).start();
    }

    @Override
    public void run() {
      char ch ='A';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str+=ch++;
            }


            try {
                str= ex.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
