public class Comsumer implements Runnable {
Q q;

    public Comsumer(Q q) {
        this.q = q;
        new Thread(this,"comsumer").start();

    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}
