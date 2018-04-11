public class Synch1 {
    public static void main(String[] args) {
        Callme target = new Callme();

        Caller ob1 = new Caller(target,"你好");
        Caller ob2 = new Caller(target,"王");
        Caller ob3 = new Caller(target,"扶摇");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
