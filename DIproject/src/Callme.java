public class Callme {

   synchronized void  call(String msg) throws InterruptedException{
        System.out.print("{"+msg);
        Thread.sleep(1000);
        System.out.print("}");
    }
}
