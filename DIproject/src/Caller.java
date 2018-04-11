public class Caller implements Runnable {
String msg;
Callme target;
Thread t;

    public Caller( Callme target,String msg) {
        this.msg = msg;
        this.target = target;
        t= new Thread(this);
        t.start();
    }

    @Override
    public void run() {
    // synchronized (target) {

         try {
             target.call(msg);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

//     }

    }
}
