import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface empMapper {
    public emp getEmps(@Param(value = "empno")int empno);
    public List<emp> getEmp30(@Param(value = "list")List<Integer> list);
    public List<emp> getEmpJob();
    public List<emp> getEmpComm();
    public List<emp> getEmpName();
    public void getEmpName1();
    public List<emp> getEmpLastDay();
    public List<emp>  getEmpRepR();
    public int  insetEmp(@Param(value = "list")List<emp> list);
}
