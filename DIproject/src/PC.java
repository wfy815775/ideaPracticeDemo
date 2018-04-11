public class PC {

    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Comsumer(q);

        System.out.println("结束");
    }
}
