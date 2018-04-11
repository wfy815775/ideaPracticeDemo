package concurrent;

import java.util.concurrent.Exchanger;

public class EXgrdemo {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        new UseString(ex);
        new makeString(ex);
    }
}
