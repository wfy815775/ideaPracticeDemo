package concurrent;

public class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("完成");
    }
}
