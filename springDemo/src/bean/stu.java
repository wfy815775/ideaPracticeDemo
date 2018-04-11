package bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("stu")
public class stu {

    private int id=151;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
