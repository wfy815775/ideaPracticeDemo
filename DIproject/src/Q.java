/*
如果生产者在消费者消费完一次n前又要继续生产n，那么此时生产者的valueSet仍然为false，
在生产者的put方法里面会首先判断valueSet的状态此时通过判断就会进入到while里面，执行wait方法，此时调用该wait
方法的生产者线程就会进入休眠状态，那么生产者线程就放弃了监视器,
而消费者线程由于调用同一个Q对象就会进入到监视器中执行put方法，待put方法执行到notidy时,就会唤醒调用Q对象方法的
生产者线程，生产者线程就会继续执行生产工作。循环往复。
反之消费者在消费过一次后生产者没有执行完put方法是，也会进行上免所说的过程
同过 wait和notify 生产者和消费者保持了同步，避免了轮训检测，节省CPU的时间
但是由于有假唤醒 这样的小概率时间讯在，最好在一个判断线程等待条件的循环中调用wait方法。

 */


public class Q {

    int n;
    boolean valueSet = false;


    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Got:" + n);
        valueSet = false;
        notify();

        return n;
    }

    synchronized int put(int n) {
        this.n = n;
        while (valueSet) {
            try {
                wait();//通知调用线程放弃监视器并进入休眠，直到其他线成进入同一个监视器（也就是调用了同一个对象）
                //并且调用notfy 或者notifyAll方法，该线程才会继续执行，
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        System.out.println("Put:" + n);
        valueSet = true;

        notify(); //唤醒了调用同一对象的wait方法的线程
        return n;

    }
}
