import java.util.List;

public interface deptMapper {

    public dept findDeptByDeptno(int deptno);
    public dept findDeptSales(String dname);
}
