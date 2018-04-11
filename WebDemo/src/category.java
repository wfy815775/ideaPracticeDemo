import java.util.LinkedList;
import java.util.List;

public class category {
    private int cid;
    private String cname;
    private middle middle;
    private int bb;


    public List<book> getBooks() {
        return books;
    }

    public void setBooks(List<book> books) {
        this.books = books;
    }

    private List<book> books;

    public middle getMiddle() {
        return middle;
    }

    public void setMiddle(middle middle) {
        this.middle = middle;
    }

    private List<middle> middles;

    public List<middle> getMiddles() {
        return middles;
    }

    public void setMiddles(List<middle> middles) {
        this.middles = middles;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
