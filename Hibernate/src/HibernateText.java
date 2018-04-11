import com.sun.xml.internal.ws.wsdl.writer.document.Import;
import org.hibernate.*;
import org.hibernate.boot.jaxb.SourceType;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HibernateText {


    public static void main(String[] args) {
        SessionFactory sessions = new Configuration().configure().buildSessionFactory();
        Session session = sessions.openSession();
        Transaction tx = null;

        try {


        tx = session.beginTransaction();
        Tb_record t = new Tb_record();
//        t.setClass_name("软件1701");
//        t.setMessage("新生入学");
//        t.setPatroller_id(new Integer(3));
//        t.setStudent_name("张某某");
//        t.setStudent_number("1711541110");
//        t.setStu_portrait("http://192.168.191.1:8081/images/3/15IMG_20170721_113211.png");
//       t.setRecord_id(100);
//        System.out.println("开始插入到数据库");
//        session.save(t);
            String hql = "from Tb_record t where t.record_id like ?";
            Query query = session.createQuery(hql);
            query.setParameter(0,100);
            List list = query.list();
            Iterator it = list.iterator();
            while (it.hasNext()){
                Tb_record t1 = (Tb_record) it.next();
                System.out.println(t1.getStudent_name());
            }






//            Tb_record tn = session.load(Tb_record.class,new Integer(100));
//
//        System.out.println("从数据库加载的用户名为 " +tn.getStudent_name());
        tx.commit();
        tx=null;
        System.out.println("运行成功");
        }catch (HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
        }


    }
}
