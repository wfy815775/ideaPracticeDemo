package concurrent;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es  = Executors.newFixedThreadPool(3);

        Future<Integer> f1;
        Future<Double> f2;

        System.out.println("start");

        f1 = es.submit(new Sum(10));
        f2 =es.submit(new Hypoy(3,4));


        try {
            System.out.println(f1.get(10,TimeUnit.MILLISECONDS));
            System.out.println(f2.get(10,TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        es.shutdown();

        System.out.println("Done");

    }
}

class Sum implements Callable<Integer>{
    int stop;

    public Sum(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0 ;

        for (int i = 0; i <=stop ; i++) {
            sum+=i;
        }
        return sum;
    }
}

class Hypoy implements  Callable<Double>{
double side1,side2;

    public Hypoy(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double call() throws Exception {

        return Math.sqrt((side1*side2)+(side1*side2));
    }
}