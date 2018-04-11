import javax.sound.midi.Soundbank;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;

public class AnnoTool {

    public AnnoTool() {

    }

    public static void getClazz(DIdemo dIdemo) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class aClass = null;

            aClass = dIdemo.getClass();


        Field[] fields = aClass.getDeclaredFields();
        for (Field field:fields) {

            if (field.getAnnotation(Bean.class)!=null) {
                System.out.println(field);
                DIdemo o = (DIdemo) aClass.newInstance();
                dIdemo.idemo =o;

            }
        }



//        if (aClass.isAnnotationPresent(Bean.class)){
//          o   = aClass.newInstance();
//
//        }



    }
}
