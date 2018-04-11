import java.util.List;

public class book {
    private int bid;
    private int cid;

    private String bname;
    private List<category> categories;
    private middle middle;
    public middle getMiddle() {
        return middle;
    }


    public void setMiddle(middle middle) {
        this.middle = middle;
    }


    public List<category> getCategories() {
        return categories;
    }

    public void setCategories(List<category> categories) {
        this.categories = categories;
    }


    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
