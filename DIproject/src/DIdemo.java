import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class DIdemo {
    public DIdemo(){}

            int i;
    @Bean
    DIdemo idemo;

    public DIdemo(DIdemo idemo, String wangfuyao, String sunbo) {
        this.idemo = idemo;
        this.wangfuyao = wangfuyao;
        this.sunbo = sunbo;
    }


    public String wangfuyao;
    public String sunbo;

    public String getWangfuyao() {
        return wangfuyao;
    }

    public void setWangfuyao(String wangfuyao) {
        this.wangfuyao = wangfuyao;
    }

    public String getSunbo() {
        return sunbo;
    }

    public void setSunbo(String sunbo) {
        this.sunbo = sunbo;
    }

    public void sayHello(String name){
        System.out.println("你好"+name);
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

DIdemo dIdemo = new DIdemo();
        try {
            AnnoTool.getClazz(dIdemo);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        dIdemo.idemo.setWangfuyao("王扶摇");

        System.out.println(dIdemo.idemo.getWangfuyao());

    }




}
